package com.pCarpet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pCarpet.dao.GrafoRepository;

@Service
public class GrafoService {
	private final GrafoRepository grafoRepository;
	
	@Autowired
	public GrafoService(GrafoRepository grafoRepository) {
		this.grafoRepository = grafoRepository;
	}

}
