package main.view;
import java.util.List;

import main.MainDispatcher;
import main.controller.Request;
import main.model.Principi;

public class ShowAllPrincipiView implements View {

	@Override
	public void showResults(Request request) {

		List<Principi> principi = (List<Principi>) request.get("lista_principi");
		principi.forEach(p -> System.out.println(p.toString()));
		
	}

	@Override
	public void showOptions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getInput() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void submit() {
		// TODO Auto-generated method stub
		
	}

}
