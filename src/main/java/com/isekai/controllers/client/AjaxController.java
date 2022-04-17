package com.isekai.controllers.client;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.isekai.models.Cart;
import com.isekai.models.CartId;
import com.isekai.models.Product;
import com.isekai.models.User;
import com.isekai.models.ajaxCartData;
import com.isekai.service.CartService;
import com.isekai.service.ProductService;
import com.isekai.service.UserService;

@Controller
@RequestMapping("/api")
public class AjaxController {
	
	@Autowired
	CartService cartService;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	UserService userService;

	@ResponseBody
	@RequestMapping(value = "/update-cart")
	public String updateCart(@RequestParam("userId") int userId,
			@RequestParam("productId") int productId,
			@RequestParam("val") int value,
			@RequestParam("isSelected") Boolean isSelected) {
		
		User user = userService.get(userId);
		Product product = productService.get(productId);
		Cart cart = cartService.getById(user, product);
		
		cart.setValue(value);
		cart.setIsSelected(isSelected);
		
		cartService.save(cart);
		
		Integer productPrice = cart.getCartId().getProduct().getPrice();
		Integer productPriceSale = cart.getCartId().getProduct().getPriceSale();
		Integer totalPrice = cart.getValue() * productPrice;
		Integer totalPriceSale = null;
		Long percent = null;
		
		if(productPriceSale != null) {
			totalPriceSale = cart.getValue() * productPriceSale;
			percent = Math.round(((double)totalPriceSale/totalPrice - 1) * 100);
			if(percent == 0) {
				percent = (long)1;
			}
		}
		
		//logic
		return totalPrice + "%" + totalPriceSale + "%" + percent;
	}
	
	@ResponseBody
	@RequestMapping(value = "/cart-caculate")
	public String cartCaculate(@RequestParam("userId") int userId) {
		
		User user = userService.get(userId);
		List<Cart> carts = cartService.getCartByUser(user);
		int price = 0;
		int delivery = 30000;
		
		
		for (Cart cart : carts) {
			if(cart.getIsSelected()) {
				if(cart.getCartId().getProduct().getPriceSale() == null) {
					price += cart.getCartId().getProduct().getPrice() * cart.getValue();
				}else {
					price += cart.getCartId().getProduct().getPriceSale() * cart.getValue();
				}
			}
		}
		int total = price + delivery;
		
		return price + "%" + delivery + "%" + total;
	}
	
	@ResponseBody
	@RequestMapping(value = "/delete-cart")
	public String deleteCart(@RequestParam("userId") int userId,
			@RequestParam("productId") int productId) {
		
		User user = userService.get(userId);
		Product product = productService.get(productId);
		
		cartService.delById(user, product);
		
		//logic
		return "success";
	}
	
	@ResponseBody
	@RequestMapping(value = "/add-cart")
	public String addCart(@RequestParam("userId") int userId,
			@RequestParam("productId") int productId) {
		
		User user = userService.get(userId);
		Product product = productService.get(productId);
		Cart cart = null;
		try {
			cart = cartService.getById(user, product);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		if(cart == null){
			Cart newCart = new Cart();
			newCart.setCartId(new CartId(user,product));
			newCart.setValue(1);
			
			cartService.save(newCart);
		}else {
			cart.setValue(cart.getValue()+1);
		}
		
		//logic
		return "success";
	}
	
}
