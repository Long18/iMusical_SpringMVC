package com.isekai.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.collection.internal.PersistentBag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isekai.models.Brand;
import com.isekai.models.Product;
import com.isekai.repos.BrandRepository;

@Service
@Transactional
public class BrandService {
	@Autowired
	BrandRepository repo;
	
	@PersistenceContext
	EntityManager entityManager;
	
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
	
	public List<Product> getListTypeDetailByProductId(Brand brand) {
		if (brand.getProducts() instanceof PersistentBag || brand.getProducts() == null) {

			List<Product> listProducts = entityManager
					.createQuery("SELECT detail FROM Product product WHERE brand_id = :brand_id", Product.class)
					.setParameter("product_id", brand.getId()).getResultList();
			entityManager.close();
			brand.setProducts(listProducts);
			return listProducts;
		} else {
			return brand.getProducts();
		}
	}
}
