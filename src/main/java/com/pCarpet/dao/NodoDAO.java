package com.pCarpet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pCarpet.model.Percorso;

import com.pCarpet.model.Nodo;

import java.util.List;

import javax.transaction.Transactional;

public interface NodoDAO extends JpaRepository<Nodo, Integer>{
	
	//final String FIND_MAX_LEVEL_BY_WBS = "select max(level) from items where id_wbs = :wbs";
	
	public List<Nodo> findAllByWbs(Percorso percorso);
	//public List<Nodo> findAllByManufacturings(Manufacturing manufacturings);
	public List<Nodo> findAll();
	
	public Nodo findByFather(Nodo i);
	//public Nodo findByManufacturings(Manufacturing m);
	public Nodo findNodoById(int id);

	@Modifying
	@Transactional
	@Query(value = "INSERT INTO nodi (nome,id_father,id_percorso) VALUES (:nome,:id_father,:id_percorso)", nativeQuery=true)
	public void insertItem(@Param("nome") String nome, @Param("id_father") Integer id_father, @Param("id_percorso") Integer id_percorso);
	
	
	@Modifying
	@Transactional
	@Query(value = "DELETE FROM items WHERE id_nodo = :id_nodo", nativeQuery=true)
	public void deleteItem(@Param("id_nodo") Integer idItem);
	
	/*@Modifying
	@Transactional
	@Query(value = "INSERT INTO inputs (id_item, id_task) VALUES (:id_item, :id_task)", nativeQuery=true)
	public void insertInput(@Param("id_item") Integer id_item, @Param("id_task") Integer id_task);*/
}
