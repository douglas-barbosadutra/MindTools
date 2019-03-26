package com.pCarpet.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.pCarpet.converter.ImagenConverter;
import com.pCarpet.dao.ImagenRepository;
import com.pCarpet.dto.ImagenDTO;
import com.pCarpet.model.Imagen;

@Service
public class ImagenService {
	private final ImagenRepository imagenRepository;
	
	@Autowired
	public ImagenService(ImagenRepository imagenRepository) {
		this.imagenRepository = imagenRepository;
	}
	public Imagen insertImagen(ImagenDTO i) {
		Imagen g = imagenRepository.saveAndFlush(ImagenConverter.toEntity(i));
		return g;
		
		
	}
	

   
	

}
