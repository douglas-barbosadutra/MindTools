package main.controller;

import main.MainDispatcher;

public class ManageShowByParolaChiaveController implements Controller{

	@Override
	public void doControl(Request request) {
		// TODO Auto-generated method stub
		MainDispatcher.getInstance().callView("ManageShowByParolaChiave", request);
		
	}

}
