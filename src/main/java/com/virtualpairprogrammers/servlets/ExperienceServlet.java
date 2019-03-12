package com.virtualpairprogrammers.servlets;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.virtualpairprogrammers.converter.ExperienceConverter;
import com.virtualpairprogrammers.converter.FeedbackConverter;
import com.virtualpairprogrammers.converter.UserConverter;
import com.virtualpairprogrammers.dao.FeedbackDAO;
import com.virtualpairprogrammers.dto.ExperienceDTO;
import com.virtualpairprogrammers.dto.FeedbackDTO;
import com.virtualpairprogrammers.dto.PrincipiDTO;
import com.virtualpairprogrammers.dto.UserDTO;
import com.virtualpairprogrammers.model.Experience;
import com.virtualpairprogrammers.model.Feedback;
import com.virtualpairprogrammers.model.User;
import com.virtualpairprogrammers.service.ExperienceService;
import com.virtualpairprogrammers.service.FeedbackService;
import com.virtualpairprogrammers.service.PrincipiService;
import com.virtualpairprogrammers.service.UsersService;


public class ExperienceServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final ExperienceService experienceService = new ExperienceService();
	private Experience experience = new Experience();
	private ExperienceDTO experienceDTO = new ExperienceDTO();
	private ExperienceConverter experienceConverter = new ExperienceConverter();
	private List<ExperienceDTO> listaExperienceDTO =null;
	private FeedbackDTO feedbackDTO = new FeedbackDTO();
	private FeedbackConverter feedbackconverter = new FeedbackConverter();
	private FeedbackService feedbackservice = new FeedbackService();
	private UserConverter userConverter = new UserConverter();
	private PrincipiDTO principiDTO= new PrincipiDTO();
	private PrincipiService principiServiceDTO;
	private User user = new User();
	private Feedback feedback;
	int valore = 0;
	
	
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final HttpSession session = request.getSession();
		principiServiceDTO = new PrincipiService();
		switch (request.getParameter("action").toString()) {
		 case("allExperiences"):
			 
		     List<ExperienceDTO> listaExperienceDTO = experienceService.getAllExperience();
		     
		     request.setAttribute("allExperiences", "listaExperienceDTO");
       	     getServletContext().getRequestDispatcher("/Experience.jsp").forward(request, response);
		 case ("Insert_Experience"):
		     UserDTO user = (UserDTO) session.getAttribute("utente");
		     int id_user = user.getIduser();
			 String commento= request.getParameter("commento");
		     String positivo = request.getParameter("positivo");
		     String negativo = request.getParameter("negativo");
		     System.out.println("Sono QUI 1!!!");
		     int score = Integer.parseInt(request.getParameter("score"));
		     String [] ids_principi = request.getParameterValues("ids_principi[]");
		     System.out.println("Sono QUI 2!!!");
		     //principiDTO = this.principiServiceDTO.getPrincipio(Integer.parseInt(request.getAttribute("id").toString()));
			 int idpprincipale = Integer.parseInt(request.getParameter("id"));  // <--- Non funziona da qui
			 System.out.println("idpprincipale" + idpprincipale);
		     experienceDTO.setCommento(commento);
		     experienceDTO.setPositivo(positivo);
		     experienceDTO.setNegativo(negativo);
		     experienceDTO.setScore(score);
		     experienceDTO.setId_user(id_user);
		     experience = this.experienceConverter.toEntity(experienceDTO);
		     this.experienceService.insertExperience(experience);
		     
		     int id_experience = experienceService.getLastRecord(UserConverter.toEntity(user)).getId_user();
		     
             
             if( ids_principi.length > 0) {
		     for (int i = 0; i < ids_principi.length; i ++) {
		    	 int id = Integer.parseInt(ids_principi[i]);
		    	 int second = -1;
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
            	 
             }
            
             /*
		     listaExperienceDTO = experienceService.getAllExperience();
		     request.setAttribute("allExperiences", listaExperienceDTO);*/
             
		     getServletContext().getRequestDispatcher("/Experience.jsp").forward(request, response);
		     break;

		 	
		}

 
 			
			
			
	
	
	
	}
		
		
		
		
		
}
