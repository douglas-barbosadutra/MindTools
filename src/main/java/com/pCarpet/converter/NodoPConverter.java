package com.pCarpet.converter;

import com.pCarpet.dto.NodoFDTO;
import com.pCarpet.dto.NodoPDTO;
import com.pCarpet.model.Feedback;
import com.pCarpet.model.NodoF;
import com.pCarpet.model.NodoP;

public class NodoPConverter {
	
	public static NodoP converToEntity(NodoPDTO dto) {
		NodoP nodoP = null;
		if(dto != null) {
			nodoP = new NodoP();
			nodoP.setIdnodop(dto.getIdnodop());
			nodoP.setNome(dto.getNome());
			nodoP.setDescrizione(dto.getDescrizione());
			Feedback fb = dto.getFeedback();
			nodoP.setFeedback(fb);
		}
		return nodoP;
	}

	
	public static NodoPDTO covertToDTO(NodoP nodoP) {
		NodoPDTO nodoPDTO = null;
		if (nodoP!= null) {
			nodoPDTO = new NodoPDTO();
			nodoPDTO.setIdnodop(nodoP.getIdnodop());
			nodoPDTO.setNome(nodoP.getNome());
			nodoPDTO.setDescrizione(nodoP.getDescrizione());
			Feedback fb = nodoP.getFeedback();
			nodoPDTO.setFeedback(fb);
		}
		return nodoPDTO;
	}

}
