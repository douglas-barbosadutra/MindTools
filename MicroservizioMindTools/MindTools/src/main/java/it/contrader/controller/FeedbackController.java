package it.contrader.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.contrader.dto.FeedbackDTO;
import it.contrader.dto.FeedbackPrincipiExperienceDTO;
import it.contrader.dto.PrincipiDTO;

import it.contrader.service.FeedbackService;

import java.util.List;

@CrossOrigin(value="*")
@RestController
@RequestMapping("/Feedback")
public class FeedbackController {

	private FeedbackService feedbackService;
	@Autowired
	public FeedbackController(FeedbackService feedbackService) {
		this.feedbackService = feedbackService;
	}
	
	
	@RequestMapping(value="/showFeedback",method= RequestMethod.GET)
	public ResponseEntity<List<PrincipiDTO>> showFeedback(@RequestParam(value = "idExperience" )int idExperience) {

		FeedbackPrincipiExperienceDTO feedb = feedbackService.getFeedbackPrincipiExperienceDTO(idExperience);
		List<PrincipiDTO> secondari = feedbackService.listaPrincipiSecondari(idExperience);
		System.out.println(secondari.toString());
		return ResponseEntity.status(HttpStatus.OK).body(secondari);

	}
	
	





}
