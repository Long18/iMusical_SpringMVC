package com.isekai.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isekai.models.Type;
import com.isekai.repos.TypeRepository;

@Service
@Transactional
public class TypeService {
	@Autowired
	TypeRepository repo;
	
	public List<Type> listAll(){
		return (List<Type>) repo.findAll();
	}
	
	public Type get(int id) {
		Optional<Type> result = repo.findById(id);
		return result.get();
	}
	public void save(Type type) {
		repo.save(type);
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}
