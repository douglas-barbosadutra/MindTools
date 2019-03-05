package main.view;

import java.util.List;
import java.util.Scanner;

import main.controller.Request;
import main.model.Principi;
import main.service.PrincipiService;


public class ShowByParolaChiaveView implements View {
	

	@Override
	public void showResults(Request request) {
		List<Principi>principi = (List<Principi>) request.get("principi");
		String parola  = request.get("parola").toString();
		System.out.println("VISUALIZA ---PRINCIPI PER---PAROLA CHIAVE " + ":  " + parola + " ");
		principi.forEach(p -> System.out.println(p.toString()));
	}

	@Override
	public void showOptions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getInput() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

	@Override
	public void submit() {
		// TODO Auto-generated method stub
		
	}

}
