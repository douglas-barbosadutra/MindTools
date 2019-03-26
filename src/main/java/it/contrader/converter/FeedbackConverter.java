package com.it.contrader.converter;
import java.util.ArrayList;
import java.util.List;

import com.it.contrader.dto.FeedbackDTO;
import com.it.contrader.model.Feedback;
import com.it.contrader.model.Experience;
import com.it.contrader.model.Principi;

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

	

