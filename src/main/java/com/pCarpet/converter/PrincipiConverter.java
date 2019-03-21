package com.pCarpet.converter;

import java.util.ArrayList;
import java.util.List;

import com.pCarpet.dto.PrincipiDTO;
import com.pCarpet.model.Principi;

public class PrincipiConverter {
	
	public static PrincipiDTO convertToDto(Principi i) {
		PrincipiDTO principiDTO= new PrincipiDTO();
		principiDTO.setIdPrincipi(i.getIdPrincipi());
		principiDTO.setNome(i.getNome());
		principiDTO.setDPunti(i.getDPunti());
		principiDTO.setDNumeri(i.getDNumeri());
		principiDTO.setPChiave(i.getPChiave());
		principiDTO.setNomeIta(i.getNomeIta());
		principiDTO.setDPuntiIta(i.getDPuntiIta());
		principiDTO.setDNumeriIta(i.getDNumeriIta());
		principiDTO.setPChiaveIta(i.getPChiaveIta());
		
		return principiDTO;		
		}

	public static Principi convertToEntity(PrincipiDTO i) {
		Principi principi= new Principi();
		principi.setIdPrincipi(i.getIdPrincipi());
		principi.setNome(i.getNome());
		principi.setDPunti(i.getDPunti());
		principi.setDNumeri(i.getDNumeri());
		principi.setPChiave(i.getPChiave());
		principi.setNomeIta(i.getNomeIta());
		principi.setDPuntiIta(i.getDPuntiIta());
		principi.setDNumeriIta(i.getDNumeriIta());
		principi.setPChiaveIta(i.getPChiaveIta());
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
