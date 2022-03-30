package com.isekai.repos;

import org.springframework.data.repository.CrudRepository;

import com.isekai.models.Product;


public interface ProductRepository extends CrudRepository<Product, Integer>{

}
