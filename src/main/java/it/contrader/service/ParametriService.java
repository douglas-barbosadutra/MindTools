package it.contrader.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.converter.ParametriConverter;
import it.contrader.dao.ParametriRepository;
import it.contrader.dto.ParametriDTO;
import it.contrader.model.Parametri;

@Service
public class ParametriService {
	
	private ParametriRepository parametriRepository;
	
	@Autowired
	public ParametriService (ParametriRepository parametriRepository) {
		this.parametriRepository = parametriRepository;
	}
	
	
	public List<ParametriDTO> getParametri()
	{
		return ParametriConverter.toListDTO((List<Parametri>) parametriRepository.findAll());
	}

}
