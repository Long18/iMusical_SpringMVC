package com.isekai.controllers.client;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.isekai.models.Cart;
import com.isekai.models.CartId;
import com.isekai.models.Product;
import com.isekai.models.User;
import com.isekai.service.CartService;
import com.isekai.service.ProductService;
import com.isekai.service.UserService;

@Controller
public class CartController {
	
	@Autowired
	CartService cartService;
	
	@Autowired
	ProductService productService;
	
	@RequestMapping("/cart")
	public ModelAndView getCart(HttpSession session){
		ModelAndView mav = new  ModelAndView("client-cart");
		User user = null;
		try {
			user = (User) session.getAttribute("UserLogin");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		if(user!=null) {
			List<Cart> carts = cartService.getCartByUser(user);
			for (Cart cart : carts) {
				productService.getListImageByProductId(cart.getCartId().getProduct());
			}
			mav.addObject("carts", carts);
			return mav;
		}
		ModelAndView loginMav = new  ModelAndView("client-login");
		return loginMav;
	}
	
	@RequestMapping("/add-cart")
	public String addCart(HttpSession session,@RequestParam("productId") int productId,@RequestParam("qty") int qty ){
		User user = null;
		try {
			user = (User) session.getAttribute("UserLogin");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		if(user!=null) {
			Product currentProduct = productService.get(productId);
			
			
			Cart editCart = null;
			try {
				editCart = cartService.getById(user,currentProduct);
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			if(editCart != null) {
				editCart.setValue(editCart.getValue() + qty);
				cartService.save(editCart);
			}else {
				Cart cart = new Cart();
				cart.setCartId(new CartId(user, currentProduct));
				cart.setValue(qty);
				cartService.save(cart);
			}
			return "redirect:";
		}
		return "redirect:/login";
	}
	
	@RequestMapping("/del-cart")
	public String delCart(HttpSession session, HttpServletRequest request){
		User user = null;
		try {
			user = (User) session.getAttribute("UserLogin");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		if(user!=null) {
			List<Cart> carts = cartService.getCartByUser(user);
			return "redirect:";
		}
		return "redirect:/login";
	}
	
	@RequestMapping("/update-cart")
	public String updateCart(HttpSession session, HttpServletRequest request){
		User user = null;
		try {
			user = (User) session.getAttribute("UserLogin");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		if(user!=null) {
			List<Cart> carts = cartService.getCartByUser(user);
			return "redirect:";
		}
		return "redirect:/login";
	}
}
