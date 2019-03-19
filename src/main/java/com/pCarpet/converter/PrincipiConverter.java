package com.pCarpet.converter;

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

	public static Principi convertToSintomo(Principi i) {
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
	

}
