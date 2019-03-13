package com.virtualpairprogrammers.converter;

import com.virtualpairprogrammers.dto.PrincipiDTO;
import com.virtualpairprogrammers.model.Principi;

public class PrincipiConverter {
	public static Principi toEntity(PrincipiDTO principiDTO) {
		
		Principi principi = null;
		if (principiDTO != null) {
			principi = new Principi(principiDTO.getId_principi(), principiDTO.getNome(),
					principiDTO.getD_numeri(),principiDTO.getD_punti(),
					principiDTO.getP_chiave(),principiDTO.getNomeita(),principiDTO.getD_numeriIta(),principiDTO.getD_punti(),principiDTO.getP_chiaveIta());
		}
		return principi;		
	}
	
	public static PrincipiDTO toDTO(Principi principi) {
		
		PrincipiDTO principiDTO = null;
		if (principi != null) {
			principiDTO = new PrincipiDTO (principi.getId_principi(), principi.getNome(),
					principi.getD_numeri(),principi.getD_punti(),principi.getP_chiave(),
					principi.getNomeita(),principi.getD_numeriIta(),principi.getD_puntiIta(),principi.getP_chiaveIta());
		}
		
		return principiDTO;
	}

}
