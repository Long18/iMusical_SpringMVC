package com.isekai.controllers.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.isekai.models.Product;
import com.isekai.models.Type;
import com.isekai.service.ProductService;
import com.isekai.service.TypeService;

@Controller
public class HomeController {
	@Autowired
	private ProductService productService;
	
	@Autowired
	private TypeService typeService;
	
	@RequestMapping("/")
	public ModelAndView home(){
		ModelAndView mav = new  ModelAndView("client-home");
		List<Product> topSellerProducts = productService.getListTopSeller();
		for (Product product : topSellerProducts) {
			productService.getListImageByProductId(product);
		}
		
		List<Product> newProducts = productService.listAll();
		for (Product product : newProducts) {
			productService.getListImageByProductId(product);
		}
		
		List<Type> categories = typeService.listCategories();
		
		List<Product> products = productService.listAll();
		for (Product product : products) {
			productService.getListImageByProductId(product);
		}
		
		mav.addObject("categories", categories);
		mav.addObject("topSellerProducts",topSellerProducts);
		mav.addObject("newProducts",newProducts);
		mav.addObject("products",products);
		return mav;
	}
}
