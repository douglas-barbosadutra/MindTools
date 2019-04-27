package it.contrader.dao;

import org.springframework.data.jpa.repository.JpaRepository;



import it.contrader.model.Experience;

//import it.contrader.model.User;

import java.util.List;

public interface ExperienceRepository extends JpaRepository<Experience, Integer> {
	
	public Experience findByIdExperience(Integer idExperience);
	public List<Experience> findByIdUser(Integer idUser);

}
