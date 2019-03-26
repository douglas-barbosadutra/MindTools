package it.contrader.controller;

import java.io.IOException;
import java.nio.file.Paths;

import javax.persistence.criteria.Path;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import it.contrader.dto.ImagenDTO;
import it.contrader.model.Imagen;
import it.contrader.service.ImagenService;

@Controller
@RequestMapping("/Imagen")
public class ImagenController {
	
	private ImagenDTO imagenDTO = new ImagenDTO();
	
	@Autowired
	private ImagenService imagenService;
	
	@RequestMapping(value="/savefile",method=RequestMethod.POST)  
	public String upload(@RequestParam MultipartFile file,HttpServletRequest request) throws IOException{ 
	        String filename=file.getOriginalFilename();
	        byte barr[]= file.getBytes();
	    	imagenDTO.setIdImagen(0);
	        imagenDTO.setNome(filename);
	        imagenDTO.setArchivo(barr);
	        Imagen i = imagenService.insertImagen(imagenDTO);
	        request.getSession().setAttribute("imagen",i);
	        return "insertExperience";  
	    }  
	

}
