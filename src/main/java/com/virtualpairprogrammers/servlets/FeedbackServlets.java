package com.virtualpairprogrammers.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.virtualpairprogrammers.dto.ExperienceDTO;
import com.virtualpairprogrammers.dto.FeedbackDTO;
import com.virtualpairprogrammers.service.FeedbackService;

public class FeedbackServlets extends HttpServlet {

private final FeedbackService feedbackService = new FeedbackService();

private static int idFeedback = 0;
 @Override
public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
final HttpSession session = request.getSession();
		if (request != null) {
			final String action = request.getParameter("action").toString();
			if(action != null) {
			switch(action) {

			case "chooseFeedback":{

			idFeedback = Integer.parseInt(request.getParameter("id").toString());
			//session.setAttribute("idFeedbackScelto", idFeedback);
		//	session.setAttribute("showFeedback", "list");
			//callShowView(session, request, response);
			break;
			case "choose":

				if(idFeedback == 0)
						getServletContext().getRequestDispatcher("/ExperienceServlet?action=chooseFeedbackManagement").forward(request, response);
				else {

						session.setAttribute("showExperience", "choose");

						callShowView(session, request, response);
					}
			break;
				
			case "return":
				getServletContext().getRequestDispatcher("/Experience.jsp").forward(request, response);
				break;
			} 
			

			
			}
			
			}
			
			
		}
 }

/*
	private void callShowView(HttpSession session, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		

		List<FeedbackDTO> feedback = feedbackService.getFeedback();

		session.setAttribute("feedbackList", feedback);

		getServletContext().getRequestDispatcher("/ExperienceJsp.jsp").forward(request, response);

	}*/

}