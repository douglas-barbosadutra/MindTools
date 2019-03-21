package com.pCarpet.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pCarpet.converter.ConverterUser;
import com.pCarpet.converter.ExperienceConverter;
import com.pCarpet.converter.FeedbackConverter;
import com.pCarpet.converter.PrincipiConverter;
import com.pCarpet.dto.ExperienceDTO;
import com.pCarpet.dto.FeedbackDTO;
import com.pCarpet.dto.PrincipiDTO;
import com.pCarpet.dto.UserDTO;
import com.pCarpet.model.Experience;
import com.pCarpet.model.Feedback;
import com.pCarpet.model.User;
import com.pCarpet.services.ExperienceService;
import com.pCarpet.services.FeedbackService;
import com.pCarpet.services.PrincipiService;

import lombok.Data;

@Controller
@RequestMapping("/Experience")
public class ExperienceController {
	private final ExperienceService experienceService;
	private final PrincipiService principiService;
	private FeedbackService feedbackservice;
	private ExperienceDTO experienceDTO = new ExperienceDTO();
	private Experience experience = new Experience();
	private Feedback feedback = new Feedback();
	private ExperienceConverter experienceConverter = new ExperienceConverter();
	private FeedbackDTO feedbackDTO = new FeedbackDTO();
	private FeedbackConverter feedbackconverter = new FeedbackConverter();
	private PrincipiConverter principiConverter = new PrincipiConverter();
	int valore = 0;
	
	
	@Autowired
	public ExperienceController (ExperienceService experienceService,PrincipiService principiService ) {
		this.experienceService = experienceService;
		this.principiService = principiService;
	}
	
	@RequestMapping(value="/openInsertExperience",method= RequestMethod.GET)
	public String openInsertUser(HttpServletRequest request) {
		int principio = Integer.parseInt(request.getParameter("principio"));
		request.getSession().setAttribute("principio", principio); 
		List <PrincipiDTO> listaPrincipi = principiService.getAllPrincipi();
		request.getSession().setAttribute("listaPrincipi", listaPrincipi); 
		return "insertExperience";
	}
	
	@RequestMapping(value="/insertExperience", method= RequestMethod.GET)
	public String insertUser(HttpServletRequest request) {
		 User user =  (User) request.getSession().getAttribute("utente");
		 UserDTO userDTO = ConverterUser.toDTO(user);
		 int id_user = userDTO.getIdUser();
		 String commento= request.getParameter("commento");
	     String positivo = request.getParameter("positivo");
	     String negativo = request.getParameter("negativo");
	     int idpprincipale = (int) request.getSession().getAttribute("principio");
	     int score = Integer.parseInt(request.getParameter("score"));
	     String[]  ids_principi = request.getParameterValues("idsprincipi[]");
	     
	     experienceDTO.setCommento(commento);
	     experienceDTO.setPositivo(positivo);
	     experienceDTO.setNegativo(negativo);
	     experienceDTO.setScore(score);
	     experienceDTO.setUser(user);
	     Experience ex = experienceService.insertExperience(experienceDTO);
	     int id_experience = ex.getIdExperience();
	     
         if( ids_principi !=null) {
       	     feedbackDTO.setExperience(ex);
       	     PrincipiDTO p = principiService.getPrincipio(idpprincipale);
	    	 feedbackDTO.setPrincipi(PrincipiConverter.convertToEntity(p));
	    	 feedbackDTO.setSecondario(valore);
	    	 this.feedbackservice.insertFeedback(feedbackDTO);
	     for (int i = 0; i < ids_principi.length; i ++) {
	    	 String a = ids_principi[i];
	    	 int id = Integer.parseInt(a);
	    	 int second = 0;
	    	 if(id != idpprincipale)
	    		 second = 1;
	    	 
	    	 feedbackDTO.setExperience(ex);
	    	 PrincipiDTO b = principiService.getPrincipio(id);
	         feedbackDTO.setPrincipi(PrincipiConverter.convertToEntity(b));
	    	 feedbackDTO.setSecondario(second);
	    	 this.feedbackservice.insertFeedback(feedbackDTO);
	      }
        }
        else {
        	feedbackDTO.setExperience(ex);
        	PrincipiDTO p = principiService.getPrincipio(idpprincipale);
        	feedbackDTO.setPrincipi(PrincipiConverter.convertToEntity(p));
        	feedbackDTO.setSecondario(valore);
	    	this.feedbackservice.insertFeedback(feedbackDTO);
        }
		
		return "Experience";
	}
	

}
