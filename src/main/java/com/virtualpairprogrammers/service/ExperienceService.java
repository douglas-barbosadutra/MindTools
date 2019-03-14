package com.virtualpairprogrammers.service;

import java.util.ArrayList;
import java.util.List;

import com.virtualpairprogrammers.converter.ExperienceConverter;
import com.virtualpairprogrammers.dao.ExperienceDAO;
import com.virtualpairprogrammers.dao.UserDAO;
import com.virtualpairprogrammers.dto.ExperienceDTO;
import com.virtualpairprogrammers.dto.ExperienceUserFeedbackDTO;
import com.virtualpairprogrammers.dto.FeedbackDTO;
import com.virtualpairprogrammers.dto.UserDTO;
import com.virtualpairprogrammers.model.Experience;
import com.virtualpairprogrammers.model.User;
import com.virtualpairprogrammers.model.Feedback;
import com.virtualpairprogrammers.dao.FeedbackDAO;


/**
 * Classe che si occupa di interfacciarsi con la persistenza e recuperare
 * attraverso i metodi del Data Access Object le tuple desiderate, Le converte
 * in un oggetto DTO e le restituisce al controller opportuno
 */
public class ExperienceService {

	private ExperienceDAO experienceDAO;
	private ExperienceDTO experienceDTO;
	private UserDAO userDAO;
	private FeedbackDAO feedbackDAO;
	private UsersService usersService;
	
	private FeedbackService feedBackService;
	
	public ExperienceService() {
		this.experienceDAO = new ExperienceDAO();
		this.experienceDTO = new ExperienceDTO();
		this.usersService = new UsersService();
		this.feedBackService = new FeedbackService();
	}

	/**
	 * Come vediamo la lista recuperata è di tipo Esempio ma noi la convertiamo in EsempioDTO
	 * Invito chi fa i converter a fare un metodo per convertire direttamente la lista senza farli uno ad uno perchè è sporco e poco efficiente
	 */
	
	public Experience  getExperience(int id_experience) {
		Experience e =experienceDAO.getExperience(id_experience);
		return e;
	}

	
	 public boolean insertExperience (Experience experience) {
		    return this.experienceDAO.insertExperience(experience);
	        
	    }
	 
	 
	
	public List<ExperienceDTO> getAllExperiences(){
		 List<ExperienceDTO> list = new ArrayList<>();
		 List<Experience> ex = experienceDAO.allExperiences();
		 for (Experience experience : ex) {
			 list.add(ExperienceConverter.toDTO(experience));
		 }
		 return list;
	 } 
	
	 public List<ExperienceUserFeedbackDTO> getAllExperienceUserFeedbackDTO(){
		 List<ExperienceUserFeedbackDTO> listaexperienceUserFeedbackDTO = new ArrayList<ExperienceUserFeedbackDTO>();
		 List<UserDTO> users = this.usersService.getAllUsers();
		 List<ExperienceDTO> experiences = getAllExperiences();
		 List<FeedbackDTO> feedbacks = this.feedBackService.AllFeedback();
		 for (UserDTO u : users) {
			 for (ExperienceDTO e : experiences) {
				 for (FeedbackDTO f :feedbacks) {
					 if(u.getIduser() == e.getId_experience() && e.getId_experience() == f.getId_experience()&& f.getSecondario()==0) {
						 ExperienceUserFeedbackDTO nuovoDTO = new ExperienceUserFeedbackDTO();
						 nuovoDTO.setCognome(u.getCognome());
						 nuovoDTO.setNome(u.getNome());
						 nuovoDTO.setCommento(e.getCommento());
						 nuovoDTO.setScore(e.getScore());
						 nuovoDTO.setId_principi(f.getId_principi());
						 nuovoDTO.setId_experience(f.getId_experience());
						 listaexperienceUserFeedbackDTO.add(nuovoDTO);
					 }
					 
					 
				 }
			 }
		 }
		 
		 /*
		 for (ExperienceUserFeedbackDTO experienceDTO : listaexperienceUserFeedbackDTO) {
			 UserDTO userDTO = this.usersService.getUserById(experienceDTO.getId_user());

			 FeedbackDTO feedbackDTO = this.feedBackService.getFeedbackByIdExperience(experienceDTO.getId_experience());
			 
			 
			 nuovoDTO.setCognome(userDTO.getCognome());
			 nuovoDTO.setNome(userDTO.getNome());
			 nuovoDTO.setCommento(experienceDTO.getCommento());
			 nuovoDTO.setScore(experienceDTO.getScore());
			 nuovoDTO.setId_principi(feedbackDTO.getId_principi());

			 listaexperienceUserFeedbackDTO.add(nuovoDTO);
		 }*/
		 
		 return listaexperienceUserFeedbackDTO;
	 } 
     public List<ExperienceDTO>getExperiencebyIdUser(int id_user) {
    	 List<ExperienceDTO> expDTO = new ArrayList<ExperienceDTO>();
    	 List<Experience> experience = experienceDAO.getAllExperiencesByUser(id_user);
    	 for (Experience ex : experience) {
    		 expDTO.add(ExperienceConverter.toDTO(ex));
    	 }
    	 return expDTO;
    	 
    	 
     }
	 public Experience getLastRecord(UserDTO user) {
		 Experience ex = experienceDAO.ultimoRecord(user) ;
		 return ex;
	 }


     }
