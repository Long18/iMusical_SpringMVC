package com.isekai.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isekai.models.Order;
import com.isekai.repos.OrderRepository;

@Service
@Transactional
public class OrderService {
	@Autowired
	OrderRepository repo;
	
	public List<Order> listAll(){
		return (List<Order>) repo.findAll();
	}
	
	public Order get(int id) {
		Optional<Order> result = repo.findById(id);
		return result.get();
	}
	public void save(Order order) {
		repo.save(order);
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
}

