package com.isekai.controllers.admin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.SimpleFormatter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.isekai.models.Role;
import com.isekai.models.Type;
import com.isekai.models.Brand;
import com.isekai.models.Product;
import com.isekai.models.TypeDetail;
import com.isekai.models.User;
import com.isekai.service.RoleService;
import com.isekai.service.TypeDetailService;
import com.isekai.service.TypeService;
import com.isekai.service.BrandService;
import com.isekai.service.ProductService;

@Controller
@RequestMapping("/admin/product")
public class ProductAdminController {
	@Autowired
	ProductService productService;
	
	@Autowired
	RoleService roleService;
	
	@Autowired
	TypeService typeService;
	
	@Autowired
	BrandService brandService;
	
	@Autowired
	TypeDetailService typeDetailService;
	
	
	SimpleDateFormat in = new SimpleDateFormat("MM-dd-yyyy hh:mm a");
	
	@RequestMapping("/")
    public ModelAndView all_products()
    {
    	ModelAndView mav = new ModelAndView("admin-all-products");
        List<Product> products = productService.listAll();
        for (Product product : products) {
			productService.getListImageByProductId(product);
		}

        mav.addObject("products", products);
        //return view
        return mav;
    }

	@RequestMapping("/add-product")
    public ModelAndView add_product()
    {
		ModelAndView mav = new ModelAndView("admin-add-product");
		List<Brand> brands = brandService.listAll();
		List<Type> categories = typeService.listCategories();
		
		
		mav.addObject("brands", brands);
		mav.addObject("categories", categories);
        //return view
        return mav;
    }
	
	@RequestMapping("/save-product")
    public String save_product(final ModelMap model,final HttpServletRequest request, HttpSession session) {

        //get data from view
        Product saveProduct = new Product();
        saveProduct.setName((String)request.getParameter("val_name_product"));
        saveProduct.setPrice(Integer.parseInt(request.getParameter("val_price_product")));
        saveProduct.setPriceSale(Integer.parseInt(request.getParameter("val_price_sale")));
        try {
			saveProduct.setEndSale(in.parse(request.getParameter("val_end_sale")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        saveProduct.setDetail((String)request.getParameter("val_detail_product"));
        saveProduct.setAmount(Integer.parseInt(request.getParameter("val_amount_product")));
        
		User userLogin = (User)session.getAttribute("UserLogin");
        if(userLogin==null) {
        	return "redirect:/admin/";
        }else {
        	saveProduct.setCreated_by(userLogin);
        }
        
        String[] value = request.getParameterValues("val_status_product");
        if(value != null) {
        	saveProduct.setStatus(1);
        }else {
        	saveProduct.setStatus(0);
        }

        // insert data in to database
        productService.save(saveProduct);

        // return view
        return "redirect:/admin/product/";
	}

	@RequestMapping(value = "/edit-product")
    public ModelAndView edit_product(final HttpServletRequest request, @RequestParam("id") int id)
    {
		ModelAndView mav = new ModelAndView("admin-edit-product");
		Product product = productService.get(id);
		productService.getListTypeDetailByProductId(product);
		
		mav.addObject("edit_product", product);
        //return view
        return mav;
    }

	@RequestMapping(value = "/update-product")
    public String update_product( final HttpServletRequest request, @RequestParam("id") int id)
    {
		Product updateProduct = productService.get(id);
		
		updateProduct.setName((String)request.getParameter("val_name_product"));
		updateProduct.setPrice(Integer.parseInt(request.getParameter("val_price_product")));
		updateProduct.setPriceSale(Integer.parseInt(request.getParameter("val_price_sale")));
        try {
        	updateProduct.setEndSale(in.parse(request.getParameter("val_end_sale")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        updateProduct.setDetail((String)request.getParameter("val_detail_product"));
        updateProduct.setAmount(Integer.parseInt(request.getParameter("val_amount_product")));
		
		String[] value = request.getParameterValues("val_status_product");
        if(value != null) {
        	updateProduct.setStatus(1);
        }else {
        	updateProduct.setStatus(0);
        }
        
        productService.save(updateProduct);
        
        return "redirect:/admin/product/" ;
    }

	@RequestMapping(value = "/delete-product")
    public String delete_product(@RequestParam("id") int id)
    {
		productService.delete(id);

        //return view
		return "redirect:/admin/product/" ;
    }
	
	@RequestMapping("/add-product-type-detail")
    public ModelAndView add_typeDetail(@RequestParam("productId") int id)
    {
		ModelAndView mav = new ModelAndView("admin-add-product-type-detail");
		Product product = productService.get(id);
		List<Type> types = typeService.getListChildByParentId(product.getCategory());
		
		mav.addObject("types", types);
		mav.addObject("product_id", id);
        //return view
        return mav;
    }
	
	@RequestMapping("/save-product-type-detail")
    public String save_typeDetail(final ModelMap model,final HttpServletRequest request, @RequestParam("productId") int id) {

		

        //get data from view
        TypeDetail saveTypeDetail = new TypeDetail();
        Product product = productService.get(id);
//        Type type = typeService.get(Integer.parseInt((String)request.getAttribute("val_type_type_detail")));
        String value = (String)request.getAttribute("val_value_type_detail");
        
        // insert data in to database
//        typeDetailService.save(saveTypeDetail);

        // return view
        return "redirect:/admin/product/edit-product?id=" + id +"&" + value;
	}
//
//	@RequestMapping(value = "/edit-product-role")
//    public ModelAndView edit_typeDetail(final HttpServletRequest request, @RequestParam("productId") int productId, @RequestParam("roleId") int roleId)
//    {
//		ModelAndView mav = new ModelAndView("admin-edit-product-role");
//		TypeDetail typeDetail = typeDetailService.getTypeDetailByPK(productId,roleId);
//		List<Role> roles = roleService.listAll();
//		
//		mav.addObject("roles", roles);
//		mav.addObject("edit_typeDetail", typeDetail);
//		mav.addObject("product_id", productId);
//        //return view
//        return mav;
//    }
//
//	@RequestMapping(value = "/update-product-role")
//    public String update_typeDetail( final HttpServletRequest request,@RequestParam("productId") int productId, @RequestParam("roleId") int roleId)
//    {
//		TypeDetail updateTypeDetail = typeDetailService.getTypeDetailByPK(productId,roleId);
//		
////		updateTypeDetail.setName(request.getParameter("val_name_typeDetail"));
//		String[] value = request.getParameterValues("val_status_typeDetail");
//        if(value != null) {
//        	updateTypeDetail.setStatus(1);
//        }else {
//        	updateTypeDetail.setStatus(0);
//        }
//        
//        typeDetailService.save(updateTypeDetail);
//        
//        return "redirect:/admin/product/edit-product?id=" + productId;
//    }
//
//	@RequestMapping(value = "/delete-product-role")
//    public String delete_typeDetail(@RequestParam("productId") int productId, @RequestParam("roleId") int roleId)
//    {
//		
//		typeDetailService.delete(typeDetailService.getTypeDetailByPK(productId,roleId));
//
//        //return view
//		return "redirect:/admin/product/edit-product?id=" + productId;
//    }

}
