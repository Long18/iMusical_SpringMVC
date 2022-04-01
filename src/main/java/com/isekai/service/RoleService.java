package com.isekai.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isekai.models.Role;
import com.isekai.repos.RoleRepository;

@Service
@Transactional
public class RoleService {
	@Autowired
	RoleRepository repo;
	
	public List<Role> listAll(){
		return (List<Role>) repo.findAll();
	}
	
	public Role get(int id) {
		Optional<Role> result = repo.findById(id);
		return result.get();
	}
	public void save(Role role) {
		repo.save(role);
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}
