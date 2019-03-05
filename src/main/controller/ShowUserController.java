package main.controller;

import java.util.List;

import main.MainDispatcher;
import main.model.User;
import main.service.AdminService;

public class ShowUserController implements Controller {
	
private AdminService adminService;
	
	public ShowUserController() {	
	}
	
	@Override
	public void doControl(Request request) {
		this.adminService = new AdminService();
		List<User> _users = adminService.getAllUser();
		request.put("users", _users);
		MainDispatcher.getInstance().callView("ShowAllUser", request);
		
	}
}
