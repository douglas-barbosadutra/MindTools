package main.view;
import main.controller.Request;
import main.model.Principi;

public class ShowPrincipioCasualView implements View {

	@Override
	public void showResults(Request request) {
		Principi principi = (Principi) request.get("principi");
		System.out.println("VISUALIZA----PRINCIPI---CASUALE:");
		System.out.println(principi.toString());
		
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
