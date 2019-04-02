package it.contrader.dao;

import javax.transaction.Transactional;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.contrader.model.Matrix;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;


@Repository
@Transactional
public interface MatrixRepository extends CrudRepository<Matrix, Integer>
{

}
