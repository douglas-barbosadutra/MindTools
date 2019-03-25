package com.pCarpet.converter;
import java.util.ArrayList;
import java.util.List;

import com.pCarpet.dto.PercorsoDTO;
import com.pCarpet.model.Experience;
import com.pCarpet.model.Percorso;
import com.pCarpet.model.Principi;

public class PercorsoConverter {
	
	public static PercorsoDTO convertToDto(Percorso percorso) {
		
		PercorsoDTO percorsoDTO = null;
		
		if(percorso != null) {
			percorsoDTO = new PercorsoDTO();
			
			percorsoDTO.setIdPercorso(percorso.getIdPercorso());
			percorsoDTO.setNome(percorso.getNome());
			percorsoDTO.setIdPrincipi(percorso.getPrincipi().getIdPrincipi());
			percorsoDTO.setIdExperience(percorso.getExperience().getIdExperience());
			
		}
		return percorsoDTO;
	}
	
	public static Percorso convertToEntity(PercorsoDTO percorsoDTO) {
		
		Percorso percorso= null;
		
		if(percorsoDTO != null) {
			
			percorso = new Percorso();
			
			percorso.setIdPercorso(percorsoDTO.getIdPercorso());
			percorso.setNome(percorsoDTO.getNome());
			Principi principi = new Principi();
			Experience experience = new Experience();
			principi.setIdPrincipi(percorsoDTO.getIdPrincipi());
			experience.setIdExperience(percorsoDTO.getIdExperience());
			percorso.setPrincipi(principi);
			percorso.setExperience(experience);
			
			
			
		}
		return percorso;
	}

	public static List<PercorsoDTO> toListDTO(List<Percorso> list){
		List<PercorsoDTO> listPercorsoDto = new ArrayList<>();
		if(list != null) {
			for(Percorso percorso: list) {
				listPercorsoDto.add(PercorsoConverter.convertToDto(percorso));
			}
		}
		return listPercorsoDto;
	} 
}
