package com.pCarpet.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pCarpet.converter.PrincipiConverter;
import com.pCarpet.dao.PrincipiDAO;
import com.pCarpet.dto.PrincipiDTO;
import com.pCarpet.model.Principi;

@Service
public class PrincipiService {

	private final PrincipiDAO principiDAO;
	
@Autowired
	public PrincipiService(PrincipiDAO principiDAO) {
		this.principiDAO = principiDAO;
	}

	public List<PrincipiDTO> getAllPrincipi() {

		return PrincipiConverter.toListDTO((List<Principi>) principiDAO.findAll());
		
		/*List<Principi> list =  (List<Principi>) principiDAO.findAll();
		List<PrincipiDTO> listDTO = new ArrayList<>();
        list.forEach(i->listDTO.add(PrincipiConverter.convertToDto(i)));
		return listDTO; */
		

	}
	
	public PrincipiDTO getPrincipio(int id) {
		Principi p = this.principiDAO.findByIdPrincipi(id);
		return PrincipiConverter.convertToDto(p);
	}


/*	public List<PrincipiDTO> getAllPrincipiByNome(String testo) {

		List<PrincipiDTO> listDTO = new ArrayList<>();

		for (Principi principi : list) {
			listDTO.add(PrincipiConverter.toDTO(principi));
		}
		return listDTO;

	}*/


}
