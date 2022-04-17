package com.isekai.controllers.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.isekai.models.Brand;
import com.isekai.models.Product;
import com.isekai.models.Type;
import com.isekai.service.BrandService;
import com.isekai.service.ProductService;
import com.isekai.service.TypeService;


@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@Autowired
	private TypeService typeService;
	
	@Autowired
	private BrandService brandService;
	
	@RequestMapping("/")
	public ModelAndView getProduct(){
		ModelAndView mav = new  ModelAndView("client-product");
		List<Product> listProduct = productService.listAll();
		for (Product product : listProduct) {
			productService.getListImageByProductId(product);
		}
		List<Type> categories = typeService.listCategories();
		List<Brand> brands = brandService.listAll();
		
		mav.addObject("products",listProduct);
		mav.addObject("categories", categories);
		mav.addObject("brands", brands);
		return mav;
	}
	@RequestMapping("/product-brand")
	public ModelAndView getProductWithBrand(@RequestParam("brandId") int brandId){
		ModelAndView mav = new  ModelAndView("client-product");
		List<Product> listProductWithBrands = productService.listProductWithBrand(brandId);
		for (Product product : listProductWithBrands) {
			productService.getListImageByProductId(product);
		}
		List<Type> categories = typeService.listCategories();
		List<Brand> brands = brandService.listAll();
		
		mav.addObject("products",listProductWithBrands);
		mav.addObject("categories", categories);
		mav.addObject("brands", brands);
		return mav;
	}
	
	@RequestMapping("/product-cate")
	public ModelAndView getProductWithCategory(@RequestParam("cateId") int brandId){
		ModelAndView mav = new  ModelAndView("client-product");
		List<Product> listProductWithBrands = productService.listProductWithBrand(brandId);
		for (Product product : listProductWithBrands) {
			productService.getListImageByProductId(product);
		}
		List<Type> categories = typeService.listCategories();
		List<Brand> brands = brandService.listAll();
		
		mav.addObject("products",listProductWithBrands);
		mav.addObject("categories", categories);
		mav.addObject("brands", brands);
		return mav;
	}
	
	@RequestMapping("/product-detail")
	public ModelAndView getProductDetail(@RequestParam("id") int id){
		ModelAndView mav = new  ModelAndView("client-product-detail");
		Product product = productService.get(id);
		productService.getListImageByProductId(product);
		
		mav.addObject("product",product);
		return mav;
	}
	
}
