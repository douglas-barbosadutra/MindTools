package com.virtualpairprogrammers.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.virtualpairprogrammers.dto.ExperienceDTO;
import com.virtualpairprogrammers.dto.FeedbackDTO;
import com.virtualpairprogrammers.dto.FeedbackPrincipiExperienceDTO;
import com.virtualpairprogrammers.service.FeedbackService;

public class FeedbackServlets extends HttpServlet {

private  FeedbackService feedbackService;
private FeedbackPrincipiExperienceDTO feedbacks;


 @Override
public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
final HttpSession session = request.getSession();
		if (request != null) {
			final String action = request.getParameter("action").toString();
			if(action != null) {
			switch(action) {

			case "chooseFeedback":{
			feedbacks = this.feedbackService.getAllFeedbackPrincipiExperienceDTO(Integer.parseInt(request.getParameter("id").toString()));
			request.setAttribute("feedbackList", feedbacks);
			getServletContext().getRequestDispatcher("/NewFeedback.jsp").forward(request, response);
			
			break;
			}
			
			
			
			case "return":
				getServletContext().getRequestDispatcher("/Experience.jsp").forward(request, response);
				break;
			} 
			

			
			}
			
			
 }

}
 
}