package com.isekai.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isekai.models.ProductImage;
import com.isekai.repos.ProductImageRepository;

@Service
@Transactional
public class ProductImageService {
	@Autowired
	ProductImageRepository repo;
	
	public List<ProductImage> listAll(){
		return (List<ProductImage>) repo.findAll();
	}
	
	public ProductImage get(int id) {
		Optional<ProductImage> result = repo.findById(id);
		return result.get();
	}
	public void save(ProductImage productImage) {
		repo.save(productImage);
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}