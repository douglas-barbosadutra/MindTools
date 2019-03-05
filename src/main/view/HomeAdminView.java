package main.view;




import main.MainDispatcher;
import main.controller.Request;
import main.model.User;

import java.util.List;
import java.util.Scanner;

public class HomeAdminView implements View {
	
	private int choice;
	List<User> users;
	



    public void showResults(Request request) { 
    	//users= (List<User>) request.get("users");
    //	users.forEach(c-> System.out.println(c.getIduser()+"  "+ ););
    	
    }

    
    

    public void showOptions() {
        System.out.println("");
        System.out.println("-------MENU AMMINISTRATORE-------");
        System.out.println("");
        System.out.println("1) Inserisci utente");
        System.out.println("2) Elimina utente");
        
        System.out.println("3) Modifica utente"); 
        System.out.println("4) Visualizza utenti");
        System.out.print(".: ");
        this.choice = Integer.parseInt(getInput());
    }
    
    
    @Override
	 public String getInput() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	 }
    
    
    
    
    public void submit() {
    	
    	 Request request= new Request();
    	 
		 if (choice == 1) {
			
			 request.put("mode","InsertUser");
	            MainDispatcher.getInstance().callAction("InsertUser", "doControl", request);
	            
		 }
	        else if(choice == 2) {
	        	
	            request.put("mode", "DeleteUser");
	            MainDispatcher.getInstance().callAction("DeleteUser", "doControl", request);
	        }
	        
	        else if(choice==3) {
	        	
	        	request.put("mode", "UpdateUser");
	        	MainDispatcher.getInstance().callAction("UpdateUser", "doControl", request);
	        }
	        
	        else if(choice==4) {
	        	
	        	request.put("mode", "ShowAllUser");
	        	MainDispatcher.getInstance().callAction("ShowUser", "doControl", request);
	        
	        }
		    
    }

	 

	
	 
}
	
	
    


	
	
	

