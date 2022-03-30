package com.isekai.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isekai.models.UserRole;
import com.isekai.repos.UserRoleRepository;

@Service
@Transactional
public class UserRoleService {
	@Autowired
	UserRoleRepository repo;
	
	public List<UserRole> listAll(){
		return (List<UserRole>) repo.findAll();
	}
	
	public UserRole get(int id) {
		Optional<UserRole> result = repo.findById(id);
		return result.get();
	}
	public void save(UserRole userRole) {
		repo.save(userRole);
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}
