package com.isekai.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isekai.models.Brand;
import com.isekai.repos.BrandRepository;

@Service
@Transactional
public class BrandService {
	@Autowired
	BrandRepository repo;
	
	public List<Brand> listAll(){
		return (List<Brand>) repo.findAll();
	}
	
	public Brand get(int id) {
		Optional<Brand> result = repo.findById(id);
		return result.get();
	}
	public void save(Brand brand) {
		repo.save(brand);
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}
