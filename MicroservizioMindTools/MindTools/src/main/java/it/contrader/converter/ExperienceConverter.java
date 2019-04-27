package it.contrader.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import it.contrader.dto.ExperienceDTO;
//import it.contrader.dto.UserDTO;
import it.contrader.model.Experience;
//import it.contrader.model.User;
//import it.contrader.service.UserService;

public class ExperienceConverter {
	
	//private UserService userService;
	
	
	public static Experience toEntity(ExperienceDTO experienceDTO) {

		Experience experience = null;
		if (experienceDTO != null) {
			experience = new Experience();
			experience.setIdExperience(experienceDTO.getIdExperience());
			experience.setCommento(experienceDTO.getCommento());
			experience.setPositivo(experienceDTO.getPositivo());
			experience.setNegativo(experienceDTO.getNegativo());
			experience.setScore(experienceDTO.getScore());
			experience.setImagen(experienceDTO.getImagen());
			experience.setIdUser(experienceDTO.getIdUser());
	

		}

		return experience;

	}

	public static ExperienceDTO toDTO(Experience experience) {

		ExperienceDTO experienceDTO = null;
		if (experience != null) {
			experienceDTO = new ExperienceDTO();
			experienceDTO.setIdExperience(experience.getIdExperience());
		   experienceDTO.setIdUser(experience.getIdUser());
			experienceDTO.setCommento(experience.getCommento());
			experienceDTO.setImagen(experience.getImagen());
			experienceDTO.setPositivo(experience.getPositivo());
			experienceDTO.setNegativo(experience.getNegativo());
			experienceDTO.setScore(experience.getScore());
			experienceDTO.setImagen(experience.getImagen());
		}

		return experienceDTO;
	}

	public static List<ExperienceDTO> toListDTO(List<Experience> list) {
		List<ExperienceDTO> listExperienceDTO = new ArrayList<ExperienceDTO>();
		if (!list.isEmpty()) {
			for (Experience Experience : list) {
				listExperienceDTO.add(ExperienceConverter.toDTO(Experience));
			}
		}
		return listExperienceDTO;
	}
}
