package com.isekai.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isekai.models.Product;
import com.isekai.repos.ProductRepository;

@Service
@Transactional
public class ProductService {
	@Autowired
	ProductRepository repo;
	
	public List<Product> listAll(){
		return (List<Product>) repo.findAll();
	}
	
	public Product get(int id) {
		Optional<Product> result = repo.findById(id);
		return result.get();
	}
	public void save(Product product) {
		repo.save(product);
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}
