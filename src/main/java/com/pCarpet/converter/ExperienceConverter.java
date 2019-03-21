package com.pCarpet.converter;

import com.pCarpet.dto.ExperienceDTO;
import com.pCarpet.model.Experience;
import com.pCarpet.model.User;

public class ExperienceConverter {
	public static Experience toEntity(ExperienceDTO experienceDTO) {

		Experience experience = null;
		if (experienceDTO != null) {
			experience = new Experience();
			experience.setIdExperience(experienceDTO.getIdExperience());
			experience.setCommento(experienceDTO.getCommento());
			experience.setPositivo(experienceDTO.getPositivo());
			experience.setNegativo(experienceDTO.getNegativo());
			experience.setScore(experienceDTO.getScore());
			User user = experienceDTO.getUser();
			experience.setUser(user);
			
		}

		return experience;
		
		
	}
	
	public static ExperienceDTO toDTO(Experience experience) {

		ExperienceDTO experienceDTO = null;
		if (experience != null) {
			experienceDTO = new ExperienceDTO();
			experienceDTO.setIdExperience(experience.getIdExperience());
			experienceDTO.setCommento(experience.getCommento());
			experienceDTO.setPositivo(experience.getPositivo());
			experienceDTO.setNegativo(experience.getNegativo());
			experienceDTO.setScore(experience.getScore());
		}

		return experienceDTO;
	}

}
