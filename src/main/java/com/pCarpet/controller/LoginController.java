package com.pCarpet.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pCarpet.model.User;
import com.pCarpet.services.LoginService;
import com.pCarpet.services.UserService;

@Controller
@RequestMapping("/Login")
public class LoginController {
	
	private LoginService loginService;
	
	@Autowired
	public LoginController(LoginService ls) {
		loginService = ls;
	}
	
	@RequestMapping(value="/authentication", method= RequestMethod.POST)
	public String authentication(HttpServletRequest request) {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		final User user = loginService.login(username, password);
		
		if (user != null) {
			UserService.setUserSession(user);
			request.getSession().setAttribute("utente", user);
			
			return "homeUser";
		}
		
		return "index";
	}

}