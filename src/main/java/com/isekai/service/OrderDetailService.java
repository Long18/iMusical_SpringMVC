package com.isekai.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.collection.internal.PersistentBag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.isekai.models.OrderDetail;
import com.isekai.models.Product;
import com.isekai.models.User;
import com.isekai.models.OrderDetail;
import com.isekai.repos.OrderDetailRepository;

@Service
@Transactional
public class OrderDetailService {
	@Autowired
	OrderDetailRepository repo;
	
	@PersistenceContext
	@Qualifier(value = "entityManager")
	EntityManager entityManager;
	
	public List<OrderDetail> listAll(){
		return (List<OrderDetail>) repo.findAll();
	}
	
	public OrderDetail get(int id) {
		Optional<OrderDetail> result = repo.findById(id);
		return result.get();
	}
	public void save(OrderDetail orderDetail) {
		repo.save(orderDetail);
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
	
	
}
