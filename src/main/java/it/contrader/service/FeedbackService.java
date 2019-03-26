package it.contrader.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import it.contrader.converter.ExperienceConverter;
import it.contrader.converter.FeedbackConverter;

import it.contrader.dao.FeedbackRepository;
import it.contrader.dto.FeedbackPrincipiExperienceDTO;
import it.contrader.dao.PrincipiDAO;
import it.contrader.dto.ExperienceDTO;
import it.contrader.dto.FeedbackDTO;
import it.contrader.dto.PrincipiDTO;
import it.contrader.model.Experience;
import it.contrader.model.Feedback;
import it.contrader.model.Principi;


@Service
public class FeedbackService {
		

private final FeedbackRepository FeedbackRepository;
private final PrincipiService PrincipiService;
private FeedbackPrincipiExperienceDTO feedbackPrincipiExperienceDTO;

   @Autowired
 	public FeedbackService( FeedbackRepository feedbackrepository, PrincipiService PrincipiService) {

		this.FeedbackRepository = feedbackrepository;
		this.PrincipiService = PrincipiService;
		

	}

public List<FeedbackDTO> getListaFeedbackDTO() {
return FeedbackConverter.toListDTO ((List<Feedback>) FeedbackRepository.findAll());
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
	
	public List<FeedbackDTO> getFeedbackByIdExperience(int id_experience)
	 {
		Experience ex = new Experience();
		ex.setIdExperience(id_experience);
		 List<Feedback> lista = FeedbackRepository.findAllByExperience(ex);
		 List<FeedbackDTO> listfeedbackDTO = new ArrayList();
		 lista.forEach(feedback->listfeedbackDTO.add(FeedbackConverter.toDTO(feedback)));
		 
			return listfeedbackDTO;
			
		}
	 public FeedbackPrincipiExperienceDTO getFeedbackPrincipiExperienceDTO (int id_experience){
		 List<FeedbackDTO> feedbacks = getFeedbackByIdExperience(id_experience);
		 List<PrincipiDTO> principi = this.PrincipiService.getAllPrincipi();
		 FeedbackPrincipiExperienceDTO nuovoFeedback = new FeedbackPrincipiExperienceDTO();
		 List<PrincipiDTO> secondari = new ArrayList<PrincipiDTO>();
		 for (FeedbackDTO f: feedbacks) {
			 for (PrincipiDTO p : principi ) {
				 if( f.getExperience().getIdExperience() == id_experience && f.getPrincipi().getIdPrincipi() == p.getIdPrincipi()) { 
					 if(f.getSecondario() == 0) {
						 nuovoFeedback.setId_principi(f.getPrincipi().getIdPrincipi());
						 nuovoFeedback.setId_experience(f.getExperience().getIdExperience());
						 nuovoFeedback.setNome_principioITA(p.getNomeIta());
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
	 
	 public List<PrincipiDTO> listaPrincipiSecondari(int id_experience)
	 {
		 FeedbackPrincipiExperienceDTO principiSeconda = getFeedbackPrincipiExperienceDTO (id_experience);
		 
		 List<PrincipiDTO> este = principiSeconda.getSecondari();
          return este;		 
	 }

	
	 
	 

} 




    

   

    

