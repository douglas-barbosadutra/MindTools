package com.virtualpairprogrammers.service;

import java.util.ArrayList;
import java.util.List;


import com.virtualpairprogrammers.converter.PrincipiItaConverter;
import com.virtualpairprogrammers.dao.PrincipiItaDAO;
import com.virtualpairprogrammers.dto.PrincipiItaDTO;
import com.virtualpairprogrammers.model.PrincipiIta;

public class PrincipiItaService {
	

	private final PrincipiItaDAO principiitaDAO;

	public PrincipiItaService() {
		this.principiitaDAO = new PrincipiItaDAO();
	}
   
	public List<PrincipiItaDTO> getAllPrincipiita () {
    	
    	List<PrincipiIta> list = principiitaDAO.getAllPrincipiIta();
    	List<PrincipiItaDTO> listDTO = new ArrayList<>();
    	
    	for (PrincipiIta principiita : list) {
    		listDTO.add(PrincipiItaConverter.toDTO(principiita));
    		
    }
 
	return listDTO;
	
	}

	public PrincipiItaDTO getPrincipio(int idprincipioita) {
		return PrincipiItaConverter.toDTO(principiitaDAO.getPrincipio(idprincipioita));
	}

}