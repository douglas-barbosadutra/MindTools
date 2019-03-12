package com.virtualpairprogrammers.converter;

import com.virtualpairprogrammers.dto.PrincipiItaDTO;
import com.virtualpairprogrammers.model.PrincipiIta;

public class PrincipiItaConverter {
	public static PrincipiIta toEntity(PrincipiItaDTO principiitaDTO) {
		
		PrincipiIta principiita = null;
		if (principiitaDTO != null) {
			principiita = new PrincipiIta(principiitaDTO.getIdprincipioita(), principiitaDTO.getNomeprincipio(),
					principiitaDTO.getDomanda(), principiitaDTO.getPercorso(),principiitaDTO.getParolachiave());
		}
		return principiita;		
	}
	
	public static PrincipiItaDTO toDTO(PrincipiIta principiita) {
		
		PrincipiItaDTO principiitaDTO = null;
		if (principiita != null) {
			principiitaDTO = new PrincipiItaDTO (principiita.getIdprincipioita(), principiita.getNomeprincipio(),
					principiita.getDomanda(), principiita.getPercorso(),principiita.getParolachiave());
		}
		
		return principiitaDTO;
	}

}
