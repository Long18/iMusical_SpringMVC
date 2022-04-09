package com.isekai.service;

import java.util.ArrayList;
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
import com.isekai.models.ProductImage;
import com.isekai.models.TypeDetail;
import com.isekai.repos.ProductRepository;

@Service
@Transactional
public class ProductService {
	@Autowired
	ProductRepository repo;

	@PersistenceContext
	@Qualifier(value = "entityManager")
	EntityManager entityManager;

	public List<Product> listAll() {
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

	public List<ProductImage> getListImageByProductId(Product product) {
		if (product.getProductImages() instanceof PersistentBag || product.getProductImages() == null) {

			List<ProductImage> listImage = entityManager
					.createQuery("SELECT img FROM ProductImage img WHERE product_id = :product_id", ProductImage.class)
					.setParameter("product_id", product.getId()).getResultList();
			entityManager.close();
			product.setProductImages(listImage);
			return listImage;
		} else {
			return product.getProductImages();
		}
	}
	
	public List<TypeDetail> getListTypeDetailByProductId(Product product) {
		if (product.getTypeDetails() instanceof PersistentBag || product.getTypeDetails() == null) {

			List<TypeDetail> listTypeDetails = entityManager
					.createQuery("SELECT detail FROM TypeDetail detail WHERE product_id = :product_id", TypeDetail.class)
					.setParameter("product_id", product.getId()).getResultList();
			entityManager.close();
			product.setTypeDetails(listTypeDetails);
			return listTypeDetails;
		} else {
			return product.getTypeDetails();
		}
	}
	
	public List<Product> getListTopSeller() {
		
		List<Object[]> listTopSeller = entityManager
				.createQuery("SELECT detail.product.id AS id, SUM(detail.order_detail_quantity) AS product_count FROM OrderDetail AS detail GROUP BY detail.product.id ORDER BY product_count desc")
				.getResultList();
		List<Product> listProducts = new ArrayList<Product>();
		for (Object[] item : listTopSeller) {
			listProducts.add(get((int) item[0]));
		}
		entityManager.close();
		return listProducts;
}
}
