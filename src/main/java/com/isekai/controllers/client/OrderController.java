package com.isekai.controllers.client;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.text.View;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.isekai.models.Cart;
import com.isekai.models.Order;
import com.isekai.models.OrderDetail;
import com.isekai.models.Product;
import com.isekai.models.User;
import com.isekai.service.CartService;
import com.isekai.service.OrderDetailService;
import com.isekai.service.OrderService;
import com.isekai.service.ProductService;
import com.isekai.service.UserService;

@Controller
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@Autowired
	CartService cartService;
	
	@Autowired
	UserService userService;
	
	@Autowired
	OrderDetailService orderDetailService;
	
	@Autowired
	ProductService productService;
	
	@RequestMapping("/order-cart")
	public ModelAndView getOrderByCart(HttpSession session){
		
		
		User user = null;
		try {
			user = (User) session.getAttribute("UserLogin");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		if(user!=null) {
			ModelAndView mav = new  ModelAndView("client-order");
			List<Cart> listSelectCarts = cartService.getSelectedCartByUser(user);
			for (Cart cart : listSelectCarts) {
				productService.getListImageByProductId(cart.getCartId().getProduct());
			}
			mav.addObject("carts", listSelectCarts);
			return mav;
		}else {
			ModelAndView loginMav = new  ModelAndView("client-login");
			return loginMav;
		}
	}
	
	@RequestMapping("/Order")
	public ModelAndView getOrder(HttpSession session, @RequestParam("productId")int id){
		User user = null;
		try {
			user = (User) session.getAttribute("UserLogin");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		if(user!=null) {
			ModelAndView mav = new  ModelAndView("client-order");
			Product product = productService.get(id);
			mav.addObject("product", product);
			return mav;
		}else {
			ModelAndView loginMav = new  ModelAndView("client-login");
			return loginMav;
		}
	}
	
	@RequestMapping("/save-orders")
	public String
	saveOrderByCart(HttpSession session, HttpServletRequest request){
		
		
		User user = null;
		try {
			user = (User) session.getAttribute("UserLogin");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		if(user!=null) {
			
			List<Cart> listSelectCarts = cartService.getSelectedCartByUser(user);
			List<OrderDetail> orderDetails = new ArrayList<>();
			Integer transportFee = 30000;
			Integer totalSum = 0;
			for (Cart cart : listSelectCarts) {
				
				OrderDetail temp = new OrderDetail();
				temp.setOrder_detail_quantity(cart.getValue());
				temp.setOrder_detail_price(cart.getCartId().getProduct().getPrice());
				temp.setOrder_detail_price_sale(cart.getCartId().getProduct().getPriceSale());
				temp.setProduct(cart.getCartId().getProduct());
				
				if(cart.getCartId().getProduct().getPriceSale() == null) {
					temp.setOrder_detail_total(cart.getValue() * cart.getCartId().getProduct().getPrice());
				}else {
					temp.setOrder_detail_total(cart.getValue() * cart.getCartId().getProduct().getPriceSale());
				}
			}
			totalSum += transportFee;
			
			Order saveOrder = new Order();
			
			saveOrder.setDelivery_name((String)request.getParameter("delivery_name"));
			saveOrder.setDelivery_phone((String)request.getParameter("delivery_phone"));
			saveOrder.setDelivery_address((String)request.getParameter("delivery_address"));
			saveOrder.setDelivery_email((String)request.getParameter("delivery_email"));
			saveOrder.setDelivery_payment_method((String)request.getParameter("delivery_method"));
//
			saveOrder.setCreated_by(user);
//			
			saveOrder = orderService.saveAndFlush(saveOrder);
			
			for (OrderDetail orderDetail : orderDetails) {
				orderDetail.setOrder(saveOrder);
				orderDetailService.save(orderDetail);
			}

			return "order-success";
		}else {
			return "client-login";
		}
	}
}
