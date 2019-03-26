package it.contrader.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import it.contrader.converter.ImagenConverter;
import it.contrader.dao.ImagenRepository;
import it.contrader.dto.ImagenDTO;
import it.contrader.model.Imagen;

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
