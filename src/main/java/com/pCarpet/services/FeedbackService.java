package com.pCarpet.services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.pCarpet.converter.ExperienceConverter;
import com.pCarpet.converter.FeedbackConverter;

import com.pCarpet.dao.FeedbackRepository;
import com.pCarpet.dto.ExperienceDTO;
import com.pCarpet.dto.FeedbackDTO;
import com.pCarpet.dto.PrincipiDTO;
import com.pCarpet.model.Experience;
import com.pCarpet.model.Feedback;
import com.pCarpet.model.Principi;


@Service
public class FeedbackService {
		

private final FeedbackRepository FeedbackRepository;

   @Autowired
 	public FeedbackService( FeedbackRepository feedbackrepository) {

		this.FeedbackRepository = feedbackrepository;

	}

public List<FeedbackDTO> getListaFeedbackDTO() {
return FeedbackConverter.toListDTO ((List<Feedback>) FeedbackRepository.findAll());
}

/*public List<FeedbackDTO> getAllFeedback(Experience experience, Principi principi){
	Experience e = new Experience();
	Principi p = new Principi();

	e.getIdExperience(experience);
    p.getIdPrincipi(principi);
    
	return(FeedbackConverter.convertToDTO(this.FeedbackRepository.findByPrincipi()));
} */


	
public static List<Feedback> findByPrincipi(Principi p) {
	List<Feedback> listDTO = new ArrayList<>();
	for (Feedback f : listDTO) {
//		FeedbackDTO feedback= FeedbackConverter.convertToDTO(f);
		listDTO.add(f);
	}   
	return listDTO;
}

public static List<Feedback> findByExperience(Experience e) {
	List<Feedback> listDTO = new ArrayList<>();
	for (Feedback f : listDTO) {
//		FeedbackDTO feedback= FeedbackConverter.convertToDTO(f);
		listDTO.add(f);
	}   
	return listDTO;

}
		
	

	
	public void insertFeedback (FeedbackDTO feedback) {

		
		FeedbackRepository.save(FeedbackConverter.toEntity(feedback));
	    
    }
	public List<FeedbackDTO> getAllFeedback(){
		List<FeedbackDTO> fb = new ArrayList();
		List<Feedback> entity = (List<Feedback>) FeedbackRepository.findAll();
		entity.forEach(feedback->fb.add(FeedbackConverter.toDTO(feedback)));
		return fb;
	}
	
	/* public List<FeedbackDTO> getFeedbackByIdExperience(int id_experience)
	 {
		 List<Feedback> lista = feedbackDAO.getFeedbackByIdExperience(id_experience);
		 List<FeedbackDTO> feedbackDTO = new ArrayList();
		 for (Feedback f : lista ) {
			 feedbackDTO.add(FeedbackConverter.toDTO(f));
		 }
			return feedbackDTO;
			
		}
	 
	 
	 public FeedbackPrincipiExperienceDTO getFeedbackPrincipiExperienceDTO (int id_experience){
		 List<FeedbackDTO> feedbacks = getFeedbackByIdExperience(id_experience);
		 List<PrincipiDTO> principi = this.principiService.getAllPrincipi();
		 FeedbackPrincipiExperienceDTO nuovoFeedback = new FeedbackPrincipiExperienceDTO();
		 List<PrincipiDTO> secondari = new ArrayList<PrincipiDTO>();
		 for (FeedbackDTO f: feedbacks) {
			 for (PrincipiDTO p : principi ) {
				 if( f.getId_experience() == id_experience && f.getId_principi() == p.getId_principi()) { 
					 if(f.getSecondario() == 0) {
						 nuovoFeedback.setId_principi(f.getId_principi());
						 nuovoFeedback.setId_experience(f.getId_experience());
						 nuovoFeedback.setNome_principioITA(p.getNomeita());
						 nuovoFeedback.setNome_principiING(p.getNome());
						 nuovoFeedback.setSecondario(f.getSecondario());
						 break;
					 }
					 else 
					 {
						 secondari.add(p);
						 break;
					 }
				 }
			 }
			 
			 nuovoFeedback.setSecondari(secondari);
			
			
		 }
		 
		 return nuovoFeedback;
		 
	 } 
	 
	 public List<PrincipiDTO> listaPrincipiSecondari(List<PrincipiDTO> id_experience)
	 {
		 FeedbackPrincipiExperienceDTO principiSeconda = getFeedbackPrincipiExperienceDTO (id_experience);
		 
		
          return id_experience;		 
	 }

	private FeedbackPrincipiExperienceDTO getFeedbackPrincipiExperienceDTO(int id_experience) {
		// TODO Auto-generated method stub
		return null;
	}
	 
	 

} */




    

   

    

}
