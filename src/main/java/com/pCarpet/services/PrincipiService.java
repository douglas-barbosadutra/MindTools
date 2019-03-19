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

	private  PrincipiDAO principiDAO;
	
@Autowired
	public PrincipiService(PrincipiDAO principiDAO) {
		this.principiDAO = principiDAO;
	}

	public List<PrincipiDTO> getAllPrincipi() {

		List<Principi> list = (List<Principi>) principiDAO.getAllPrincipi();
		List<PrincipiDTO> listDTO = new ArrayList<>();
        list.forEach(i->listDTO.add(PrincipiConverter.convertToDto(i)));
		return listDTO;
		

	}
	
	public PrincipiDTO getPrincipio(Integer idPrincipi) {
		Principi p = this.principiDAO.SelezionaPrincipio(idPrincipi);
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
