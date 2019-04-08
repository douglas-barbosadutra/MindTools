package it.contrader.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.Path;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import it.contrader.converter.ConverterUser;
import it.contrader.converter.ExperienceConverter;
import it.contrader.converter.FeedbackConverter;
import it.contrader.converter.ImagenConverter;
import it.contrader.converter.PrincipiConverter;
import it.contrader.dto.ExperienceDTO;
import it.contrader.dto.ExperienceDTOAggiornato;
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

@CrossOrigin(value="*")
@RestController
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
	public ExperienceController(ExperienceService experienceService, PrincipiService principiService,
			FeedbackService feedbackservice, ImagenService imagenService) {
		this.experienceService = experienceService;
		this.principiService = principiService;
		this.feedbackservice = feedbackservice;
		this.imagenService = imagenService;
	}

/*	@RequestMapping(value = "/openInsertExperience", method = RequestMethod.GET)
	public String openInsertUser(HttpServletRequest request) {
		int principio = Integer.parseInt(request.getParameter("principio"));
		request.getSession().setAttribute("principio", principio);
		List<PrincipiDTO> listaPrincipi = principiService.getAllPrincipi();
		request.getSession().setAttribute("listaPrincipi", listaPrincipi);
		return "insertExperience";
	}*/
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public ResponseEntity<String> insertExperience(@RequestBody ExperienceDTO experienceDTOo) {
		
		int idpprincipale = experienceDTO.getIdPrincipi();
		experienceDTO.setUser(experienceDTOo.getUser());
		experienceDTO.setIdExperience(0);
		experienceDTO.setIdPrincipi(experienceDTOo.getIdPrincipi());
		experienceDTO.setCommento(experienceDTOo.getCommento());
		experienceDTO.setPositivo(experienceDTOo.getPositivo());
		experienceDTO.setNegativo(experienceDTOo.getNegativo());
		experienceDTO.setScore(experienceDTOo.getScore());
		experienceDTO.setImagen(ImagenController.im);
		System.out.println(experienceDTO.toString());
		ExperienceDTO ex = experienceService.insertExperience(experienceDTO);
		System.out.print(experienceDTOo.getSecon());
		
		
		if (experienceDTOo.getSecon().isEmpty()) {
			feedbackDTO.setExperience(ExperienceConverter.toEntity(ex));
			PrincipiDTO p = principiService.getPrincipio(idpprincipale);
			feedbackDTO.setPrincipi(PrincipiConverter.convertToEntity(p));
			feedbackDTO.setSecondario(valore);
			this.feedbackservice.insertFeedback(feedbackDTO);
			}
		 else {
			feedbackDTO.setExperience(ExperienceConverter.toEntity(ex));
			PrincipiDTO p = principiService.getPrincipio(idpprincipale);
			feedbackDTO.setPrincipi(PrincipiConverter.convertToEntity(p));
			feedbackDTO.setSecondario(valore);
			this.feedbackservice.insertFeedback(feedbackDTO);
			for (int i = 0; i < experienceDTO.getSecon().size(); i++) {
				String a = experienceDTO.getSecon().get(i);
				int id = Integer.parseInt(a);
				int second = 0;
				if (id != idpprincipale)
					second = 1;
				feedbackDTO.setExperience(ExperienceConverter.toEntity(ex));
				PrincipiDTO b = principiService.getPrincipio(id);
				feedbackDTO.setPrincipi(PrincipiConverter.convertToEntity(b));
				feedbackDTO.setSecondario(second);
				this.feedbackservice.insertFeedback(feedbackDTO);
			
		   }
			
		 }
	
		
		return new ResponseEntity<String>("Experienza ok", HttpStatus.OK);
	}

	@RequestMapping(value = "/showAllExperience", method = RequestMethod.GET)
	public List<ExperienceDTOAggiornato> ShowAll(@RequestParam(value="idUser")int idUser) {
		List<ExperienceDTOAggiornato> listaEsperienze = new ArrayList<>();
		listaEsperienze = experienceService.getAllExperienceUserFeedbackbyIdUser(idUser);
		return listaEsperienze;
	}

	/*
	 * @RequestMapping(value="/showAllExperience" , method= RequestMethod.GET)
	 * public List<ExperienceUserFeedbackDTO> showAllExperience() { int id =
	 * Integer.parseInt("idUser"); return
	 * experienceService.getAllExperienceUserFeedbackbyIdUser(id); } public String
	 * showExperience(@RequestParam(value="idUser")int idUser) { int idexperience =
	 * Integer.parseInt("idExperience"); ExperienceUserFeedbackDTO experience =
	 * (ExperienceUserFeedbackDTO)
	 * experienceService.getAllExperienceUserFeedbackDTO(); return "experience"; }
	 */

	@RequestMapping(value = "/getImage", method = RequestMethod.GET)
	public void getImage(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));

		ExperienceDTO experienceDTO = experienceService.getExperienceByID(id);

		// System.out.println(experienceDTO.getImagen().getIdImagen());
		/*byte[] content = experienceDTO.getImagen().getArchivo();
		response.setContentType("image/jpg");
		response.setContentLength(content.length);
		response.getOutputStream().write(content);*/
	}

}
