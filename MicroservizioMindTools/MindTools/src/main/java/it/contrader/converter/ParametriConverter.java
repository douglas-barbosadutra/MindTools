package it.contrader.converter;


import it.contrader.dto.ParametriDTO;
import it.contrader.model.Parametri;
import java.util.ArrayList;
import java.util.List;

public class ParametriConverter {

	public static ParametriDTO toDTO (Parametri parametri) 
	{
		ParametriDTO parametriDTO = null;
		if (parametri != null)
		{
			parametriDTO = new ParametriDTO();
			parametriDTO.setId(parametri.getId());
			parametriDTO.setNome(parametri.getNome());
		}
		
		return parametriDTO;
		
	}
	
	
	public static Parametri toEntity (ParametriDTO parametriDTO) {
		
		Parametri parametri = null;
		if (parametriDTO != null)
		{
			parametri = new Parametri();
			parametri.setId(parametriDTO.getId());
			parametri.setNome(parametriDTO.getNome());
		}
		
		return parametri;
	}
	
	
	public static List<ParametriDTO> toListDTO(List<Parametri> list)
	{
		List<ParametriDTO> parametriDTO = new ArrayList<>();
		if(!list.isEmpty()) {
			for (Parametri p : list) {
				parametriDTO.add(ParametriConverter.toDTO(p));
			}
		}
		
		return parametriDTO;
	}
	
	
	
	
}
