package it.contrader.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.contrader.dto.PrincipiDTO;

import it.contrader.service.PrincipiService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

@CrossOrigin
@RestController
@RequestMapping("/Principi")
public class PrincipiController {
	
	private PrincipiService principiService;
	
	@Autowired
	public PrincipiController(PrincipiService principiService) {
		this.principiService = principiService;
		
	}
	
	@RequestMapping(value = "/ShowAllPrincipi", method = RequestMethod.GET)
	public List <PrincipiDTO>  ShowAll(HttpServletRequest request) {
		 List <PrincipiDTO> listaPrincipi = principiService.getAllPrincipi();
		 request.getSession().setAttribute("listaPrincipi", listaPrincipi);
		 return listaPrincipi;	
	}
	
	@RequestMapping(value = "/SelezionaPrincipio", method = RequestMethod.GET)
	public PrincipiDTO SelezionaPrincipio(@RequestParam(value="id") int id) {
		PrincipiDTO principio = principiService.getPrincipio(id);
		return principio;
	}
	
	@RequestMapping(value = "/PrincipiByParola", method = RequestMethod.GET)
	public List <PrincipiDTO> findByPChiave(@RequestParam(value="pChiave") String pChiave) {
		System.out.println(pChiave);
		List <PrincipiDTO> listaPrincipi = principiService.findByPChiave(pChiave);	
		System.out.println(listaPrincipi);
		return listaPrincipi;
		
	}
	
	@RequestMapping(value = "/PrincipioRandom", method = RequestMethod.GET)
	public PrincipiDTO PrincipioRandom(HttpServletRequest request) {
		int casual = (int) (Math.random()*40+1);
		PrincipiDTO principio = principiService.getPrincipio(casual);
		request.getSession().setAttribute("Principio", principio);
		return principio;
	}
	
	@RequestMapping(value = "/showPath", method = RequestMethod.POST)
	public String ShowPath(HttpServletRequest request) {
		return "showPath";
	}
	
	
	
	
	
}