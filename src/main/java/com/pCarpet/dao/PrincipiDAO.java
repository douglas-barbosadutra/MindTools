
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
	
	@Query(value = "select * from principi", nativeQuery=true)
	List<Principi> getAllPrincipi ();
	
	@Query(value = "select* FROM principi WHERE id_principi = ?" , nativeQuery=true )
	Principi SelezionaPrincipio(Integer idPrincipi) ;
	
	
}
	
	