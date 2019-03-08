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
import com.virtualpairprogrammers.dao.FeedbackDAO;
import com.virtualpairprogrammers.dto.ExperienceDTO;
import com.virtualpairprogrammers.dto.FeedbackDTO;
import com.virtualpairprogrammers.dto.UserDTO;
import com.virtualpairprogrammers.model.Experience;
import com.virtualpairprogrammers.model.Feedback;
import com.virtualpairprogrammers.model.User;
import com.virtualpairprogrammers.service.ExperienceService;
import com.virtualpairprogrammers.service.FeedbackService;
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
	private User user = new User();
	private Feedback feedback;
	
	
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final HttpSession session = request.getSession();
		switch (request.getParameter("action").toString()) {
		 case("allExperiences"):
		     List<ExperienceDTO> listaExperienceDTO = experienceService.getAllExperience();
		     session.setAttribute("allExperiences", "listaExperienceDTO");
       	     getServletContext().getRequestDispatcher("/Experience.jsp").forward(request, response);
		 case ("Insert_Experience"):
			/*System.out.println("ritorna l'id");
		    this.experienceService.getExperienceById_experienceAndId_user((String)session.)*/
			 int user_id = UsersService.getUser().getIduser();
			 
			 String commento= request.getParameter("commento");
		     String positivo = request.getParameter("positivo");
		     String negativo = request.getParameter("negativo");
		    /* int score = Integer.parseInt(request.getParameter("score").toString());
		     int idutente = 1;
		     int idprincipale = 20;
		     int secondario;
		     experienceDTO.setCommento(commento);
		     experienceDTO.setPositivo(positivo);
		     experienceDTO.setNegativo(negativo);
		     experienceDTO.setScore(score);
		     experienceDTO.setId_user(idutente);
		     experience = this.experienceConverter.toEntity(experienceDTO);
		     this.experienceService.insertExperience(experience);
		     int id_experience = experienceService.getLastRecord(user).getId_user();
             String [] ids_principi = request.getParameterValues("ids_principi[]");
		     for (int i = 0; i < ids_principi.length; i ++) {
		    	 int id = Integer.parseInt(ids_principi[i]);
		    	 int valore;
		    	 if(id != idprincipale)
		    		 valore = 1;
		    	 valore = 0;
		    	 feedbackDTO.setId_experience(id_experience);
		    	 feedbackDTO.setId_principi(id);
		    	 feedbackDTO.setSecondario(valore);
		    	 feedback = this.feedbackconverter.toEntity(feedbackDTO);
		    	 this.feedbackservice.insertFeedback(feedback);
		    			 
		    		 
		    	 
		     }*/
		     listaExperienceDTO = experienceService.getAllExperience();
		     request.setAttribute("allExperiences", listaExperienceDTO);
		     getServletContext().getRequestDispatcher("/Experience.jsp").forward(request, response);
		     break;

		 	
		}

 
 			
			
			
	
	
	
	}
		
		
		
		
		
}
