package com.pCarpet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pCarpet.converter.ExperienceConverter;
import com.pCarpet.dao.ExperienceRepository;
import com.pCarpet.dto.ExperienceDTO;
import com.pCarpet.model.Experience;

@Service
public class ExperienceService {
	private final ExperienceRepository experienceRepository;
	
	@Autowired
	public ExperienceService (ExperienceRepository experienceRepository) {
		this.experienceRepository = experienceRepository;
	}
	
	public ExperienceDTO insertExperience(ExperienceDTO experienceDTO) {
		
		Experience ex = experienceRepository.save(ExperienceConverter.toEntity(experienceDTO));
		return ExperienceConverter.toDTO(ex);
	}
	
	

}
