package it.contrader.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.dao.ParametriRepository;

@Service
public class ParametriService {
	
	private ParametriRepository parametriRepository;
	
	@Autowired
	public ParametriService (ParametriRepository parametriRepository) {
		this.parametriRepository = parametriRepository;
	}

}
