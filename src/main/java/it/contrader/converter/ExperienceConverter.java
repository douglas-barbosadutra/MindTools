package it.contrader.converter;

import java.util.ArrayList;
import java.util.List;

import it.contrader.dto.ExperienceDTO;
import it.contrader.dto.UserDTO;
import it.contrader.model.Experience;
import it.contrader.model.User;

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
			experience.setImagen(experienceDTO.getImagen());

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
			experienceDTO.setUser(experience.getUser());
			experienceDTO.setImagen(experience.getImagen());
		}

		return experienceDTO;
	}

	public static List<ExperienceDTO> toListDTO(List<Experience> list) {
		List<ExperienceDTO> listExperienceDTO = new ArrayList<>();
		if (!list.isEmpty()) {
			for (Experience Experience : list) {
				listExperienceDTO.add(ExperienceConverter.toDTO(Experience));
			}
		}
		return listExperienceDTO;
	}
}
