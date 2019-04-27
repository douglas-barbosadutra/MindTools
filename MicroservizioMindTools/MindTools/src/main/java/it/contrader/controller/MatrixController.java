package it.contrader.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonCreator;

import io.jsonwebtoken.ExpiredJwtException;
import it.contrader.service.MatrixService;
import it.contrader.service.PrincipiService;
import it.contrader.utils.JwtUtils;
import it.contrader.dto.MatrixDTO;
import it.contrader.dto.PrincipiDTO;
import it.contrader.model.Parametri;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;



@CrossOrigin(value="*")
@RestController
@RequestMapping("/Matrice")
public class MatrixController {
	
	private MatrixService matrixService;
	private PrincipiService principiService;
	private ArrayList<String> parametri = new ArrayList<String>() ;
	
	@Autowired
	public MatrixController(MatrixService matrixService, PrincipiService principiService) {
		this.matrixService = matrixService;
		this.principiService = principiService;
		
	}
	
	
	
	@RequestMapping(value = "/matrix", method = RequestMethod.GET)
	public ResponseEntity<List <MatrixDTO>>  ShowMatrix(HttpServletRequest request, @RequestParam(value="jwt") String jwt) {
      int rank;
		
		try {
			rank = this.getRankFromJwt(jwt);
			
			if(rank == 0) {
				 List <MatrixDTO> matrice = matrixService.getMatrix();
				 request.getSession().setAttribute("matrice", matrice);
				 return ResponseEntity.status(HttpStatus.OK).body(matrice);	
			}
				
			else
				return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
			
		} catch (ExpiredJwtException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
		}
		 
	}
	@JsonCreator
	@RequestMapping(value = "/contradizione", method = RequestMethod.POST)
	public ResponseEntity<List<PrincipiDTO>> princiList(@RequestBody ArrayList<String> parametri, @RequestParam(value="jwt") String jwt){
     int rank;
		
		try {
			rank = this.getRankFromJwt(jwt);
			
			if(rank == 0) {
				String idarr = parametri.get(0);
				String paramarr = parametri.get(1);
				String[] id = idarr.split(" ");
				System.out.println(id[0]);
				String [] param = paramarr.split(" ");
				String par = param[0];
				String met = "getP";
				met = met.concat(par);
				System.out.println(met);
				MatrixDTO list = matrixService.getMat(Integer.parseInt(id[0]));
				System.out.println(list);
				List<PrincipiDTO> lista = new ArrayList<PrincipiDTO>();
				Method[] metodos=list.getClass().getMethods();
				
				String cadena = "";
		        for(Method m: metodos) {
		            if (m.getName().equals(met)) {
		            	System.out.println(m.toString());
							try {
								cadena = (String) m.invoke(list, null);
								System.out.println(cadena);
							} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
								
							}
		            }
		        }
		        if (cadena!= null && cadena!= "+") {
					String[] prin = cadena.split(", ");
					for (String pri : prin) {
						lista.add(principiService.getPrincipio(Integer.parseInt(pri)));
					}
				}
				
				return ResponseEntity.status(HttpStatus.OK).body(lista);
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
