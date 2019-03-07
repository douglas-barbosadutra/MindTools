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
import com.virtualpairprogrammers.dto.ExperienceDTO;
import com.virtualpairprogrammers.dto.UserDTO;
import com.virtualpairprogrammers.model.Experience;
import com.virtualpairprogrammers.service.ExperienceService;
import com.virtualpairprogrammers.service.UsersService;


public class ExperienceServlet extends HttpServlet {

	private final ExperienceService experienceService = new ExperienceService();
	private Experience experience = new Experience();
	private ExperienceDTO experienceDTO = new ExperienceDTO();
	private ExperienceConverter experienceConverter = new ExperienceConverter();
	
	
	
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 switch (request.getParameter("pulsante")) {
		 case("allExperiences"):
		     List<ExperienceDTO> listaExperienceDTO = experienceService.getAllExperience();
       	     getServletContext().getRequestDispatcher("/Experience.jsp").forward(request, response);
		 case ("InsertExperience"):
			/*System.out.println("ritorna l'id");
		    this.experienceService.getExperienceById_experienceAndId_user((String)session.)*/
			 int user_id = UsersService.getUser().getIduser();
			 String commento= experienceConverter.toEntity(experienceDTO).getCommento();
		     String positivo = experienceConverter.toEntity(experienceDTO).getPositivo();
		     String negativo = experienceConverter.toEntity(experienceDTO).getNegativo();
		     int score = experienceConverter.toEntity(experienceDTO).getScore();
		     experienceDTO.setCommento(commento);
		     experienceDTO.setPositivo(positivo);
		     experienceDTO.setNegativo(negativo);
		     experienceDTO.setScore(score);
		     System.out.println("Creado objeto con exito");
		     experience = this.experienceConverter.toEntity(experienceDTO);
		     System.out.println("Conversion hecha con exito");
		     this.experienceService.insertExperience(experience);
		     getServletContext().getRequestDispatcher("/Experience.jsp").forward(request, response);
		     break;

		
		}

 
 			
			
			
	
	
	
	}
		
		
		
		
		
}
