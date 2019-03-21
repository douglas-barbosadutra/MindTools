package com.pCarpet.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pCarpet.model.Experience;
import com.pCarpet.model.Feedback;
import com.pCarpet.model.Principi;

import java.util.List;

import javax.transaction.Transactional;

@Repository
@Transactional
 
public interface FeedbackRepository extends CrudRepository<Feedback, Integer> {
	public Feedback findByExperience(Experience e);
	public Feedback findByPrincipi(Principi p);
}


