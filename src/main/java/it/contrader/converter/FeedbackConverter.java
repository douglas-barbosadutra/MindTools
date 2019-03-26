package com.pCarpet.converter;
import java.util.ArrayList;
import java.util.List;

import com.pCarpet.dto.FeedbackDTO;
import com.pCarpet.model.Feedback;
import com.pCarpet.model.Experience;
import com.pCarpet.model.Principi;

public class FeedbackConverter {
	
	public static FeedbackDTO toDTO(Feedback f) {
		
		FeedbackDTO feedbackDTO = new FeedbackDTO();
		feedbackDTO.setIdFeedback(f.getIdFeedback());
		feedbackDTO.setExperience(f.getExperience());
		feedbackDTO.setPrincipi(f.getPrincipi());
		feedbackDTO.setSecondario(f.getSecondario());
		
		
		return feedbackDTO;	
}
	
 
public static Feedback toEntity(FeedbackDTO feedbackDTO) {
	Feedback feedback = null;
	if (feedbackDTO != null) {
		feedback = new Feedback();
		feedback.setIdFeedback(feedbackDTO.getIdFeedback());
		feedback.setExperience(feedbackDTO.getExperience());
		feedback.setPrincipi(feedbackDTO.getPrincipi());
		feedback.setSecondario(feedbackDTO.getSecondario());
	}
	
	
	return feedback;
}

public static List<FeedbackDTO> toListDTO(List<Feedback> list){
	List<FeedbackDTO> listFeedbackDTO = new ArrayList<>();
	for(Feedback Feedback : list) {
	listFeedbackDTO.add(FeedbackConverter.toDTO(Feedback));
}
return listFeedbackDTO;
}


public static List<Feedback> toListEntity(List<FeedbackDTO> listFeedbackDTO){
	List<Feedback> list = new ArrayList<>();
	for(FeedbackDTO FeedbackDTO : listFeedbackDTO) {
	list.add(FeedbackConverter.toEntity(FeedbackDTO));
}
return list;
}
}

	

