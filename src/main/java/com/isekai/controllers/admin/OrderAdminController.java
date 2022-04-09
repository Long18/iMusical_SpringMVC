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

import com.isekai.models.Role;
import com.isekai.models.Order;
import com.isekai.service.RoleService;
import com.isekai.service.OrderService;

@Controller
@RequestMapping("/admin/order")
public class OrderAdminController {

	@Autowired
	OrderService orderService;
	
	@Autowired
	RoleService roleService;
	
	
	SimpleDateFormat in = new SimpleDateFormat("MM-dd-yyyy hh:mm a");
	
	@RequestMapping("/")
    public ModelAndView all_orders()
    {
    	ModelAndView mav = new ModelAndView("admin-all-orders");
        List<Order> orders = orderService.listAll();

        mav.addObject("orders", orders);
        //return view
        return mav;
    }


	@RequestMapping(value = "/edit-order")
    public ModelAndView edit_order(final HttpServletRequest request, @RequestParam("id") int id)
    {
		ModelAndView mav = new ModelAndView("admin-edit-order");
		Order order = orderService.get(id);
		orderService.getListOrderDetailByOrderId(order);
		
		mav.addObject("edit_order", order);
        //return view
        return mav;
    }

	@RequestMapping(value = "/update-order")
    public String update_order( final HttpServletRequest request, @RequestParam("id") int id)
    {
		Order updateOrder = orderService.get(id);
		
		
		if(request.getParameter("val_code_order")!=""){
			updateOrder.setCode(Integer.parseInt(request.getParameter("val_code_order")));
		}
		if(request.getParameter("val_transport_fee")!=""){
			updateOrder.setTransport_fee(Integer.parseInt(request.getParameter("val_transport_fee")));
		}
		updateOrder.setTransport_type(request.getParameter("val_transport_type"));
		updateOrder.setDelivery_name(request.getParameter("val_delivery_name"));
		updateOrder.setDelivery_address(request.getParameter("val_delivery_address"));
		updateOrder.setDelivery_phone(request.getParameter("val_delivery_phone"));
		updateOrder.setDelivery_email(request.getParameter("val_delivery_email"));
		updateOrder.setDelivery_payment_method(request.getParameter("val_payment_method"));
		updateOrder.setDelivery_payment_status(request.getParameter("val_payment_status"));

		
		String[] value = request.getParameterValues("val_status_order");
        if(value != null) {
        	updateOrder.setStatus(1);
        }else {
        	updateOrder.setStatus(0);
        }
        
        orderService.save(updateOrder);
        
        return "redirect:/admin/order/" ;
    }

//	@RequestMapping(value = "/delete-order")
//    public String delete_order(@RequestParam("id") int id)
//    {
//		orderService.delete(id);
//
//        //return view
//		return "redirect:/admin/order/" ;
//    }
//	
//	@RequestMapping("/add-order-role")
//    public ModelAndView add_orderRole(@RequestParam("id") int id)
//    {
//		ModelAndView mav = new ModelAndView("admin-add-order-role");
//		List<Role> roles = roleService.listAll();
//		
//		mav.addObject("roles", roles);
//		mav.addObject("order_id", id);
//        //return view
//        return mav;
//    }
	
//	@RequestMapping("/save-order-role")
//    public String save_orderRole(final ModelMap model,final HttpServletRequest request, @RequestParam("orderId") int id) {
//
//		
//
//        //get data from view
//        OrderRole saveOrderRole = new OrderRole();
//        
//        try {
//			saveOrderRole.setEnd_at(in.parse(request.getParameter("val_end_at")));
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        Order editOrder = orderService.get(id);
//        Role choosenRole = roleService.get(Integer.parseInt(request.getParameter("val_order_role")));
//        saveOrderRole.setOrderRoleId(new OrderRoleId(editOrder, choosenRole));
//        
//        String[] value = request.getParameterValues("val_status_order_role");
//        if(value != null) {
//        	saveOrderRole.setStatus(1);
//        }else {
//        	saveOrderRole.setStatus(0);
//        }
//
//        // insert data in to database
//        orderRoleService.save(saveOrderRole);
//
//        // return view
//        return "redirect:/admin/order/edit-order?id=" + id;
//	}
//
//	@RequestMapping(value = "/edit-order-role")
//    public ModelAndView edit_orderRole(final HttpServletRequest request, @RequestParam("orderId") int orderId, @RequestParam("roleId") int roleId)
//    {
//		ModelAndView mav = new ModelAndView("admin-edit-order-role");
//		OrderRole orderRole = orderRoleService.getOrderRoleByPK(orderId,roleId);
//		List<Role> roles = roleService.listAll();
//		
//		mav.addObject("roles", roles);
//		mav.addObject("edit_orderRole", orderRole);
//		mav.addObject("order_id", orderId);
//        //return view
//        return mav;
//    }
//
//	@RequestMapping(value = "/update-order-role")
//    public String update_orderRole( final HttpServletRequest request,@RequestParam("orderId") int orderId, @RequestParam("roleId") int roleId)
//    {
//		OrderRole updateOrderRole = orderRoleService.getOrderRoleByPK(orderId,roleId);
//		
////		updateOrderRole.setName(request.getParameter("val_name_orderRole"));
//		String[] value = request.getParameterValues("val_status_orderRole");
//        if(value != null) {
//        	updateOrderRole.setStatus(1);
//        }else {
//        	updateOrderRole.setStatus(0);
//        }
//        
//        orderRoleService.save(updateOrderRole);
//        
//        return "redirect:/admin/order/edit-order?id=" + orderId;
//    }
//
//	@RequestMapping(value = "/delete-order-role")
//    public String delete_orderRole(@RequestParam("orderId") int orderId, @RequestParam("roleId") int roleId)
//    {
//		
//		orderRoleService.delete(orderRoleService.getOrderRoleByPK(orderId,roleId));
//
//        //return view
//		return "redirect:/admin/order/edit-order?id=" + orderId;
//    }
}
