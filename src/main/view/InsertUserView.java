package main.view;

import java.util.Scanner;

import main.controller.Request;
import main.model.User;

public class InsertUserView implements View {
	
	private Request request;

	
	String user,password,nome,cognome,email;
	
	public void showResults(Request request) {
		this.request = request;
		
	}
	
	public void showOptions() {
		
		System.out.println("Inserisci i dati dell' User");
		
		System.out.println("user:");
		String user = getInput();
		System.out.println("password");
		String password = getInput();
		System.out.println("nome");
		String nome = getInput();
		System.out.println("cognome");
		String cognome = getInput();
		System.out.println("email");
		String email = getInput();
		
		User InsertUser = new User (0,user,password,nome,cognome,email);
		request = new Request();
		this.request.put("InsertUser", InsertUser);
	}
	
	public String getInput() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();	
	}  

	@Override
	public void submit() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
