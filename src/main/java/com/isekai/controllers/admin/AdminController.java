package com.isekai.controllers.admin;

import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.isekai.models.User;
import com.isekai.service.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	UserService userService;
	
//	public ModelAndView AuthLogin(){
//        $admin_id = Session::get('user_id');
//        if($admin_id){
//            return Redirect::to('admin/dashboard');
//        }else{
//            return Redirect::to('admin')->send();
//        }
//    }
	
	@RequestMapping("/")
    public ModelAndView index()
    {
		ModelAndView mav = new  ModelAndView("admin-login");
        return mav;
    }
	
	@RequestMapping(value = "/dashboard")
    public ModelAndView show_dashboard()
    {
		ModelAndView mav = new  ModelAndView("admin-dashboard");
        return mav;
    }
	
	@RequestMapping(value = "/admin-dashboard", method = RequestMethod.POST)
    public String dashboard(final ModelMap model, final HttpServletRequest request,
			final HttpServletResponse response){
		
		
//		if(user != null) {
			try {
				User user = userService.getUserLogin(request.getParameter("admin_email"), UserService.getMD5(request.getParameter("admin_password")));
				return "redirect:/admin/dashboard?pass=" + UserService.getMD5(request.getParameter("admin_password")) ;
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		}
//        $user_email = $request->admin_email;
//        $user_password =md5($request->admin_password);
//
//        $user = User::where('user_email', $user_email)
//        ->where('password', $user_password)
//        ->first();
//        $result = false;
//        if($user){
//            foreach($user->getRoles() as $user_role){
//                $role = $user_role->getRole();
//                if($role->role_name != 'guest'){
//                    $result = true;
//                    break;
//                }
//            }
//        }
//
//        if($result){
//            Session::put('user_name',$user->user_name);
//            Session::put('user_email',$user_email);
//            Session::put('user_id',$user->user_id);
//            return Redirect::to('/admin/dashboard');
//        }else{
//            Session::put('message',"Wrong!! You don't have permission to access this page");
//            Session::put('user_email',$user_email);
//            return Redirect::to('/admin');
//        }
		
		return "redirect:/admin/" ;
    }

//    public ModelAndView logout(){
//        $this->AuthLogin();
//        Session::put('user_name',null);
//        Session::put('user_id',null);
//        return Redirect::to('/admin');
//    }
}
