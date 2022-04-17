package com.isekai.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.collection.internal.PersistentBag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isekai.models.Cart;
import com.isekai.models.Order;
import com.isekai.models.OrderDetail;
import com.isekai.models.Product;
import com.isekai.models.User;
import com.isekai.repos.CartRepository;

@Service
@Transactional
public class CartService {
	@Autowired
	CartRepository repo;

	@PersistenceContext
	EntityManager entityManager;

	public List<Cart> listAll() {
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

	public List<Cart> getCartByUser(User user) {
		List<Cart> ListCarts = entityManager.createQuery("FROM Cart WHERE user_id = :user_id", Cart.class)
				.setParameter("user_id", user.getId()).getResultList();
		entityManager.close();
		return ListCarts;
	}
	
	public List<Cart> getSelectedCartByUser(User user) {
		List<Cart> ListCarts = entityManager.createQuery("FROM Cart WHERE user_id = :user_id and isSelected = 1", Cart.class)
				.setParameter("user_id", user.getId()).getResultList();
		entityManager.close();
		return ListCarts;
	}

	public Cart getById(User user, Product product) {
		Cart ListCarts = entityManager
				.createQuery("FROM Cart WHERE user_id = :user_id AND product_id = :product_id", Cart.class)
				.setParameter("user_id", user.getId()).setParameter("product_id", product.getId()).getSingleResult();
		entityManager.close();
		return ListCarts;
	}
	
	public int delById(User user, Product product) {
		int result = entityManager
				.createQuery("DELETE FROM Cart WHERE user_id = :user_id AND product_id = :product_id")
				.setParameter("user_id", user.getId()).setParameter("product_id", product.getId()).executeUpdate();
		entityManager.close();
		return result;
	}
}
