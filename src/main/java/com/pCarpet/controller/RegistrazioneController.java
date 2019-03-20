package com.pCarpet.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pCarpet.model.User;
import com.pCarpet.services.UserService;
import com.pCarpet.dto.UserDTO;

@Controller
@RequestMapping("/Registrazione")
public class RegistrazioneController {
	
	private UserService userService;
	
	@Autowired
	public RegistrazioneController(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(value="/reg", method= RequestMethod.POST)
	public String reg(HttpServletRequest request) {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		String email = request.getParameter("email");
		String lingua = request.getParameter("lingua");
		
		
		UserDTO userdto = new UserDTO(0, username, password, nome, cognome, email, lingua);
		
		userService.insertUser(userdto);
		
		return "index";
		
	}
	
	
	
	
	

}