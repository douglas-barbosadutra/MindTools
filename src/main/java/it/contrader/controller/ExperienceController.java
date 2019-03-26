package it.contrader.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javax.persistence.criteria.Path;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import it.contrader.converter.ConverterUser;
import it.contrader.converter.ExperienceConverter;
import it.contrader.converter.FeedbackConverter;
import it.contrader.converter.ImagenConverter;
import it.contrader.converter.PrincipiConverter;
import it.contrader.dto.ExperienceDTO;
import it.contrader.dto.ExperienceUserFeedbackDTO;
import it.contrader.dto.FeedbackDTO;
import it.contrader.dto.ImagenDTO;
import it.contrader.dto.PrincipiDTO;
import it.contrader.dto.UserDTO;
import it.contrader.model.Experience;
import it.contrader.model.Feedback;
import it.contrader.model.Imagen;
import it.contrader.model.User;
import it.contrader.service.ExperienceService;
import it.contrader.service.FeedbackService;
import it.contrader.service.ImagenService;
import it.contrader.service.PrincipiService;

import lombok.Data;

@Controller
@RequestMapping("/Experience")
public class ExperienceController {
	private final ExperienceService experienceService;
	private final PrincipiService principiService;
	private final FeedbackService feedbackservice;
	private final ImagenService imagenService;
	private ExperienceDTO experienceDTO = new ExperienceDTO();
	private ImagenDTO imagenDTO = new ImagenDTO();
	private Experience experience = new Experience();
	private Feedback feedback = new Feedback();
	private ExperienceConverter experienceConverter = new ExperienceConverter();
	private ImagenConverter imagenConverter = new ImagenConverter();
	private FeedbackDTO feedbackDTO = new FeedbackDTO();
	private FeedbackConverter feedbackconverter = new FeedbackConverter();
	private PrincipiConverter principiConverter = new PrincipiConverter();
	int valore = 0;
	
	
	@Autowired
	public ExperienceController (ExperienceService experienceService,PrincipiService principiService, FeedbackService feedbackservice, ImagenService imagenService ) {
		this.experienceService = experienceService;
		this.principiService = principiService;
		this.feedbackservice = feedbackservice;
		this.imagenService = imagenService;
	}
	
	@RequestMapping(value="/openInsertExperience",method= RequestMethod.GET)
	public String openInsertUser(HttpServletRequest request) {
		int principio = Integer.parseInt(request.getParameter("principio"));
		request.getSession().setAttribute("principio", principio); 
		List <PrincipiDTO> listaPrincipi = principiService.getAllPrincipi();
		request.getSession().setAttribute("listaPrincipi", listaPrincipi); 
		return "insertExperience";
	}
	
	@RequestMapping(value="/insertExperience", method= RequestMethod.GET)
	public String insertUser(HttpServletRequest request) {
		/*String filename=file.getOriginalFilename();
	    byte barr[]=file.getBytes(); 
	    imagenDTO.setNome(filename);
	    imagenDTO.setArchivo(barr);
	    Imagen g = imagenService.insertImagen(imagenDTO);*/
		 Imagen g = (Imagen) request.getSession().getAttribute("imagen");
		 User user =  (User) request.getSession().getAttribute("utente");
		 UserDTO userDTO = ConverterUser.toDTO(user);
		 int id_user = userDTO.getIdUser();
		 String commento= request.getParameter("commento");
	     String positivo = request.getParameter("positivo");
	     String negativo = request.getParameter("negativo");
	     int idpprincipale = (int) request.getSession().getAttribute("principio");
	     int score = Integer.parseInt(request.getParameter("score"));
	     String[]  ids_principi = request.getParameterValues("idsprincipi[]");
	     
	     experienceDTO.setCommento(commento);
	     experienceDTO.setPositivo(positivo);
	     experienceDTO.setNegativo(negativo);
	     experienceDTO.setScore(score);
	     experienceDTO.setUser(user);
	     experienceDTO.setImagen(g);
	     Experience ex = experienceService.insertExperience(experienceDTO);
         if( ids_principi !=null) {
       	     feedbackDTO.setExperience(ex);
       	     PrincipiDTO p = principiService.getPrincipio(idpprincipale);
	    	 feedbackDTO.setPrincipi(PrincipiConverter.convertToEntity(p));
	    	 feedbackDTO.setSecondario(valore);
	    	 this.feedbackservice.insertFeedback(feedbackDTO);
	     for (int i = 0; i < ids_principi.length; i ++) {
	    	 String a = ids_principi[i];
	    	 int id = Integer.parseInt(a);
	    	 int second = 0;
	    	 if(id != idpprincipale)
	    		 second = 1;
	    	 feedbackDTO.setExperience(ex);
	    	 PrincipiDTO b = principiService.getPrincipio(id);
	         feedbackDTO.setPrincipi(PrincipiConverter.convertToEntity(b));
	    	 feedbackDTO.setSecondario(second);
	    	 this.feedbackservice.insertFeedback(feedbackDTO);
	      }
        }
        else {
        	feedbackDTO.setExperience(ex);
        	PrincipiDTO p = principiService.getPrincipio(idpprincipale);
        	feedbackDTO.setPrincipi(PrincipiConverter.convertToEntity(p));
        	feedbackDTO.setSecondario(valore);
	    	this.feedbackservice.insertFeedback(feedbackDTO);
        }
        List<ExperienceUserFeedbackDTO> EUF = experienceService.getAllExperienceUserFeedbackDTO();
 		request.getSession().setAttribute("euf", EUF); 
 		return "AllExperience";
	}
	@RequestMapping(value="/ShowAllExperience", method= RequestMethod.GET)
	public String ShowAllExperience(HttpServletRequest request) {
		List<ExperienceUserFeedbackDTO> EUF = experienceService.getAllExperienceUserFeedbackDTO();
		request.getSession().setAttribute("euf", EUF); 
		return "AllExperience";
		
	}
	
	@RequestMapping(value="/getImage", method= RequestMethod.GET)
	public void getImage(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id =Integer.parseInt(request.getParameter("id"));
		
		
		ExperienceDTO experienceDTO = experienceService.getExperienceByID(id);
		
		//System.out.println(experienceDTO.getImagen().getIdImagen());
        byte[] content = experienceDTO.getImagen().getArchivo();
        response.setContentType("image/jpg");
        response.setContentLength(content.length);
        response.getOutputStream().write(content);
	}
	
	
	
	

}
