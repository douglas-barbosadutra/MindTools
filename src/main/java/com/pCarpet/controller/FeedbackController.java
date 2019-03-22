package com.pCarpet.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pCarpet.dto.FeedbackDTO;
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
		String showFeedback = request.getParameter("showFeedback");
		final List<FeedbackDTO> List = null;
		request.getSession().setAttribute("feedback_list", showFeedback);
		
		return "feedback";

	}


}
