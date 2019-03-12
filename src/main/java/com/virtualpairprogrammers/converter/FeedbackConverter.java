package com.virtualpairprogrammers.converter;

import java.util.ArrayList;
import java.util.List;


import com.virtualpairprogrammers.dto.FeedbackDTO;
import com.virtualpairprogrammers.model.Feedback;

/**
 * Il converter si occupa di "convertire" un model in un dto e viceversa
 *
 */
public class FeedbackConverter {


	/**
	 * Converte un NodesDTO in Nodes
	 */
	public static Feedback toEntity(FeedbackDTO feedbackDTO) {

		Feedback feedback = null;
		//UserDTO usersDTO = new UserDTO();
		if (feedbackDTO != null) {
			 feedbackDTO = new FeedbackDTO();
		}
		return feedback;
		
		
	}
	
	
	 
	public static FeedbackDTO toDTO(Feedback feedback) {

		FeedbackDTO feedbackDTO = null;
		if (feedback != null) {
         feedbackDTO = new FeedbackDTO();
         feedbackDTO.setId_experience(feedback.getId_experience());
         feedbackDTO.setId_principi(feedback.getId_principi());
         feedbackDTO.setSecondario(feedback.getSecondario());
         feedbackDTO.setId_feedback(feedback.getId_feedback());
		}
		return feedbackDTO;
	}
	
	}
