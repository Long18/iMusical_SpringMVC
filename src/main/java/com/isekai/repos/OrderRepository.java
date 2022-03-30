package com.isekai.repos;

import org.springframework.data.repository.CrudRepository;

import com.isekai.models.Order;

public interface OrderRepository extends CrudRepository<Order, Integer>{

}
