package com.pCarpet.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pCarpet.dao.FeedbackRepository;
import com.pCarpet.dto.NodoPDTO;
import com.pCarpet.dto.PrincipiDTO;
import com.pCarpet.services.NodosService;
import com.pCarpet.services.PrincipiService;

@Controller
@RequestMapping("/Grafo")
public class WizardController {
	private final FeedbackRepository FeedbackRepository;
	private final PrincipiService PrincipiService;
	private final NodosService nodosService;
	private NodoPDTO nodoPdto = new NodoPDTO();
	
	@Autowired
	public WizardController (FeedbackRepository FeedbackRepository,PrincipiService PrincipiService, NodosService nodosService ) {
		this.FeedbackRepository = FeedbackRepository;
		this.PrincipiService = PrincipiService;
		this.nodosService = nodosService;
	}

	
	
	@RequestMapping(value="/openInsertWizard",method= RequestMethod.GET)
	public String openInsertWizard(HttpServletRequest request) {
		List <PrincipiDTO> listaPrincipi = PrincipiService.getAllPrincipi();
		request.getSession().setAttribute("listaPrincipi", listaPrincipi); 
		return "problema";

      }
	@RequestMapping(value="/InsertProblema",method= RequestMethod.GET)
	public String InsertWizard(HttpServletRequest request) {
		 String nome= request.getParameter("nome");
	     String descrizione = request.getParameter("descrizione");
	     nodoPdto.setNome(nome);
	     nodoPdto.setDescrizione(descrizione);
	     nodosService.insertNodoP(nodoPdto);
	     
	     return "insertWizard";
		
		
	}
	
}
