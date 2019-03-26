package it.contrader.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import it.contrader.model.Experience;
import it.contrader.model.Feedback;
import java.util.List;

public interface ExperienceRepository extends JpaRepository<Experience, Integer> {
	
	Experience findByIdExperience(Integer id);
}
