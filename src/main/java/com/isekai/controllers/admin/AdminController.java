package com.isekai.controllers.admin;


import javax.persistence.NoResultException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.isekai.models.User;
import com.isekai.models.UserRole;
import com.isekai.service.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController implements WebMvcConfigurer{

	@Autowired
	UserService userService;

	public static boolean AuthLogin(HttpSession session) {
		return session.getAttribute("UserLogin") != null;
	}


	@RequestMapping(value = "/")
	public ModelAndView show_dashboard(HttpSession session) {
		if (AuthLogin(session)){
			ModelAndView mav = new ModelAndView("admin-dashboard");
			mav.addObject("UserLogin", session.getAttribute("UserLogin"));
			return mav;
		}else {
			ModelAndView mav = new ModelAndView("admin-login");
			return mav;
		}
	}

	@RequestMapping(value = "/admin-dashboard", method = RequestMethod.POST)
	public String dashboard(final ModelMap model, final HttpServletRequest request,
			HttpSession session, RedirectAttributes redirectAttributes) {

		User user = null;
		try {
			user = userService.getUserLogin(request.getParameter("admin_email"),
					UserService.getMd5(request.getParameter("admin_password")));
		} catch (NoResultException e) {
			e.printStackTrace();
		}

		if (user != null) {
			for (UserRole item : userService.getListUserRoleByUserId(user)) {
				boolean isAdmin = item.getUserRoleId().getRole().getId() == 1;
				boolean isManager = item.getUserRoleId().getRole().getId() == 1;
				boolean isStaff = item.getUserRoleId().getRole().getId() == 1;
				if (isAdmin || isManager || isStaff) {
					session.setAttribute("UserLogin", user);
					return "redirect:/admin/";
				}
			}
			redirectAttributes.addFlashAttribute("error", "Your account dont have any permission to access!!");
		} else {
			redirectAttributes.addFlashAttribute("error", "Account Invalid!!");
		}

		return "redirect:/admin/";
	}

	@RequestMapping(value = "/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("UserLogin");
		return "redirect:/admin/";
	}
}
