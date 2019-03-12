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


/**
 * Classe che si occupa di interfacciarsi con la persistenza e recuperare
 * attraverso i metodi del Data Access Object le tuple desiderate, Le converte
 * in un oggetto DTO e le restituisce al controller opportuno
 */
public class ExperienceService {

	private ExperienceDAO experienceDAO;
	private UsersService usersService;
	private FeedbackService feedBackService;
	
	public ExperienceService() {
		this.experienceDAO = new ExperienceDAO();
		this.usersService = new UsersService();
		this.feedBackService = new FeedbackService();
	}

	/**
	 * Come vediamo la lista recuperata è di tipo Esempio ma noi la convertiamo in EsempioDTO
	 * Invito chi fa i converter a fare un metodo per convertire direttamente la lista senza farli uno ad uno perchè è sporco e poco efficiente
	 */
	public List<ExperienceDTO> getAllExperienceDTO() {
		List<ExperienceDTO> listDTO = experienceDAO.getAllExperiences();
		 
		return listDTO;
	}
	public Experience  getExperience(int id_experience) {
		Experience e =experienceDAO.getExperience(id_experience);
		return e;
	}

	
	 public boolean insertExperience (Experience experience) {
		    return this.experienceDAO.insertExperience(experience);
	        
	    }
	 
	 public ExperienceDTO getLastRecord(User user) {
		 ExperienceDTO ex = ExperienceConverter.toDTO(experienceDAO.ultimoRecord(user)) ;
		 return ex;
	 }
	 public String[][] matrixGetAllExperiences(){
		 String[][] n =  experienceDAO.matrixGetAllExperiences();
		 return n;
	 }
	 
	 public List<ExperienceDTO> getAllExperiences(){
		 
		 List<ExperienceDTO> list = experienceDAO.getAllExperiences();
		 return list;
	 } 
	
	 public List<ExperienceUserFeedbackDTO> getAllExperienceUserFeedbackDTO(){
		 List<ExperienceUserFeedbackDTO> listaexperienceUserFeedbackDTO = new ArrayList<ExperienceUserFeedbackDTO>();
		 
		 //List<ExperienceDTO> list = experienceDAO.getAllExperiences();
		 //corregere chiamata per convertere il DTO
		 
		 for (ExperienceDTO experienceDTO : list) {
			 UserDTO userDTO = this.usersService.getUserById(experienceDTO.getId_user());

			 //Creare methodo in FeedbackDAO chiamata per prendere il FeedbackDTO
			 //Creare methodo in feedBackService per prendere la lista de uSer converer DTO
			 FeedbackDTO feedbackDTO = this.feedBackService.getFeedbackByIdExperience(experienceDTO.getId_experience());
			 
			 ExperienceUserFeedbackDTO nuovoDTO = new ExperienceUserFeedbackDTO();
			 nuovoDTO.setCognome(userDTO.getCognome());
			 nuovoDTO.setNome(userDTO.getNome());
			 nuovoDTO.setCommento(experienceDTO.getCommento());
			 nuovoDTO.setScore(experienceDTO.getScore());
			 nuovoDTO.setId_principi(feedbackDTO.getId_principi());

			 listaexperienceUserFeedbackDTO.add(nuovoDTO);
		 }
		 
		 return listaexperienceUserFeedbackDTO;
	 } 
}
