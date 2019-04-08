package it.contrader.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.converter.ConverterUser;
import it.contrader.converter.ExperienceConverter;
import it.contrader.dao.UserDAO;
import it.contrader.converter.ExperienceConverter;
import it.contrader.dao.ExperienceRepository;
import it.contrader.dto.ExperienceDTO;
import it.contrader.dto.ExperienceDTOAggiornato;
import it.contrader.dto.ExperienceUserFeedbackDTO;
import it.contrader.dto.FeedbackDTO;
import it.contrader.dto.FeedbackPrincipiExperienceDTO;
import it.contrader.dto.PrincipiDTO;
import it.contrader.dto.UserDTO;
import it.contrader.model.Experience;
import it.contrader.model.User;

@Service
public class ExperienceService {
	private final ExperienceRepository experienceRepository;
	private final FeedbackService feedbackservice;
	private final UserService userService;

	@Autowired
	public ExperienceService(ExperienceRepository experienceRepository, FeedbackService feedbackservice,
			UserService userService) {
		this.experienceRepository = experienceRepository;
		this.feedbackservice = feedbackservice;
		this.userService = userService;
	}

	public ExperienceDTO insertExperience(ExperienceDTO experienceDTO) {
		Experience e = experienceRepository.saveAndFlush(ExperienceConverter.toEntity(experienceDTO));

		return ExperienceConverter.toDTO(e);
	}

	public List<ExperienceDTO> allExperience(User user) {
		List<ExperienceDTO> ex = new ArrayList();
		List<Experience> entity = experienceRepository.findAll();
		entity.forEach(experience -> ex.add(ExperienceConverter.toDTO(experience)));
		return ex;
	}

	public List<ExperienceDTO> getExperienceByUser(Integer idUser) {
		User user = new User();
		user.setIdUser(idUser);
		return ExperienceConverter.toListDTO(experienceRepository.findByUser(user));
	}

	public List<ExperienceDTO> allExperience() {

		List<ExperienceDTO> ex = new ArrayList();

		List<Experience> entity = experienceRepository.findAll();

		entity.forEach(experience -> ex.add(ExperienceConverter.toDTO(experience)));

		return ex;

	}

	public List<ExperienceUserFeedbackDTO> getAllExperienceUserFeedbackDTO() {

		List<ExperienceUserFeedbackDTO> listaexperienceUserFeedbackDTO = new ArrayList<ExperienceUserFeedbackDTO>();

		List<UserDTO> users = this.userService.getAllUsers();

		List<ExperienceDTO> experiences = allExperience();

		List<FeedbackDTO> feedbacks = this.feedbackservice.getAllFeedback();

		for (FeedbackDTO f : feedbacks) {

			for (ExperienceDTO e : experiences) {

				for (UserDTO u : users) {

					if (u.getIdUser() == e.getUser().getIdUser()) {

						if (e.getIdExperience() == f.getExperience().getIdExperience()) {

							if (f.getSecondario() == 0) {

								ExperienceUserFeedbackDTO nuovoDTO = new ExperienceUserFeedbackDTO();

								nuovoDTO.setCognome(u.getCognome());

								nuovoDTO.setNome(u.getNome());

								nuovoDTO.setCommento(e.getCommento());

								nuovoDTO.setScore(e.getScore());

								nuovoDTO.setPrincipi(f.getPrincipi());

								nuovoDTO.setExperience(f.getExperience());

								nuovoDTO.setImagen(e.getImagen());

								listaexperienceUserFeedbackDTO.add(nuovoDTO);

							}

						}

					}

				}

			}

		}

		return listaexperienceUserFeedbackDTO;

	}

	public List<ExperienceDTOAggiornato> getAllExperienceUserFeedbackbyIdUser(int idUser) {
		List<ExperienceDTOAggiornato> lista = new ArrayList<ExperienceDTOAggiornato>();
		UserDTO user = this.userService.findUserByIduser(idUser);
		List<ExperienceDTO> experiences = this.getExperienceByUser(ConverterUser.toEntity(user).getIdUser());
		for (ExperienceDTO experienceDTO : experiences) {
			FeedbackPrincipiExperienceDTO feedbackDTO = this.feedbackservice.getFeedbackPrincipiExperienceDTO(ExperienceConverter.toEntity(experienceDTO).getIdExperience());
			ExperienceDTOAggiornato obj = new ExperienceDTOAggiornato();
			obj.setNomeUtente(user.getNome());
			obj.setCommentoExperience(experienceDTO.getCommento());
			obj.setScoreExperience(experienceDTO.getScore());
			obj.setIdPrincipio(feedbackDTO.getId_principi());
			lista.add(obj);
		}
		return lista;
	}

	public ExperienceDTO getExperienceByID(Integer id) {
		return ExperienceConverter.toDTO(experienceRepository.getOne(id));
	}

}
