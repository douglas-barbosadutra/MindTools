package com.pCarpet.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pCarpet.dto.FeedbackDTO;
import com.pCarpet.dto.FeedbackPrincipiExperienceDTO;
import com.pCarpet.dto.PrincipiDTO;
import com.pCarpet.services.FeedbackService;

import java.util.List;

@Controller
@RequestMapping("/Feedback")
public class FeedbackController {

	private FeedbackService feedbackService;
	@Autowired
	public FeedbackController(FeedbackService feedbackService) {
		this.feedbackService = feedbackService;
	}
	
	
	@RequestMapping(value="/showFeedback",method= RequestMethod.GET)
	public String showFeedback(HttpServletRequest request) {
		int idprincipio = Integer.parseInt(request.getParameter("id"));
		FeedbackPrincipiExperienceDTO feedb = feedbackService.getFeedbackPrincipiExperienceDTO(idprincipio);
		List<PrincipiDTO> secondari = feedbackService.listaPrincipiSecondari(idprincipio);
		request.getSession().setAttribute("feedback", feedb);
		request.getSession().setAttribute("secondari", secondari);
		
		return "AllFeedback";

	}


}
