package it.contrader.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import javax.servlet.http.HttpServletRequest;

import io.jsonwebtoken.ExpiredJwtException;
//import it.contrader.converter.ConverterUser;
import it.contrader.converter.ExperienceConverter;
import it.contrader.converter.FeedbackConverter;
import it.contrader.converter.PrincipiConverter;
import it.contrader.dto.ExperienceDTO;
import it.contrader.dto.ExperienceDTOAggiornato;
import it.contrader.dto.FeedbackDTO;
import it.contrader.dto.PrincipiDTO;
import it.contrader.dto.TokenDTO;
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
	private TokenDTO tokenDTO = new TokenDTO();
	private Experience experience = new Experience();
	private Feedback feedback = new Feedback();
	private ExperienceConverter experienceConverter = new ExperienceConverter();
	private FeedbackDTO feedbackDTO = new FeedbackDTO();
	private List<ExperienceDTOAggiornato> listaEsperienze = new ArrayList<ExperienceDTOAggiornato>();
	private FeedbackConverter feedbackconverter = new FeedbackConverter();
	private PrincipiConverter principiConverter = new PrincipiConverter();
	int valore = 0;
	private static final Logger log = LoggerFactory.getLogger(RestController.class);

	@Autowired
	public ExperienceController(ExperienceService experienceService, PrincipiService principiService,
			FeedbackService feedbackservice, ImagenService imagenService) {
		this.experienceService = experienceService;
		this.principiService = principiService;
		this.feedbackservice = feedbackservice;
		this.imagenService = imagenService;
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public  ResponseEntity<ExperienceDTO> insertExperience( @RequestBody TokenDTO  tokenDTO) {
		
      int rank;
		
		try {
			rank = this.getRankFromJwt(tokenDTO.getJwt());
			
			if(rank == 0) {
				LinkedHashMap experience =(LinkedHashMap) tokenDTO.getParam();
				int iduser = this.getIdUserFromJwt(tokenDTO.getJwt());
				String commento =  (String) experience.get("commento");
				int idpprincipale =  Integer.parseInt(experience.get("idPrincipi").toString());
				String negativo = (String) experience.get("negativo");
				String positivo = (String) experience.get("positivo");
				int score =  Integer.parseInt(experience.get("score").toString());
				List<String> secon = (List<String>) experience.get("secon");
				System.out.println(secon);
				experienceDTO.setImagen(ImagenController.im);
				experienceDTO.setIdUser(iduser);
				experienceDTO.setIdExperience(0);
				experienceDTO.setIdPrincipi(idpprincipale);
				experienceDTO.setCommento(commento.toString());
				experienceDTO.setPositivo(positivo.toString());
				experienceDTO.setNegativo(negativo.toString());
				experienceDTO.setScore(score);
				System.out.print(experienceDTO);
				ExperienceDTO ex = experienceService.insertExperience(experienceDTO);
				if (secon!= null) {
					feedbackDTO.setExperience(ExperienceConverter.toEntity(ex));
					PrincipiDTO p = principiService.getPrincipio(idpprincipale);
					feedbackDTO.setPrincipi(PrincipiConverter.convertToEntity(p));
					feedbackDTO.setSecondario(valore);
					this.feedbackservice.insertFeedback(feedbackDTO);
					for (int i = 0; i < secon.size(); i++) {
						String a = secon.get(i);
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
				
			else
				return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
			
		} catch (ExpiredJwtException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
		}
		
		
	}
	

	@RequestMapping(value = "/showAllExperience", method = RequestMethod.GET)
	public ResponseEntity<List<ExperienceDTOAggiornato>> ShowAll(HttpServletRequest request, @RequestParam(value="jwt") String jwt) {
		 int rank;
			try {
				rank = this.getRankFromJwt(jwt);
				if(rank == 0) {
					int idUser = getIdUserFromJwt(jwt);
					listaEsperienze = experienceService.getAllExperienceUserFeedbackbyIdUser(idUser);
					System.out.println(listaEsperienze);
					return ResponseEntity.status(HttpStatus.OK).body(listaEsperienze);
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
   private int getIdUserFromJwt(String jwt) throws ExpiredJwtException, UnsupportedEncodingException {
		
		Map<String, Object> data = JwtUtils.jwt2Map(jwt);
		int idUser = Integer.parseInt(data.get("subject").toString());
		
		return idUser;
	}
	

	
	

}
