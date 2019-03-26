package it.contrader.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.converter.PrincipiConverter;
import it.contrader.dao.PrincipiDAO;
import it.contrader.dto.PrincipiDTO;
import it.contrader.model.Principi;

@Service
public class PrincipiService {

	private final PrincipiDAO principiDAO;
	
@Autowired
	public PrincipiService(PrincipiDAO principiDAO) {
		this.principiDAO = principiDAO;
	}

	public List<PrincipiDTO> getAllPrincipi() {

		return PrincipiConverter.toListDTO((List<Principi>) principiDAO.findAll());
		
	}
	
	public PrincipiDTO getPrincipio(int id) {
		Principi p = this.principiDAO.findByIdPrincipi(id);
		return PrincipiConverter.convertToDto(p);
	}
	
	public List<PrincipiDTO> findByPChiave(String pChiave) {
		

		List<Principi> list = principiDAO.findAllByPChiave(pChiave);
		
		List<PrincipiDTO> listDTO = new ArrayList<>();

		for (Principi principi : list) 
			listDTO.add(PrincipiConverter.convertToDto(principi));
		
		return listDTO;

	}
	


/*	public List<PrincipiDTO> getAllPrincipiByNome(String testo) {

		List<PrincipiDTO> listDTO = new ArrayList<>();

		for (Principi principi : list) {
			listDTO.add(PrincipiConverter.toDTO(principi));
		}
		return listDTO;

	}*/

	
}
