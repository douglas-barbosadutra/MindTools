package com.virtualpairprogrammers.service;

import java.util.ArrayList;
import java.util.List;

import com.virtualpairprogrammers.converter.FeedbackConverter;
import com.virtualpairprogrammers.dao.FeedbackDAO;
import com.virtualpairprogrammers.dto.FeedbackDTO;
import com.virtualpairprogrammers.model.Feedback;

/**
 * Classe che si occupa di interfacciarsi con la persistenza e recuperare
 * attraverso i metodi del Data Access Object le tuple desiderate, Le converte
 * in un oggetto DTO e le restituisce al controller opportuno
 */
public class FeedbackService {

	private FeedbackDAO feedbackDAO;
	private FeedbackDTO feedbackDTO;

	

	public FeedbackService() {
		this.feedbackDAO = new FeedbackDAO();
		this.feedbackDTO = new FeedbackDTO();
	}

	/**
	 * Come vediamo la lista recuperata è di tipo Esempio ma noi la convertiamo in EsempioDTO
	 * Invito chi fa i converter a fare un metodo per convertire direttamente la lista senza farli uno ad uno perchè è sporco e poco efficiente
	 */
	/*public User  getUser() {
		List<User> list = userDAO.getAllUser();
		
		List<UserDTO> listDTO = new ArrayList<>();
		User user1;
		for (User user : list) {
			user1= UserConverter.toEntity(userDTO);
			listDTO.add(user1);

			
			
		}
		return listDTO;
	}
	*/
	
	
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
	
}
