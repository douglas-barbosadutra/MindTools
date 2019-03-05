package main.controller;

import java.util.List;

import main.MainDispatcher;
import main.model.Principi;
import main.service.PrincipiService;

public class ShowByParolaChiaveController implements Controller {
	private PrincipiService principiService;
	public ShowByParolaChiaveController() {
		principiService = new PrincipiService();
	}

	

	@Override
	public void doControl(Request request) {
		String parola = request.get("parola").toString();
		List<Principi>principi = principiService.getByP_Chiave(parola);
		request.put("principi", principi);
		MainDispatcher.getInstance().callView("ShowByParolaChiave", request);
		
	}

}
