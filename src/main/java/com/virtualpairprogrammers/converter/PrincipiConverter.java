package com.virtualpairprogrammers.converter;

import com.virtualpairprogrammers.dto.PrincipiDTO;
import com.virtualpairprogrammers.model.Principi;

public class PrincipiConverter {
	public static Principi toEntity(PrincipiDTO principiDTO) {
		
		Principi principi = null;
		if (principiDTO != null) {
			principi = new Principi(principiDTO.getId_principi(), principiDTO.getNome(),
					principiDTO.getDescrizione(), principiDTO.getD_numeri(),principiDTO.getD_punti(),
					principiDTO.getP_chiave());
		}
		return principi;		
	}
	
	public static PrincipiDTO toDTO(Principi principi) {
		
		PrincipiDTO principiDTO = null;
		if (principi != null) {
			principiDTO = new PrincipiDTO (principi.getId_principio(), principi.getNome(),principi.getDescrizione(),
					principi.getD_numeri(),principi.getD_punti(),principi.getParole_chiave());
		}
		
		return principiDTO;
	}

}
