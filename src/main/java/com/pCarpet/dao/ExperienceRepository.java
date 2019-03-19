package com.pCarpet.dao;

import org.springframework.data.repository.CrudRepository;
import com.pCarpet.model.Experience;
import com.pCarpet.model.Feedback;
import java.util.List;

public interface ExperienceRepository extends CrudRepository<Experience, Integer> {
	

}
