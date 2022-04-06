package com.isekai.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.collection.internal.PersistentBag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isekai.models.Brand;
import com.isekai.models.Product;
import com.isekai.models.UserRole;
import com.isekai.repos.UserRoleRepository;

@Service
@Transactional
public class UserRoleService {
	@Autowired
	UserRoleRepository repo;
	
	@PersistenceContext
	EntityManager entityManager;
	
	public List<UserRole> listAll(){
		return (List<UserRole>) repo.findAll();
	}
	
	public void save(UserRole userRole) {
		repo.save(userRole);
	}
	
	public void delete(UserRole userRole) {
		repo.delete(userRole);
	}
	
	public UserRole getUserRoleByPK(int userId, int roleId) {

			UserRole userRole = entityManager
					.createQuery("FROM UserRole WHERE userRoleId.user.id = :user_id and userRoleId.role.id = :role_id", UserRole.class)
					.setParameter("user_id", userId)
					.setParameter("role_id", roleId)
					.getSingleResult();
			entityManager.close();
			
			return userRole;
	}
}
