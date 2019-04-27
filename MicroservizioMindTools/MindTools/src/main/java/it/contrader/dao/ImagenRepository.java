package it.contrader.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import it.contrader.model.Imagen;

public interface ImagenRepository extends JpaRepository<Imagen, Integer> {

}