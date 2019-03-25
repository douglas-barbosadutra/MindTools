package com.pCarpet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pCarpet.converter.NodoFConverter;
import com.pCarpet.converter.NodoPConverter;
import com.pCarpet.dao.NodoFRepository;
import com.pCarpet.dao.NodoPRepository;
import com.pCarpet.dto.NodoFDTO;
import com.pCarpet.dto.NodoPDTO;

@Service
public class NodosService {
	private final NodoFRepository nodoFRepository;
	private final NodoPRepository nodoPRepository;
	
	@Autowired
	public NodosService(NodoFRepository nodoFRepository,NodoPRepository nodoPRepository ) {
		this.nodoFRepository = nodoFRepository;
		this.nodoPRepository = nodoPRepository;
	}
	
	public void insertNodoF(NodoFDTO dto) {
		nodoFRepository.save(NodoFConverter.converToEntity(dto));
	}
	
	public void insertNodoP(NodoPDTO dto) {
		nodoPRepository.save(NodoPConverter.converToEntity(dto));
	}
	

}
