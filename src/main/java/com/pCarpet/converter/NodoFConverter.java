package com.pCarpet.converter;

import com.pCarpet.dto.NodoFDTO;
import com.pCarpet.model.Feedback;
import com.pCarpet.model.NodoF;

public class NodoFConverter  {

	public static NodoF converToEntity(NodoFDTO dto) {
		NodoF nodoF = null;
		if(dto != null) {
			nodoF = new NodoF();
			nodoF.setIdnodof(dto.getIdnodof());
			nodoF.setNome(dto.getNome());
			nodoF.setDescrizione(dto.getDescrizione());
			Feedback fb = dto.getFeedback();
			nodoF.setFeedback(fb);
		}
		return nodoF;
	}

	
	public static NodoFDTO covertToDTO(NodoF nodoF) {
		NodoFDTO nodoFDTO = null;
		if (nodoF!= null) {
			nodoFDTO = new NodoFDTO();
			nodoFDTO.setIdnodof(nodoF.getIdnodof());
			nodoFDTO.setNome(nodoF.getNome());
			nodoFDTO.setDescrizione(nodoF.getDescrizione());
			Feedback fb = nodoF.getFeedback();
			nodoFDTO.setFeedback(fb);
		}
		return nodoFDTO;
	}

}
