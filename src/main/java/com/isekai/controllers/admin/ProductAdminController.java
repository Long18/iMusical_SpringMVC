package com.isekai.controllers.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.isekai.models.Product;
import com.isekai.models.ProductImage;
import com.isekai.service.ProductService;


@Controller
@RequestMapping("/admin/product")
public class ProductAdminController {
	
	@Autowired
	private ProductService service;
	
	@RequestMapping("/")
	public ModelAndView home(){
		ModelAndView mav = new  ModelAndView("dashboard");
		List<Product> listProduct = service.listAll();
		mav.addObject("listProduct",listProduct);
		for (Product product : listProduct) {
			service.getListImageByProductId(product);
		}
		
		return mav;
	}
}
