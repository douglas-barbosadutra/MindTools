package it.contrader.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.ExpiredJwtException;
import it.contrader.dto.PrincipiDTO;
import it.contrader.dto.TokenDTO;
import it.contrader.service.PrincipiService;
import it.contrader.utils.JwtUtils;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@CrossOrigin
@RestController
@RequestMapping("/Principi")
public class PrincipiController {
	
	private PrincipiService principiService;
	private TokenDTO token = new TokenDTO();
	
	@Autowired
	public PrincipiController(PrincipiService principiService) {
		this.principiService = principiService;
		
	}
	
	@RequestMapping(value = "/ShowAllPrincipi", method = RequestMethod.GET)
	public ResponseEntity<List<PrincipiDTO>> ShowAll(HttpServletRequest request, @RequestParam(value="jwt") String jwt) {
		System.out.println("llego principio"+ jwt);
        int rank;
		try {
			rank = this.getRankFromJwt(jwt);
			
			if(rank == 0) {
				 List <PrincipiDTO> listaPrincipi = principiService.getAllPrincipi();
				 request.getSession().setAttribute("listaPrincipi", listaPrincipi);
				 return ResponseEntity.status(HttpStatus.OK).body(listaPrincipi);	
			}
				
			else
				return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
			
		} catch (ExpiredJwtException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
		}
		 
	}
	@ResponseBody
	@RequestMapping(value = "/SelezionaPrincipio", method = RequestMethod.GET)
	public ResponseEntity<PrincipiDTO> SelezionaPrincipio(@RequestBody TokenDTO tokenDTO) {
		
     int rank;
		
		try {
			rank = this.getRankFromJwt(tokenDTO.getJwt());
			
			if(rank == 0) {
				PrincipiDTO principio = principiService.getPrincipio(Integer.parseInt(tokenDTO.getParam().toString()));
				return ResponseEntity.status(HttpStatus.OK).body(principio);
			}
				
			else
				return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
			
		} catch (ExpiredJwtException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
		}
		
	}
	
	@RequestMapping(value = "/PrincipiByParola", method = RequestMethod.GET)
	public ResponseEntity<List<PrincipiDTO>> findByPChiave(@RequestParam(value="pChiave") String pChiave, @RequestParam(value="jwt") String jwt) {
      int rank;
		
		try {
			rank = this.getRankFromJwt(jwt);
			
			if(rank == 0) {
				System.out.println(pChiave);
				List <PrincipiDTO> listaPrincipi = principiService.findByPChiave(pChiave);	
				System.out.println(listaPrincipi);
				return ResponseEntity.status(HttpStatus.OK).body(listaPrincipi);
			}
				
			else
				return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
			
		} catch (ExpiredJwtException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
		}
		
		
	}
	
	@RequestMapping(value = "/PrincipioRandom", method = RequestMethod.GET)
	public ResponseEntity<PrincipiDTO> PrincipioRandom(HttpServletRequest request, @RequestParam(value="jwt") String jwt) {
     int rank;
		
		try {
			rank = this.getRankFromJwt(jwt);
			
			if(rank == 0) {
				int casual = (int) (Math.random()*40+1);
				PrincipiDTO principio = principiService.getPrincipio(casual);
				request.getSession().setAttribute("Principio", principio);
				return ResponseEntity.status(HttpStatus.OK).body(principio);
			}
				
			else
				return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
			
		} catch (ExpiredJwtException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
		}
		
	}
	
	@RequestMapping(value = "/showPath", method = RequestMethod.POST)
	public ResponseEntity<String> ShowPath(HttpServletRequest request, @RequestParam(value="jwt") String jwt) {
		
		return ResponseEntity.status(HttpStatus.OK).body("showPath");
	}
	
   private int getRankFromJwt(String jwt) throws ExpiredJwtException, UnsupportedEncodingException {
		
		Map<String, Object> data = JwtUtils.jwt2Map(jwt);
		int rank = Integer.parseInt(data.get("scope").toString());
		
		return rank;
	}
	
	
	
	
	
}