package it.contrader.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import it.contrader.service.ParametriService;

import it.contrader.dto.ParametriDTO;



@CrossOrigin
@RestController
@RequestMapping("/Parametri")
public class ParametriController 
{
	private ParametriService parametriService;
	
	@Autowired
	public ParametriController(ParametriService parametriService) {
		this.parametriService = parametriService;
		
	}
	
	@RequestMapping(value = "/param", method = RequestMethod.GET)
	public ResponseEntity<List <ParametriDTO>> ShowParametri(HttpServletRequest request) {
		 List <ParametriDTO> parametri = parametriService.getParametri();
		 request.getSession().setAttribute("parametri", parametri);
		 return ResponseEntity.status(HttpStatus.OK).body(parametri);	
	}

}
