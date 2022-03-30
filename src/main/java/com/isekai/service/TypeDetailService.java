package com.isekai.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isekai.models.TypeDetail;
import com.isekai.repos.TypeDetailRepository;

@Service
@Transactional
public class TypeDetailService {
	@Autowired
	TypeDetailRepository repo;
	
	public List<TypeDetail> listAll(){
		return (List<TypeDetail>) repo.findAll();
	}
	
	public TypeDetail get(int id) {
		Optional<TypeDetail> result = repo.findById(id);
		return result.get();
	}
	public void save(TypeDetail typeDetail) {
		repo.save(typeDetail);
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}
