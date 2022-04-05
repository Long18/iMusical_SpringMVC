package com.isekai.controllers.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.isekai.models.Slider;
import com.isekai.models.User;
import com.isekai.service.SliderService;

@Controller
@RequestMapping("/admin/slider")
public class SliderAdminController {
	@Autowired
	SliderService sliderService;
	
	
	@RequestMapping("/")
    public ModelAndView all_sliders()
    {
    	ModelAndView mav = new ModelAndView("admin-all-sliders");
        List<Slider> sliders = sliderService.listAll();

        mav.addObject("sliders", sliders);
        //return view
        return mav;
    }

	@RequestMapping("/add-slider")
    public ModelAndView add_slider()
    {
		ModelAndView mav = new ModelAndView("admin-add-slider");

        //return view
        return mav;
    }
	
	@RequestMapping("/save-slider")
    public String save_slider(final ModelMap model,final HttpServletRequest request, HttpSession session) {

        //get data from view
        Slider saveSlider = new Slider();
        
        saveSlider.setSlider_name((String)request.getParameter("val_name_slider"));
        saveSlider.setSlider_url((String)request.getParameter("val_url_slider"));
        saveSlider.setSlider_position((String)request.getParameter("val_position_slider"));
        saveSlider.setSlider_img_url((String)request.getParameter("val_image_url"));
        
        User userLogin = (User)session.getAttribute("UserLogin");
        if(userLogin==null) {
        	return "redirect:/admin/";
        }else {
        	saveSlider.setCreated_by(userLogin);
        }
        
        String[] value = request.getParameterValues("val_status_slider");
        if(value != null) {
        	saveSlider.setStatus(1);
        }else {
        	saveSlider.setStatus(0);
        }
 
        // insert data in to database
        sliderService.save(saveSlider);
        

        // return view
        return "redirect:/admin/slider/";
	}

	@RequestMapping(value = "/edit-slider")
    public ModelAndView edit_slider(final HttpServletRequest request, @RequestParam("id") int id)
    {
		ModelAndView mav = new ModelAndView("admin-edit-slider");
		Slider slider = sliderService.get(id);
		
		mav.addObject("edit_slider", slider);
        //return view
        return mav;
    }

	@RequestMapping(value = "/update-slider")
    public String update_slider( final HttpServletRequest request, @RequestParam("id") int id)
    {
		Slider updateSlider = sliderService.get(id);
		
		updateSlider.setSlider_name((String)request.getParameter("val_name_slider"));
		updateSlider.setSlider_url((String)request.getParameter("val_url_slider"));
		updateSlider.setSlider_position((String)request.getParameter("val_position_slider"));
        updateSlider.setSlider_img_url((String)request.getParameter("val_image_url"));
		String[] value = request.getParameterValues("val_status_slider");
        if(value != null) {
        	updateSlider.setStatus(1);
        }else {
        	updateSlider.setStatus(0);
        }
        
        sliderService.save(updateSlider);
        
        return "redirect:/admin/slider/" ;
    }

	@RequestMapping(value = "/delete-slider")
    public String delete_slider(@RequestParam("id") int id)
    {
		sliderService.delete(id);

        //return view
		return "redirect:/admin/slider/" ;
    }
}
