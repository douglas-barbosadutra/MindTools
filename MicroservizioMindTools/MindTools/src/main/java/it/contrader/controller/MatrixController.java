package it.contrader.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonCreator;

import it.contrader.service.MatrixService;
import it.contrader.service.PrincipiService;
import it.contrader.dto.MatrixDTO;
import it.contrader.dto.PrincipiDTO;
import it.contrader.model.Parametri;


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
	public List <MatrixDTO>  ShowMatrix(HttpServletRequest request) {
		 List <MatrixDTO> matrice = matrixService.getMatrix();
		 request.getSession().setAttribute("matrice", matrice);
		 
		 return matrice;	
	}
	@JsonCreator
	@RequestMapping(value = "/contradizione", method = RequestMethod.POST)
	public List<PrincipiDTO>  princiList(@RequestBody ArrayList<String> parametri){
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
		
		return lista;
	}
	
	
	
	
}
