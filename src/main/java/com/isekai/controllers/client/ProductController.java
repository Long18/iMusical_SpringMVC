package com.isekai.controllers.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.isekai.models.Product;
import com.isekai.service.ProductService;


@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService service;
	
	@RequestMapping("/")
	public ModelAndView home(){
		ModelAndView mav = new  ModelAndView("index");
		List<Product> listProduct = service.listAll();
		mav.addObject("listProduct",listProduct);
		return mav;
	}
}
