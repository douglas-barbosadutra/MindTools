package main.controller;

import main.MainDispatcher;
import main.model.User;
import main.service.LoginService;
import main.service.UserService;

public class HomeController implements Controller {

	private LoginService loginService;
	private String username;
	private String password;

	public HomeController() {
		loginService = new LoginService();
	}

	public void doControl(Request request) { 

		User _user = new User();

		if (request != null) {
			username = request.get("user").toString();
			password = request.get("password").toString();

			_user = loginService.login(username, password);
			if(_user != null) {
				if (_user.getTipoUser().equals("amministratore")) {
					MainDispatcher.getInstance().callView("HomeAdmin", null);
				} else if (_user.getTipoUser().equals("user")) {
					MainDispatcher.getInstance().callView("HomeUser", request);
				} else
					MainDispatcher.getInstance().callAction("Login", "doControl", request);


			}else {
				MainDispatcher.getInstance().callAction("Login", "doControl", request);
			}
		}         	
	}
}
