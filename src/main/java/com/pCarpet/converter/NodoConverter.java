package com.pCarpet.converter;

import java.util.ArrayList;
import java.util.List;

import com.pCarpet.dto.NodoDTO;
import com.pCarpet.model.Nodo;
import com.pCarpet.model.Percorso;

public class NodoConverter {
	
	public static NodoDTO convertToDto(Nodo nodo) {
		 NodoDTO nodoDTO = null;
		if(nodo != null) {
			nodoDTO = new  NodoDTO();
			nodoDTO.setId(nodo.getId());
			nodoDTO.setNome(nodo.getNome());
			if(nodo.getFather() == null) {
				nodoDTO.setIdFather(0);
			}else {
				nodoDTO.setIdFather(nodo.getFather().getId());
			}
			nodoDTO.setIdPercorso(nodo.getPercorso().getIdPercorso());
			nodoDTO.setNodoChildrenDTO(NodoConverter.toListDTO(nodo.getChildsList()));
		}
		return nodoDTO;
	}
	
	public static Nodo convertToEntity(NodoDTO nodoDTO) {
		Nodo nodo = null;
		if(nodoDTO != null) {
			nodo = new Nodo();
			nodo.setId(nodoDTO.getId());
			nodo.setNome(nodoDTO.getNome());
			nodo.setFather(null);
			if(nodoDTO.getIdFather() != 0) {
				Nodo father = new Nodo();
				father.setId(nodoDTO.getIdFather());
				nodo.setFather(father);
			}			
			Percorso percorso = new Percorso();
			percorso.setIdPercorso(nodoDTO.getId());
			nodo.setPercorso(percorso);
		}
		return nodo;
	}
	
	public static List<NodoDTO> toListDTO(List<Nodo> list){
		List<NodoDTO> listNodoDTO = new ArrayList<>();
		if (!list.isEmpty()) {
			for(Nodo nodo : list) {
				listNodoDTO.add(NodoConverter.convertToDto(nodo));
			}
		}
		return listNodoDTO;
	}
	
	public static List<Nodo> toListEntity(List<NodoDTO> list){
		List<Nodo> listNodo = new ArrayList<>();
		if (!list.isEmpty()) {
			for(NodoDTO nodoDTO : list) {
				listNodo.add(NodoConverter.convertToEntity(nodoDTO));
			}
		}
		return listNodo;
	}
}
