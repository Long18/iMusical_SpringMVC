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

import com.isekai.models.Type;
import com.isekai.models.User;
import com.isekai.service.TypeService;

@Controller
@RequestMapping("/admin/type")
public class TypeAdminController {
	@Autowired
	TypeService typeService;
	
	
	@RequestMapping("/")
    public ModelAndView all_types()
    {
    	ModelAndView mav = new ModelAndView("admin-all-types");
        List<Type> types = typeService.listAll();

        mav.addObject("types", types);
        //return view
        return mav;
    }

	@RequestMapping("/add-type")
    public ModelAndView add_type()
    {
		ModelAndView mav = new ModelAndView("admin-add-type");
		List<Type> parents = typeService.listAll();
		mav.addObject("parents", parents);
        //return view
        return mav;
    }
	
	@RequestMapping("/save-type")
    public String save_type(final ModelMap model,final HttpServletRequest request, HttpSession session) {

        //get data from view
        Type saveType = new Type();
        saveType.setType_name(request.getParameter("val_name_type"));
        saveType.setType_slug(request.getParameter("val_slug_type"));
        saveType.setType_image_url(request.getParameter("val_image_url"));
		saveType.setParent(typeService.get(Integer.parseInt(request.getParameter("val_parent_type"))));
		saveType.setType_meta_key(request.getParameter("val_meta_key"));
		saveType.setType_meta_desc(request.getParameter("val_meta_desc"));
		
		User userLogin = (User)session.getAttribute("UserLogin");
        if(userLogin==null) {
        	return "redirect:/admin/";
        }else {
        	saveType.setCreate_by(userLogin);
        }
		
        String[] value = request.getParameterValues("val_status_type");
        if(value != null) {
        	saveType.setStatus(1);
        }else {
        	saveType.setStatus(0);
        }

        // insert data in to database
        typeService.save(saveType);

        // return view
        return "redirect:/admin/type/";
	}

	@RequestMapping(value = "/edit-type")
    public ModelAndView edit_type(final HttpServletRequest request, @RequestParam("id") int id)
    {
		ModelAndView mav = new ModelAndView("admin-edit-type");
		Type type = typeService.get(id);
		List<Type> parents = typeService.listAll();
		
		mav.addObject("edit_type", type);
		mav.addObject("parents", parents);
        //return view
        return mav;
    }

	@RequestMapping(value = "/update-type")
    public String update_type( final HttpServletRequest request, @RequestParam("id") int id)
    {
		Type updateType = typeService.get(id);
		
		updateType.setType_name(request.getParameter("val_name_type"));
		updateType.setType_slug(request.getParameter("val_slug_type"));
		updateType.setType_image_url(request.getParameter("val_image_url"));
		updateType.setParent(typeService.get(Integer.parseInt(request.getParameter("val_parent_type"))));
		updateType.setType_meta_key(request.getParameter("val_meta_key"));
		updateType.setType_meta_desc(request.getParameter("val_meta_desc"));
		String[] value = request.getParameterValues("val_status_type");
        if(value != null) {
        	updateType.setStatus(1);
        }else {
        	updateType.setStatus(0);
        }
        
        typeService.save(updateType);
        
        return "redirect:/admin/type/" ;
    }

	@RequestMapping(value = "/delete-type")
    public String delete_type(@RequestParam("id") int id)
    {
		typeService.delete(id);

        //return view
		return "redirect:/admin/type/" ;
    }
}
