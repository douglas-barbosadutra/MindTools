package it.contrader.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import io.jsonwebtoken.ExpiredJwtException;
//import it.contrader.converter.ConverterUser;
import it.contrader.converter.ExperienceConverter;
import it.contrader.converter.FeedbackConverter;
import it.contrader.converter.PrincipiConverter;
import it.contrader.dto.ExperienceDTO;
import it.contrader.dto.ExperienceDTOAggiornato;
import it.contrader.dto.FeedbackDTO;
import it.contrader.dto.PrincipiDTO;
//import it.contrader.dto.UserDTO;
import it.contrader.model.Experience;
import it.contrader.model.Feedback;
//import it.contrader.model.User;
import it.contrader.service.ExperienceService;
import it.contrader.service.FeedbackService;
import it.contrader.service.ImagenService;
import it.contrader.service.PrincipiService;
import it.contrader.utils.JwtUtils;

@CrossOrigin(value="*")
@RestController
@RequestMapping("/Experience")
public class ExperienceController {
	private final ExperienceService experienceService;
	private final PrincipiService principiService;
	private final FeedbackService feedbackservice;
	private final ImagenService imagenService;
	private ExperienceDTO experienceDTO = new ExperienceDTO();
	private Experience experience = new Experience();
	private Feedback feedback = new Feedback();
	private ExperienceConverter experienceConverter = new ExperienceConverter();
	private FeedbackDTO feedbackDTO = new FeedbackDTO();
	private List<ExperienceDTOAggiornato> listaEsperienze = new ArrayList<ExperienceDTOAggiornato>();
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
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST,
			produces = MediaType.APPLICATION_JSON_VALUE,
		    consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.MULTIPART_FORM_DATA_VALUE})
	@ResponseBody
	public ResponseEntity<ExperienceDTO> insertExperience(@RequestBody ExperienceDTO experienceDTOo, @RequestPart("file") MultipartFile file)throws IOException {
		System.out.println("entrooo");
		byte barr[]= file.getBytes();
		int idpprincipale = experienceDTOo.getIdPrincipi();
	//	experienceDTO.setUser(experienceDTOo.getUser());
		experienceDTO.setIdExperience(0);
		experienceDTO.setIdPrincipi(experienceDTOo.getIdPrincipi());
		experienceDTO.setCommento(experienceDTOo.getCommento());
		experienceDTO.setPositivo(experienceDTOo.getPositivo());
		experienceDTO.setNegativo(experienceDTOo.getNegativo());
		experienceDTO.setScore(experienceDTOo.getScore());
		experienceDTO.setImagen(barr);
		System.out.print(experienceDTOo.getSecon().get(0));
		ExperienceDTO ex = experienceService.insertExperience(experienceDTO);
		if (experienceDTOo.getSecon()!= null) {
			feedbackDTO.setExperience(ExperienceConverter.toEntity(ex));
			PrincipiDTO p = principiService.getPrincipio(idpprincipale);
			feedbackDTO.setPrincipi(PrincipiConverter.convertToEntity(p));
			feedbackDTO.setSecondario(valore);
			this.feedbackservice.insertFeedback(feedbackDTO);
			for (int i = 0; i < experienceDTOo.getSecon().size(); i++) {
				String a = experienceDTOo.getSecon().get(i);
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
		 else {
		feedbackDTO.setExperience(ExperienceConverter.toEntity(ex));
		PrincipiDTO p = principiService.getPrincipio(idpprincipale);
		feedbackDTO.setPrincipi(PrincipiConverter.convertToEntity(p));
		feedbackDTO.setSecondario(valore);
		this.feedbackservice.insertFeedback(feedbackDTO);
		}
		return ResponseEntity.status(HttpStatus.OK).body(experienceDTO);
	}
	

	@RequestMapping(value = "/showAllExperience", method = RequestMethod.GET)
	public ResponseEntity<List<ExperienceDTOAggiornato>> ShowAll(@RequestParam(value="idUser")int idUser) {
		listaEsperienze = experienceService.getAllExperienceUserFeedbackbyIdUser(idUser);
		System.out.println(listaEsperienze);
		return ResponseEntity.status(HttpStatus.OK).body(listaEsperienze);
	}
    private int getRankFromJwt(String jwt) throws ExpiredJwtException, UnsupportedEncodingException {
		
		Map<String, Object> data = JwtUtils.jwt2Map(jwt);
		int rank = Integer.parseInt(data.get("scope").toString());
		
		return rank;
	}
	

	
	

}
