package com.pCarpet.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pCarpet.converter.ConverterUser;
import com.pCarpet.dto.PrincipiDTO;
import com.pCarpet.dto.UserDTO;
import com.pCarpet.model.User;
import com.pCarpet.services.ExperienceService;
import com.pCarpet.services.PrincipiService;

@Controller
@RequestMapping("/Experience")
public class ExperienceController {
	private final ExperienceService experienceService;
	private final PrincipiService principiService;
	
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
		
		 String commento= request.getParameter("commento");
	     String positivo = request.getParameter("positivo");
	     String negativo = request.getParameter("negativo");
	     int idpprincipale = Integer.parseInt(request.getParameter("id")) ;
	     int score = Integer.parseInt(request.getParameter("score"));
	     String[]  ids_principi = request.getParameterValues("idsprincipi[]");
	     /*
	     experienceDTO.setCommento(commento);
	     experienceDTO.setPositivo(positivo);
	     experienceDTO.setNegativo(negativo);
	     experienceDTO.setScore(score);
	     experienceDTO.setId_user(id_user);
	     experience = this.experienceConverter.toEntity(experienceDTO);
	     this.experienceService.insertExperience(experience); 
	     Experience ex = experienceService.getLastRecord(user);
	     int id_experience = ex.getId_experience();
	    
        if( ids_principi !=null) {
       	 feedbackDTO.setId_experience(id_experience);
	    	 feedbackDTO.setId_principi(idpprincipale);
	    	 feedbackDTO.setSecondario(valore);
	    	 feedback = FeedbackConverter.toEntity(feedbackDTO);
	    	 this.feedbackservice.insertFeedback(feedback);
	     for (int i = 0; i < ids_principi.length; i ++) {
	    	 String a = ids_principi[i];
	    	 int id = Integer.parseInt(a);
	    	 int second = 0;
	    	 if(id != idpprincipale)
	    		 second = 1;
	    	 
	    	 feedbackDTO.setId_experience(id_experience);
	    	 feedbackDTO.setId_principi(id);
	    	 feedbackDTO.setSecondario(second);
	    	 feedback = FeedbackConverter.toEntity(feedbackDTO);
	    	 this.feedbackservice.insertFeedback(feedback);
	      }
        }
        else {
       	 feedbackDTO.setId_experience(id_experience);
	    	 feedbackDTO.setId_principi(idpprincipale);
	    	 feedbackDTO.setSecondario(valore);
	    	 feedback = FeedbackConverter.toEntity(feedbackDTO);
	    	 this.feedbackservice.insertFeedback(feedback);
       	 */

		
		
		return "Experience";
	}
	

}
