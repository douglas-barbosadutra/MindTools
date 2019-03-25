package com.pCarpet.converter;

import com.pCarpet.dto.GrafoDTO;
import com.pCarpet.model.Grafo;
import com.pCarpet.model.NodoF;
import com.pCarpet.model.NodoP;

public class GrafoConverter {
	
	public static Grafo convertToEntity(GrafoDTO dto) {
		Grafo grafo = null;
		if(dto!=null) {
			grafo = new Grafo();
			grafo.setIdGrafo( dto.getIdGrafo());
			NodoF figlio = dto.getNodoF();
			NodoP padre = dto.getNodoP();
			grafo.setNodoF(figlio);
			grafo.setNodoP(padre);
		}
		
		return grafo;
			
	}
	public static GrafoDTO convertToDTO(Grafo f) {
		GrafoDTO dto = null;
		if (f!=null) {
			dto = new GrafoDTO();
			dto.setIdGrafo(f.getIdGrafo());
			NodoF figlio = f.getNodoF();
			NodoP padre = f.getNodoP();
			dto.setNodoF(figlio);
			dto.setNodoP(padre);
		}
		return dto;
	}

}
