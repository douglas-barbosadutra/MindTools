package com.virtualpairprogrammers.converter;

import java.util.ArrayList;
import java.util.List;


import com.virtualpairprogrammers.dto.ExperienceDTO;
import com.virtualpairprogrammers.model.Experience;

/**
 * Il converter si occupa di "convertire" un model in un dto e viceversa
 *
 */
public class ExperienceConverter {


	/**
	 * Converte una ExperienceDTO in Experience
	 */
	public  Experience toEntity(ExperienceDTO experienceDTO) {

		Experience experience = null;
		if (experienceDTO != null) {
			experience = new Experience(experienceDTO.getId_experience(), experienceDTO.getId_user(), experienceDTO.getCommento(),
					experienceDTO.getPositivo(),experienceDTO.getNegativo(), experienceDTO.getScore());
		}

		return experience;
	}

	/**
	 * Converte una Experience in ExperienceDTO
	 */
	public static ExperienceDTO toDTO(Experience experience) {

		ExperienceDTO experienceDTO = null;
		if (experience != null) {
			experienceDTO = new ExperienceDTO(experience.getId_experience(), experience.getId_user(), experience.getCommento(), 
					experience.getPositivo(), experience.getNegativo(), experience.getScore());
		}

		return experienceDTO;
	}
	
	

}
