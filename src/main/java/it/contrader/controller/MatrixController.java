package it.contrader.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import it.contrader.service.MatrixService;
import it.contrader.dto.MatrixDTO;
import it.contrader.dto.PrincipiDTO;
import java.lang.reflect.Method;



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
	@RequestMapping(value = "/contradizione", method = RequestMethod.GET)
	public List<PrincipiDTO>  princiList(
			@RequestParam(value = "param") String param,
			@RequestParam(value = "idparam") String idparam){
		
		List<PrincipiDTO> lista = matrixService.principiByParametri(param, Integer.parseInt(idparam));
		System.out.println(lista.get(0));
		return lista;
	}
	
	
	
	
}
