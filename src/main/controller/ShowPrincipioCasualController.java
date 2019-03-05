package main.controller;

import java.util.List;

import main.MainDispatcher;
import main.model.Principi;
import main.service.PrincipiService;

public class ShowPrincipioCasualController implements Controller{
	private PrincipiService principiService;
	public ShowPrincipioCasualController() {
		principiService = new PrincipiService();
	}

	@Override
	public void doControl(Request request) {
		int casual = (int) (Math.random()*40+1);
		Principi principi = principiService.ShowPrincipiCasual(casual);
		Request reque = new Request();
		reque.put("principi", principi);
		MainDispatcher.getInstance().callView("ShowPrincipioCasual", reque);
		
	}

}
