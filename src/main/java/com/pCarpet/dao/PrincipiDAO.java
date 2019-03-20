
package com.pCarpet.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pCarpet.model.Principi;

@Repository
@Transactional
public interface PrincipiDAO extends CrudRepository<Principi, Integer> {
	
	//public List<Principi> findAll();
	
	public Principi findByIdPrincipi(Integer id);
	
	
}
	
	