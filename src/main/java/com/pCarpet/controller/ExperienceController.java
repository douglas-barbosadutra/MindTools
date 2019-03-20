package com.pCarpet.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pCarpet.dto.UserDTO;
import com.pCarpet.services.ExperienceService;

@Controller
@RequestMapping("/Experience")
public class ExperienceController {
	private final ExperienceService experienceService;
	
	@Autowired
	public ExperienceController (ExperienceService experienceService) {
		this.experienceService = experienceService;
	}
	
	@RequestMapping(value="/insertExperience", method= RequestMethod.POST)
	public String insertUser(HttpServletRequest request) {
		
		
		String commento= request.getParameter("commento");
	    String positivo = request.getParameter("positivo");
	    String negativo = request.getParameter("negativo");
	    int score = Integer.parseInt(request.getParameter("score"));
	    String[]  ids_principi = request.getParameterValues("idsprincipi[]");
	    
	   
	    
		
		return "Experience";
	}
	

}
