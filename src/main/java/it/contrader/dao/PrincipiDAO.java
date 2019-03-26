package it.contrader.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.contrader.model.Principi;

@Repository
@Transactional
public interface PrincipiDAO extends CrudRepository<Principi, Integer> {
		
	public Principi findByIdPrincipi(Integer id);
	public List<Principi> findAllByPChiave(String pChiave);
	
}
	