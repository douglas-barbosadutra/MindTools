package main.controller;

import java.util.List;

import main.MainDispatcher;
import main.dao.PrincipiDAO;
import main.model.Principi;
import main.service.PrincipiService;

public class ShowAllPrincipiController implements Controller {
	private PrincipiService principiService;
	public ShowAllPrincipiController() {
		principiService = new PrincipiService();

	}

	@Override
	public void doControl(Request request) {
		List<Principi> prin = principiService.getAllPrincipi();
		Request reque = new Request();
		reque.put("lista_principi", prin);
		//chiamata service . retorna lista
		
		//mettere la lista in request
		MainDispatcher.getInstance().callView("ShowAllPrincipi", reque);
		
	}

}
