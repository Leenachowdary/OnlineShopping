package com.niit.controller;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.niit.dao.ProductDao;



@Controller
public class HomeController {
	@Autowired
private ProductDao productDao;	
   @Autowired
	
public HomeController(){
	System.out.println("HomeController bean is instantiated");
}
//http://localhost:8080/OnLineShoppingFrontend/home - This request will be handled
//by this handler method homePage()
@RequestMapping(value="/home")
public String homePage(HttpSession session)//,@AuthenticationPrincipal Principal principal)
{
	session.setAttribute("categories",productDao.getAllCategories());
	return "home";
}
@RequestMapping(value="/aboutus")
public String aboutusPage(){
	return "aboutus";
}
@RequestMapping(value="/login")
public String login(){
	return "login";
}
@RequestMapping(value="/loginerror")
public String loginFailed(Model model){
	model.addAttribute("error","Invalid credentials..");
	return "login";
}
@RequestMapping(value="/logout")
public String logout(Model model){
	model.addAttribute("msg","Loggedout successfully...");
	return "login";
}
}

