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
import com.virtualpairprogrammers.service.UserService;

public class ExperienceServlet extends HttpServlet {

	private final ExperienceService experienceService = new ExperienceService();
	
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

 
 			List<ExperienceDTO> listaExperienceDTO = experienceService.getAllExperience();
 			request.setAttribute("allExperiences", listaExperienceDTO);
			getServletContext().getRequestDispatcher("/Experience.jsp").forward(request, response);
			
			
	
	
	
	}
		
		
		
		
		
}
