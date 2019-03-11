package com.virtualpairprogrammers.service;

import java.util.ArrayList;
import java.util.List;

import com.virtualpairprogrammers.converter.ExperienceConverter;
import com.virtualpairprogrammers.dao.ExperienceDAO;
import com.virtualpairprogrammers.dao.UserDAO;
import com.virtualpairprogrammers.dto.ExperienceDTO;
import com.virtualpairprogrammers.model.Experience;
import com.virtualpairprogrammers.model.User;


/**
 * Classe che si occupa di interfacciarsi con la persistenza e recuperare
 * attraverso i metodi del Data Access Object le tuple desiderate, Le converte
 * in un oggetto DTO e le restituisce al controller opportuno
 */
public class ExperienceService {

	private final ExperienceDAO experienceDAO;
	private UserDAO userDAO;

	public ExperienceService() {
		this.experienceDAO = new ExperienceDAO();
	}

	/**
	 * Come vediamo la lista recuperata è di tipo Esempio ma noi la convertiamo in EsempioDTO
	 * Invito chi fa i converter a fare un metodo per convertire direttamente la lista senza farli uno ad uno perchè è sporco e poco efficiente
	 */
	public List<ExperienceDTO> getAllExperience() {
		List<Experience> list = experienceDAO.allExperiences();
		List<ExperienceDTO> listDTO = new ArrayList<>();

		for (Experience experience : list) {
			listDTO.add(ExperienceConverter.toDTO(experience));
		}

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
	
	
}
