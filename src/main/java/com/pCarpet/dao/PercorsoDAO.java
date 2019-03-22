package com.pCarpet.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pCarpet.model.Principi;
import com.pCarpet.model.Percorso;
import com.pCarpet.model.Experience;

public interface PercorsoDAO extends JpaRepository<Percorso, Integer>{
	
	

}
