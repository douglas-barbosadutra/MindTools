package com.pCarpet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String ShowAll(HttpServletRequest request, Model model) {
		 List <PrincipiDTO> listaPrincipi = principiService.getAllPrincipi();
		 model.addAttribute("listaPrincipi", listaPrincipi);
		 return "ShowAllPrincipi";	
	}
	
	@RequestMapping(value = "/SelezionaPrincipio", method = RequestMethod.GET)
	public String SelezionaPrincipio(HttpServletRequest request, Model model) {
		int id = Integer.parseInt(request.getParameter("id_principi"));
		PrincipiDTO principio = principiService.getPrincipio(id);
		model.addAttribute("Principio", principio);
		return "SelezionaPrincipio";
	}
	
	
	
}