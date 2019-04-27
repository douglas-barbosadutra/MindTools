package it.contrader.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.ExpiredJwtException;
import it.contrader.service.ParametriService;
import it.contrader.utils.JwtUtils;
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
	public ResponseEntity<List <ParametriDTO>> ShowParametri(HttpServletRequest request, @RequestParam(value="jwt") String jwt) {
       int rank;
		
		try {
			rank = this.getRankFromJwt(jwt);
			
			if(rank == 0) {
				 List <ParametriDTO> parametri = parametriService.getParametri();
				 request.getSession().setAttribute("parametri", parametri);
				 return ResponseEntity.status(HttpStatus.OK).body(parametri);	
			}
				
			else
				return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
			
		} catch (ExpiredJwtException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
		}
		
	}
	
	  private int getRankFromJwt(String jwt) throws ExpiredJwtException, UnsupportedEncodingException {
			
			Map<String, Object> data = JwtUtils.jwt2Map(jwt);
			int rank = Integer.parseInt(data.get("scope").toString());
			
			return rank;
		}

}
