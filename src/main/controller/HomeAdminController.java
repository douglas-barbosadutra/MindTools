package main.controller;

import main.MainDispatcher;
import main.model.User;
import main.service.AdminService;


public class HomeAdminController implements Controller {

    private AdminService HomeAdminService;
    public HomeAdminController() {
        HomeAdminService = new AdminService();
    }
    
    User user = null;
	@Override
	public void doControl(Request request) {
		// TODO Auto-generated method stub
		
	 }
}
	
	
