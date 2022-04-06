package com.isekai.controllers.admin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.isekai.models.UserRole;
import com.isekai.models.UserRoleId;
import com.isekai.models.Role;
import com.isekai.models.User;
import com.isekai.service.UserRoleService;
import com.isekai.service.UserService;
import com.isekai.service.RoleService;

@Controller
@RequestMapping("/admin/user")
public class UserAdminController {

	@Autowired
	UserService userService;
	
	@Autowired
	RoleService roleService;
	
	@Autowired
	UserRoleService userRoleService;
	
	SimpleDateFormat in = new SimpleDateFormat("MM-dd-yyyy hh:mm a");
	
	@RequestMapping("/")
    public ModelAndView all_users()
    {
    	ModelAndView mav = new ModelAndView("admin-all-users");
        List<User> users = userService.listAll();

        mav.addObject("users", users);
        //return view
        return mav;
    }
	/* if(in.parse(request.getParameter("user_role.end_at")).after(date)){
	out.print(true);
} */

//	@RequestMapping("/add-user")
//    public ModelAndView add_user()
//    {
//		ModelAndView mav = new ModelAndView("admin-add-user");
//
//        //return view
//        return mav;
//    }
//	
//	@RequestMapping("/save-user")
//    public String save_user(final ModelMap model,final HttpServletRequest request) {
//
//        //get data from view
//        User saveUser = new User();
//        saveUser.setUser_name((String)request.getParameter("val_name_user"));
//        String[] value = request.getParameterValues("val_status_user");
//        if(value != null) {
//        	saveUser.setStatus(1);
//        }else {
//        	saveUser.setStatus(0);
//        }
//
//        // insert data in to database
//        userService.save(saveUser);
//
//        // return view
//        return "redirect:/admin/user/";
//	}

	@RequestMapping(value = "/edit-user")
    public ModelAndView edit_user(final HttpServletRequest request, @RequestParam("id") int id)
    {
		ModelAndView mav = new ModelAndView("admin-edit-user");
		User user = userService.get(id);
		userService.getListUserRoleByUserId(user);
		
		mav.addObject("edit_user", user);
        //return view
        return mav;
    }

	@RequestMapping(value = "/update-user")
    public String update_user( final HttpServletRequest request, @RequestParam("id") int id)
    {
		User updateUser = userService.get(id);
		
		updateUser.setUser_name(request.getParameter("val_name_user"));
		
		String[] value = request.getParameterValues("val_status_user");
        if(value != null) {
        	updateUser.setStatus(1);
        }else {
        	updateUser.setStatus(0);
        }
        
        userService.save(updateUser);
        
        return "redirect:/admin/user/" ;
    }

	@RequestMapping(value = "/delete-user")
    public String delete_user(@RequestParam("id") int id)
    {
		userService.delete(id);

        //return view
		return "redirect:/admin/user/" ;
    }
	
	@RequestMapping("/add-user-role")
    public ModelAndView add_userRole(@RequestParam("id") int id)
    {
		ModelAndView mav = new ModelAndView("admin-add-user-role");
		List<Role> roles = roleService.listAll();
		
		mav.addObject("roles", roles);
		mav.addObject("user_id", id);
        //return view
        return mav;
    }
	
	@RequestMapping("/save-user-role")
    public String save_userRole(final ModelMap model,final HttpServletRequest request, @RequestParam("userId") int id) {

		

        //get data from view
        UserRole saveUserRole = new UserRole();
        
        try {
			saveUserRole.setEnd_at(in.parse(request.getParameter("val_end_at")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        User editUser = userService.get(id);
        Role choosenRole = roleService.get(Integer.parseInt(request.getParameter("val_user_role")));
        saveUserRole.setUserRoleId(new UserRoleId(editUser, choosenRole));
        
        String[] value = request.getParameterValues("val_status_user_role");
        if(value != null) {
        	saveUserRole.setStatus(1);
        }else {
        	saveUserRole.setStatus(0);
        }

        // insert data in to database
        userRoleService.save(saveUserRole);

        // return view
        return "redirect:/admin/user/edit-user?id=" + id;
	}

	@RequestMapping(value = "/edit-user-role")
    public ModelAndView edit_userRole(final HttpServletRequest request, @RequestParam("userId") int userId, @RequestParam("roleId") int roleId)
    {
		ModelAndView mav = new ModelAndView("admin-edit-user-role");
		UserRole userRole = userRoleService.getUserRoleByPK(userId,roleId);
		List<Role> roles = roleService.listAll();
		
		mav.addObject("roles", roles);
		mav.addObject("edit_userRole", userRole);
		mav.addObject("user_id", userId);
        //return view
        return mav;
    }

	@RequestMapping(value = "/update-user-role")
    public String update_userRole( final HttpServletRequest request,@RequestParam("userId") int userId, @RequestParam("roleId") int roleId)
    {
		UserRole updateUserRole = userRoleService.getUserRoleByPK(userId,roleId);
		
//		updateUserRole.setName(request.getParameter("val_name_userRole"));
		String[] value = request.getParameterValues("val_status_userRole");
        if(value != null) {
        	updateUserRole.setStatus(1);
        }else {
        	updateUserRole.setStatus(0);
        }
        
        userRoleService.save(updateUserRole);
        
        return "redirect:/admin/user/edit-user?id=" + userId;
    }

	@RequestMapping(value = "/delete-user-role")
    public String delete_userRole(@RequestParam("userId") int userId, @RequestParam("roleId") int roleId)
    {
		
		userRoleService.delete(userRoleService.getUserRoleByPK(userId,roleId));

        //return view
		return "redirect:/admin/user/edit-user?id=" + userId;
    }
}
