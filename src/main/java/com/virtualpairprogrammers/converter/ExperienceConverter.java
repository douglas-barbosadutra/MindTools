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
	 * Converte un NodesDTO in Nodes
	 */
	public static Experience toEntity(ExperienceDTO experienceDTO) {

		Experience experience = null;
		if (experienceDTO != null) {
			experience = new Experience(ExperienceDTO.getId_experience(), ExperienceDTO.getId_user(), ExperienceDTO.getCommento(), ExperienceDTO.getPositivo(),ExperienceDTO.getNegativo(), ExperienceDTO.getScore());
		}

		return experience;
	}

	/**
	 * Converte un Nodes in NodesDTO
	 */
	public static ExperienceDTO toDTO(Experience experience) {

		ExperienceDTO experienceDTO = null;
		if (experience != null) {
			experienceDTO = new ExperienceDTO(experience.getId_experience(), experience.getId_user(), experience.getCommento(), experience.getPositivo(), experience.getNegativo(), experience.getStore());
		}

		return experienceDTO;
	}
	

}
