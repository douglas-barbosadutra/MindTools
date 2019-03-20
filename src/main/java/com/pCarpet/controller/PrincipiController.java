package com.pCarpet.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pCarpet.dto.PrincipiDTO;

import com.pCarpet.services.PrincipiService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

@Controller
@RequestMapping("/homeUser")
public class PrincipiController {
	
	private PrincipiService principiService;
	
	@Autowired
	public PrincipiController(PrincipiService principiService) {
		this.principiService = principiService;
		
	}
	
	@RequestMapping(value = "/ShowAllPrincipi", method = RequestMethod.GET)
	public String ShowAll(HttpServletRequest request) {
		 List <PrincipiDTO> listaPrincipi = principiService.getAllPrincipi();
		 request.getSession().setAttribute("listaPrincipi", listaPrincipi);
		 return "ShowAllPrincipi";	
	}
	
	@RequestMapping(value = "/SelezionaPrincipio", method = RequestMethod.GET)
	public String SelezionaPrincipio(HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("idPrincipi"));
		PrincipiDTO principio = principiService.getPrincipio(id);
		request.getSession().setAttribute("Principio", principio);
		return "PrincipioView";
	}
	
	
	
}