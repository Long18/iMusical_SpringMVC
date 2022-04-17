package com.isekai.service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.collection.internal.PersistentBag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.isekai.models.Cart;
import com.isekai.models.ProductImage;
import com.isekai.models.User;
import com.isekai.models.UserRole;
import com.isekai.repos.UserRepository;

@Service
@Transactional
public class UserService {
	@Autowired
	UserRepository repo;

	@PersistenceContext
	@Qualifier(value = "entityManager")
	EntityManager entityManager;

	public List<User> listAll() {
		return (List<User>) repo.findAll();
	}

	public User get(int id) {
		Optional<User> result = repo.findById(id);
		return result.get();
	}

	public void save(User user) {
		repo.save(user);
	}

	public void delete(int id) {
		repo.deleteById(id);
	}

	public User getUserLogin(String email, String pass) {

		User user = entityManager
				.createQuery("FROM User WHERE user_email = :user_email and password = :password",
						User.class)
				.setParameter("user_email", email)
				.setParameter("password", pass)
				.getSingleResult();
		entityManager.close();
		return user;
	}
	
	public List<UserRole> getListUserRoleByUserId(User user) {
		if (user.getUserRoles() instanceof PersistentBag || user.getUserRoles() == null) {

			List<UserRole> listImage = entityManager
					.createQuery("FROM UserRole WHERE user_id = :user_id", UserRole.class)
					.setParameter("user_id", user.getId()).getResultList();
			entityManager.close();
			user.setUserRoles(listImage);
			return listImage;
		} else {
			return user.getUserRoles();
		}
	}
	
	public List<Cart> getListCartByUserId(User user) {
		if (user.getCarts() instanceof PersistentBag || user.getCarts() == null) {

			List<Cart> listImage = entityManager
					.createQuery("FROM Cart WHERE user_id = :user_id", Cart.class)
					.setParameter("user_id", user.getId()).getResultList();
			entityManager.close();
			user.setCarts(listImage);
			return listImage;
		} else {
			return user.getCarts();
		}
	}

	public static String getMd5(String input)
    {
        try {
  
            // Static getInstance method is called with hashing MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
  
            // digest() method is called to calculate message digest
            //  of an input digest() return array of byte
            byte[] messageDigest = md.digest(input.getBytes());
  
            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);
  
            // Convert message digest into hex value
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

}
