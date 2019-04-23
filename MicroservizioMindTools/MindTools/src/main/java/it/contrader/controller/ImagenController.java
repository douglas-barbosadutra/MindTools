package it.contrader.controller;

import java.io.IOException;
import java.nio.file.Paths;

import javax.persistence.criteria.Path;
import javax.servlet.MultipartConfigElement;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

//import it.contrader.model.Imagen;
import it.contrader.service.ImagenService;

@CrossOrigin(value="*")
@RestController
@RequestMapping("/Imagen")
public class ImagenController {/*
	
	private ImagenDTO imagenDTO = new ImagenDTO();
	public static Imagen im = null;
	

	
	@Autowired
	private ImagenService imagenService;
	
	
	@PostMapping(value="/savefile",
		    produces = MediaType.APPLICATION_JSON_VALUE,
		    consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.MULTIPART_FORM_DATA_VALUE})  
	public ResponseEntity<String> upload(@RequestPart("file") MultipartFile file) throws IOException{ 
		
		imagenService.upload(file);
    	return new ResponseEntity<String>("Archivo subido correctamente", HttpStatus.OK);
    	
    }
	 @PostMapping(value="/upload")
	 @ResponseBody
	 
	    public ResponseEntity<?> uploadFile(HttpServletRequest request, @RequestParam("file")MultipartFile file) {
		 request.getSession().setAttribute("file", file);
		 
	       if (file.isEmpty()) {
	            return new ResponseEntity<Object>("Seleccionar un archivo", HttpStatus.OK);
	        }

	        try {
	        	imagenService.saveFile(file);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return new ResponseEntity<Object>("Archivo subido correctamente", HttpStatus.OK);
	    }
	*/

}
