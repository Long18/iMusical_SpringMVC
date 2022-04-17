package com.isekai.controllers.client;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.isekai.models.Order;
import com.isekai.models.User;
import com.isekai.service.CartService;
import com.isekai.service.OrderService;
import com.isekai.service.ProductService;

@Controller
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@Autowired
	CartService cartService;
	
	@RequestMapping("/Order-cart")
	public ModelAndView getOrderByCart(HttpSession session){
		ModelAndView mav = new  ModelAndView("client-Order");

		return mav;
	}
	
	@RequestMapping("/Order")
	public ModelAndView getOrder(HttpSession session){
		ModelAndView mav = new  ModelAndView("client-Order");

		return mav;
	}
}
