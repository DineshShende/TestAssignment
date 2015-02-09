package com.svk.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.svk.web.services.UserService;
import com.svk.web.type.Address;
import com.svk.web.type.User;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/home")
	public String homePage(Model model)
	{
		
		return "home";
		
	}
	
	@RequestMapping(value="/login")
	public String login()
	{
		return "login";
		
	}
	@RequestMapping(value="/register")
	public String register(Model model)
	{
		model.addAttribute("user", new User());
		return "register";
		
	}
	
	@RequestMapping(value="/registration",method=RequestMethod.POST)
	public String registerUser(Model model,@RequestParam("username")String username,@RequestParam("password")String password,
			@RequestParam("street")String street,@RequestParam("city")String city,@RequestParam("state")String state,
			@RequestParam("zip")String zip,@RequestParam("email")String email,@RequestParam("mobile")String mobile)
	{
		model.addAttribute("name", username);
		User u=new User();
		u.setAddress(new Address(1,street,city,state,zip));
		u.setName(username);
		u.setPassword(password);
		u.setEmail(email);
		u.setMobile(mobile);
		u.setPersonId(0);
		
		userService.addPerson(u);
		model.addAttribute("msg","Successfully Registered");
		return "redirect:home";
		
	}
	
	@RequestMapping(value="/logincheck",method=RequestMethod.POST)
	public String loginCheck(Model model,@RequestParam("username")String username,@RequestParam("password")String password){
	
		String view=null;
		
		User u=userService.getPersonByName(username);
		System.out.println("\n\n\n\n"+u.getName()+"\n\n\n"+u.getEmail());
		if ((u.getName().equals(username))&&(u.getPassword().equals(password)))
		{
			model.addAttribute("user",u);
			view="success";
		}
		else
		{
			model.addAttribute("err", "Invalid username and password");
			view="redirect:login";
		}
		
		return view;		
		
	}
}
