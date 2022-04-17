package com.isekai.controllers.client;


import javax.persistence.NoResultException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.isekai.models.User;
import com.isekai.service.UserService;


@Controller
public class ClientController implements WebMvcConfigurer{
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/login")
	public ModelAndView getLogin(){
		ModelAndView mav = new  ModelAndView("client-login");
		
		return mav;
	}
	
	@RequestMapping(value = "/authentication", method = RequestMethod.POST)
	public String getAuthentication( final ModelMap model, final HttpServletRequest request,HttpSession session){
		ModelAndView mav = new  ModelAndView("client-home");
		String email = (String)request.getParameter("email");
		String password = UserService.getMd5((String) request.getParameter("password"));
		
		User user = null;
		try {
			user = userService.getUserLogin(email,
					password);
		} catch (NoResultException e) {
			e.printStackTrace();
		}
		boolean isLogin = false;
		if (user != null) {
			isLogin = true;
			session.setAttribute("UserLogin", user);
		} else {
//			redirectAttributes.addFlashAttribute("error", "Account Invalid!!");
		}
		
		return "redirect:/";
	}
	
	@RequestMapping("/sign-in")
	public ModelAndView getSignin(){
		ModelAndView mav = new  ModelAndView("client-sign-in");
		
		return mav;
	}
	
	@RequestMapping(value = "/add-user", method = RequestMethod.POST)
	public String addUser(final ModelMap model, final HttpServletRequest request,HttpSession session){
		
		User user = new User();
		user.setPassword(UserService.getMd5(request.getParameter("password")));
		user.setUser_email(request.getParameter("email"));
		user.setUser_name(request.getParameter("name"));
		user.setStatus(1);
		
		userService.save(user);
		
		return "redirect:/";
	}
}
