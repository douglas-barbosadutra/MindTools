package it.contrader.service;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import it.contrader.controller.ImagenController;
import it.contrader.converter.ImagenConverter;
import it.contrader.dao.ImagenRepository;
import it.contrader.dto.ImagenDTO;
import it.contrader.model.Imagen;

@Service
public class ImagenService {
	private final ImagenRepository imagenRepository;
	private String upload_folder = ".//src//main//resources//files//";
	private ImagenDTO imagenDTO = new ImagenDTO();
	
	@Autowired
	public ImagenService(ImagenRepository imagenRepository) {
		this.imagenRepository = imagenRepository;
	}
	
	public Imagen insertImagen(ImagenDTO i) {
		Imagen g = imagenRepository.saveAndFlush(ImagenConverter.toEntity(i));
		return g;
		
		
	}
	public void saveFile(MultipartFile file) throws IOException {
        if(!file.isEmpty()){
            byte[] bytes = file.getBytes();
			Path path = Paths.get(upload_folder + file.getOriginalFilename());
            Files.write(path,bytes);
        }
    }
	
	public void upload(MultipartFile file) throws IOException{ 
		String filename=file.getOriginalFilename();
        byte barr[]= file.getBytes();
    	imagenDTO.setIdImagen(0);
        imagenDTO.setNome(filename);
        imagenDTO.setArchivo(barr);
        ImagenController.im = insertImagen(imagenDTO);
          
    }
	
	

   
	

}