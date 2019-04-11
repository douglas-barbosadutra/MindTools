package it.contrader.converter;

import java.util.ArrayList;
import java.util.List;

import it.contrader.dto.PrincipiDTO;
import it.contrader.model.Principi;

public class PrincipiConverter {
	
	public static PrincipiDTO convertToDto(Principi i) {
		PrincipiDTO principiDTO= new PrincipiDTO();
		principiDTO.setIdPrincipi(i.getIdPrincipi());
		principiDTO.setNome(i.getNome());
		principiDTO.setDPunti(i.getDPunti());
		principiDTO.setDNumeri(i.getDNumeri());
		principiDTO.setPChiave(i.getPChiave());
		principiDTO.setFronte(i.getFronte());
		principiDTO.setRetro(i.getRetro());
		
		
		return principiDTO;		
		}

	public static Principi convertToEntity(PrincipiDTO i) {
		Principi principi= new Principi();
		principi.setIdPrincipi(i.getIdPrincipi());
		principi.setNome(i.getNome());
		principi.setDPunti(i.getDPunti());
		principi.setDNumeri(i.getDNumeri());
		principi.setPChiave(i.getPChiave());
		principi.setFronte(i.getFronte());
		principi.setRetro(i.getRetro());
		
		return principi;	
	  	}
	public static List<PrincipiDTO> toListDTO(List<Principi> list) {
		List<PrincipiDTO> principiDTO = new ArrayList<>();
		if (!list.isEmpty()) {
			for (Principi p : list) {
				principiDTO.add(PrincipiConverter.convertToDto(p));
			}
		}
		return principiDTO;
	}
	
	
	 
	

}
