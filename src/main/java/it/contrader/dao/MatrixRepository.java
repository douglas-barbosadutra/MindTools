package it.contrader.dao;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import it.contrader.model.Matrix;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;



@Repository
@Transactional
public interface MatrixRepository extends JpaRepository<Matrix, Integer>

{  
   public Matrix findMatrixById(Integer id);
   // @Modifying
	@Transactional
	@Query(value = "SELECT :param FROM matrix where id = :idparam", nativeQuery=true)
	public String contradizione(@Param("param") String param, @Param("idparam") Integer idparam);
	

}
