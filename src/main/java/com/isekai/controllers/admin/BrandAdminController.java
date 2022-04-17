package com.isekai.controllers.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.isekai.models.Brand;
import com.isekai.service.BrandService;

@Controller
@RequestMapping("/admin/brand")
public class BrandAdminController {
	
	@Autowired
	BrandService brandService;
	
	
	@RequestMapping("/")
    public ModelAndView all_brands()
    {
    	ModelAndView mav = new ModelAndView("admin-all-brands");
        List<Brand> brands = brandService.listAll();

        mav.addObject("brands", brands);
        //return view
        return mav;
    }

	@RequestMapping("/add-brand")
    public ModelAndView add_brand()
    {
		ModelAndView mav = new ModelAndView("admin-add-brand");

        //return view
        return mav;
    }
	
	@RequestMapping("/save-brand")
    public String save_brand(final ModelMap model,final HttpServletRequest request) {

        //get data from view
        Brand saveBrand = new Brand();
        saveBrand.setName((String)request.getParameter("val_name_brand"));
        String[] value = request.getParameterValues("val_status_brand");
        if(value != null) {
        	saveBrand.setStatus(1);
        }else {
        	saveBrand.setStatus(0);
        }

        // insert data in to database
        brandService.save(saveBrand);

        // return view
        return "redirect:/admin/brand/";
	}

	@RequestMapping(value = "/edit-brand")
    public ModelAndView edit_brand(final HttpServletRequest request, @RequestParam("id") int id)
    {
		ModelAndView mav = new ModelAndView("admin-edit-brand");
		Brand brand = brandService.get(id);
		
		mav.addObject("edit_brand", brand);
        //return view
        return mav;
    }

	@RequestMapping(value = "/update-brand")
    public String update_brand( final HttpServletRequest request, @RequestParam("id") int id)
    {
		Brand updateBrand = brandService.get(id);
		
		updateBrand.setName(request.getParameter("val_name_brand"));
		String[] value = request.getParameterValues("val_status_brand");
        if(value != null) {
        	updateBrand.setStatus(1);
        }else {
        	updateBrand.setStatus(0);
        }
        
        brandService.save(updateBrand);
        
        return "redirect:/admin/brand/" ;
    }

	@RequestMapping(value = "/delete-brand")
    public String delete_brand(@RequestParam("id") int id)
    {
		brandService.delete(id);

        //return view
		return "redirect:/admin/brand/" ;
    }
}
