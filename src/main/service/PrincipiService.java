package main.service;
import main.dao.PrincipiDAO;
import main.model.Principi;
import java.util.*;

public class PrincipiService {
	private PrincipiDAO principiDAO;
	
	public PrincipiService() {
		this.principiDAO = new PrincipiDAO();
	}
	 public List<Principi> getAllPrincipi  () {
	        return this.principiDAO.getAllPrincipi();
	    }
	 public List<Principi> getByP_Chiave(String parola){
		 return this.principiDAO.getByP_Chiave(parola);
	 } 
	 public Principi ShowPrincipiCasual(int casual){
		 return this.principiDAO.ShowPrincipiCasual(casual);
	 }
	
	 

}
