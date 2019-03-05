package main.view;

import java.util.Scanner;

import main.MainDispatcher;
import main.controller.Request;

public class ManageShowByParolaChiaveView implements View {
	private String parola;

	@Override
	public void showResults(Request request) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showOptions() {
		System.out.println("");
		System.out.println("---PRINCIPI PER PAROLA CHIAVE ---");
		System.out.println("");
		System.out.println("Inserici parola chiave:");
		parola = getInput();
		
		
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
		Request request = new Request();
		request.put("parola", parola);
		MainDispatcher.getInstance().callAction("ShowByParolaChiave", "doControl", request);
		
	}

}
