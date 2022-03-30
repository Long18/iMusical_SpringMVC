package com.isekai.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isekai.models.BrandImage;
import com.isekai.repos.BrandImageRepository;

@Service
@Transactional
public class BrandImageService {
	@Autowired
	BrandImageRepository repo;
	
	public List<BrandImage> listAll(){
		return (List<BrandImage>) repo.findAll();
	}
	
	public BrandImage get(int id) {
		Optional<BrandImage> result = repo.findById(id);
		return result.get();
	}
	public void save(BrandImage brandImage) {
		repo.save(brandImage);
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}
