package com.isekai.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isekai.models.User;
import com.isekai.repos.UserRepository;

@Service
@Transactional
public class UserService {
	@Autowired
	UserRepository repo;
	
	public List<User> listAll(){
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
}
