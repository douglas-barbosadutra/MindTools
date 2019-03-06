package com.virtualpairprogrammers.service;

import java.util.ArrayList;
import java.util.List;

import com.virtualpairprogrammers.converter.PrincipiConverter;
import com.virtualpairprogrammers.dao.PrincipiDAO;
import com.virtualpairprogrammers.dto.PrincipiDTO;
import com.virtualpairprogrammers.model.Principi;

public class PrincipiServiceDTO {
	

	private final PrincipiDAO principiDAO;

	public PrincipiServiceDTO() {
		this.principiDAO = new PrincipiDAO();
	}
   
	public List<PrincipiDTO> getAllPrincipi () {
    	
    	List<Principi> list = principiDAO.getAllPrincipi();
    	List<PrincipiDTO> listDTO = new ArrayList<>();
    	
    	for (Principi principi : list) {
    		listDTO.add(PrincipiConverter.toDTO(principi));
    		
    }
 
	return listDTO;
	
	}

	public PrincipiDTO getPrincipio(int id_principi) {
		return PrincipiConverter.toDTO(principiDAO.getPrincipio(id_principi));
	}

}
