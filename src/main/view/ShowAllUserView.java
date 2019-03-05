package main.view;

import java.util.List;

import main.MainDispatcher;
import main.controller.Request;
import main.model.User;
import main.service.UserService;

public class ShowAllUserView implements View{
	
private Request request;
private List<User> users;
private UserService userService;

	public ShowAllUserView() {
		this.userService = new UserService();
	}
	
	@Override
	public void showResults(Request request) {
		this.request = request;
		
		List<User> _listaAllUser =  (List<User>) request.get("users");
		if(this.request != null) {
			System.out.println("---Tutti gli User---");
			System.out.println(" ");
			for(User user: _listaAllUser) {
				System.out.println("User: " + user.getUser() + "\nPassword: " + user.getPassword() + "\nNome: " + user.getNome() + "\nCognome: " + user.getCognome() + "\nEmail: " + user.getEmail());
				System.out.println();
			}
			
			//_listaAllUser.forEach(user -> System.out.println(user.toString()));
		}
		
	}

	@Override
	public void showOptions() {
		// TODO Auto-generated method stu
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
