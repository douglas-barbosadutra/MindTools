package com.virtualpairprogrammers.service;

import java.util.ArrayList;
import java.util.List;

import com.virtualpairprogrammers.converter.FeedbackConverter;
import com.virtualpairprogrammers.dao.FeedbackDAO;
import com.virtualpairprogrammers.dto.FeedbackDTO;
import com.virtualpairprogrammers.dto.FeedbackPrincipiExperienceDTO;
import com.virtualpairprogrammers.dto.PrincipiDTO;
import com.virtualpairprogrammers.model.Experience;
import com.virtualpairprogrammers.model.Feedback;


/**
 * Classe che si occupa di interfacciarsi con la persistenza e recuperare
 * attraverso i metodi del Data Access Object le tuple desiderate, Le converte
 * in un oggetto DTO e le restituisce al controller opportuno
 */
public class FeedbackService {

	private FeedbackDAO feedbackDAO;
	private FeedbackDTO feedbackDTO;
	private PrincipiService principiService ;
	

	

 	public FeedbackService() {
		this.feedbackDAO = new FeedbackDAO();
		this.feedbackDTO = new FeedbackDTO();
		this.principiService =  new PrincipiService();
	}

	/**
	 * Come vediamo la lista recuperata è di tipo Esempio ma noi la convertiamo in EsempioDTO
	 * Invito chi fa i converter a fare un metodo per convertire direttamente la lista senza farli uno ad uno perchè è sporco e poco efficiente
	 */
	
	public List<FeedbackDTO>  AllFeedback(){
		List<Feedback> list = new ArrayList<>();
		list = feedbackDAO.getAllFeedback();
		
		List<FeedbackDTO> listDTO = new ArrayList<>();
		
		for (Feedback f : list) {
			
			FeedbackDTO feedback= FeedbackConverter.toDTO(f);
			listDTO.add(feedback);
		}   
		return listDTO;
	}
	public List<FeedbackDTO> FeedbackByIdExperience(){
		List<Feedback> list = new ArrayList<>();
		list = feedbackDAO.getAllFeedback();
		
		List<FeedbackDTO> listDTO = new ArrayList<>();
		
		for (Feedback f : list) {
			
			FeedbackDTO feedback= FeedbackConverter.toDTO(f);
			listDTO.add(feedback);
		}   
		return listDTO;
	}
	
	
	
	/*public FeedbackDTO getUserByUsernameAndPassword(String username, String password) {
		return UserConverter.toDTO(userDAO.login(username, password));
	}
	*/
	
	public FeedbackDTO getFeedbackByDAO(FeedbackDAO feedbackDAO) {
		List<Feedback> list = feedbackDAO.getAllFeedback();
		Feedback feedback1 = list.get(0);
		feedbackDTO = FeedbackConverter.toDTO(feedback1);
		return feedbackDTO;
		
	}
	
	public boolean insertFeedback (Feedback feedback) {
	    return this.feedbackDAO.insertFeedback(feedback);
        
    }
	
	
	 public List<FeedbackDTO> getFeedbackByIdExperience(int id_experience)
	 {
		 List<Feedback> lista = feedbackDAO.getFeedbackByIdExperience(id_experience);
		 List<FeedbackDTO> feedbackDTO = new ArrayList();
		 for (Feedback f : lista ) {
			 feedbackDTO.add(FeedbackConverter.toDTO(f));
		 }
			return feedbackDTO;
			
		}
	 
	 public FeedbackPrincipiExperienceDTO getAllFeedbackPrincipiExperienceDTO (int id_experience){
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
	 
	 public List<PrincipiDTO> listaPrincipiSecondari(int id_experience)
	 {
		 FeedbackPrincipiExperienceDTO principiSeconda = getAllFeedbackPrincipiExperienceDTO (id_experience);
		 
		 List<PrincipiDTO> este = principiSeconda.getSecondari();
          return este;		 
	 }
	 
	 

}
