package com.isekai.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isekai.models.Cart;
import com.isekai.repos.CartRepository;

@Service
@Transactional
public class CartService {
	@Autowired
	CartRepository repo;
	
	public List<Cart> listAll(){
		return (List<Cart>) repo.findAll();
	}
	
	public Cart get(int id) {
		Optional<Cart> result = repo.findById(id);
		return result.get();
	}
	public void save(Cart cart) {
		repo.save(cart);
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}
