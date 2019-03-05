package main.controller;

import java.util.List;

import main.MainDispatcher;
import main.model.User;
import main.service.AdminService;

public class InsertUserController implements Controller  {
	
private AdminService adminService;
	
@Override
public void doControl(Request request) {
	// TODO Auto-generated method stub
	this.adminService = new AdminService();
	
	
	
	if (this.adminService.InsertUser((User)request.get("InsertUser"))) {
		
		
 }
	
	MainDispatcher.getInstance().callView("InsertUserView", request);
	
	}
	
	
}
