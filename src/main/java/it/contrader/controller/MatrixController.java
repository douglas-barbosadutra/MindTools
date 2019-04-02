package it.contrader.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import it.contrader.service.MatrixService;
import it.contrader.dto.MatrixDTO;



@CrossOrigin
@RestController
@RequestMapping("/Matrice")
public class MatrixController {
	
	private MatrixService matrixService;
	
	@Autowired
	public MatrixController(MatrixService matrixService) {
		this.matrixService = matrixService;
		
	}
	
	@RequestMapping(value = "/matrix", method = RequestMethod.GET)
	public List <MatrixDTO>  ShowMatrix(HttpServletRequest request) {
		 List <MatrixDTO> matrice = matrixService.getMatrix();
		 request.getSession().setAttribute("matrice", matrice);
		 return matrice;	
	}
}
