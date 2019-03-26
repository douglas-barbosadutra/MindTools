package it.contrader.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.contrader.model.Experience;
import it.contrader.model.Feedback;
import it.contrader.model.Principi;

import java.util.List;

import javax.transaction.Transactional;

@Repository
@Transactional
 
public interface FeedbackRepository extends CrudRepository<Feedback, Integer> {
	public List<Feedback> findAllByExperience(Experience id ); 
	public Feedback findByPrincipi(Principi p);
}


