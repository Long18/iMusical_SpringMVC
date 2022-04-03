package com.isekai.service;

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

import com.isekai.models.Product;
import com.isekai.models.ProductImage;
import com.isekai.models.User;
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
				.createQuery("SELECT user FROM User user WHERE user_email = :user_email and password = :password",
						User.class)
				.setParameter("user_email", email).setParameter("password", pass).getSingleResult();
		entityManager.close();
		return user;
	}

	public static String getMD5(String data) throws NoSuchAlgorithmException {
		MessageDigest messageDigest = MessageDigest.getInstance("MD5");

		messageDigest.update(data.getBytes());
		byte[] digest = messageDigest.digest();
		StringBuffer sb = new StringBuffer();
		for (byte b : digest) {
			sb.append(Integer.toHexString((int) (b & 0xff)));
		}
		return sb.toString();
	}

}
