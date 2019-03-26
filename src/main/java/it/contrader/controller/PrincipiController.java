package it.contrader.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.contrader.dto.PrincipiDTO;

import it.contrader.service.PrincipiService;

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
	
	@RequestMapping(value = "/PrincipiByParola", method = RequestMethod.GET)
	public String findByPChiave(HttpServletRequest request) {
		String pChiave = request.getParameter("pChiave"); 
		List <PrincipiDTO> listaPrincipi = principiService.findByPChiave(pChiave);
		request.getSession().setAttribute("listaprincipi", listaPrincipi); 		
		return "PrincipiByParola";
		
	}
	
	@RequestMapping(value = "/PrincipioRandom", method = RequestMethod.GET)
	public String PrincipioRandom(HttpServletRequest request) {
		int casual = (int) (Math.random()*40+1);
		PrincipiDTO principio = principiService.getPrincipio(casual);
		request.getSession().setAttribute("Principio", principio);
		return "PrincipioView";
	}
	
	@RequestMapping(value = "/showPath", method = RequestMethod.POST)
	public String ShowPath(HttpServletRequest request) {
		return "showPath";
	}
	
	
	
	
	
}