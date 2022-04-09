package com.isekai.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.collection.internal.PersistentBag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isekai.models.Order;
import com.isekai.models.OrderDetail;
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
	
	@PersistenceContext
	EntityManager entityManager;
	
	public List<OrderDetail> getListOrderDetailByOrderId(Order order) {
		if (order.getOrderDetails() instanceof PersistentBag || order.getOrderDetails() == null) {

			List<OrderDetail> listOrderDetails = entityManager
					.createQuery("FROM OrderDetail WHERE order.id = :order_id", OrderDetail.class)
					.setParameter("order_id", order.getId()).getResultList();
			entityManager.close();
			order.setOrderDetails(listOrderDetails);
			return listOrderDetails;
		} else {
			return order.getOrderDetails();
		}
	}
}

