package main.view;

import main.MainDispatcher;
import main.controller.Request;

import java.util.Scanner;

public class HomeUserView implements View {

    private int choice;

    public void showResults(Request request) {

    }

    public void showOptions() {
        System.out.println("");
        System.out.println("-------MENU UTENTE-------");
        System.out.println("");
        System.out.println("1) Visualizza tutti principi"); 
        System.out.println("2) Visualizza principio causale");
        System.out.println("3) Visualizza principi per parola chiave");
        System.out.println("4) Logout");
        this.choice = Integer.parseInt(getInput());
    }

    public void submit() {
    	
    	if(this.choice == 1) {
    		MainDispatcher.getInstance().callAction("ShowAllPrincipi", "doControl", null);
    	}else if (this.choice == 2)
            MainDispatcher.getInstance().callAction("ShowPrincipioCasual", "doControl", null);
        else if (choice == 3) {
        	MainDispatcher.getInstance().callAction("ManageShowByParolaChiave", "doControl", null);
        }else
            MainDispatcher.getInstance().callAction("Login", "doControl", null);
    }


    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
