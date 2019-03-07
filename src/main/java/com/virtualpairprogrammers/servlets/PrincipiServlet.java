package com.virtualpairprogrammers.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.virtualpairprogrammers.dto.PrincipiDTO;

import com.virtualpairprogrammers.service.PrincipiServiceDTO;

public class PrincipiServlet extends HttpServlet {
	
	private final PrincipiServiceDTO principiServiceDTO = new PrincipiServiceDTO();
	private List<PrincipiDTO> allPrincipi = new ArrayList<>();
	private PrincipiDTO principio= new PrincipiDTO();

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		final String scelta = request.getParameter("richiesta");
		final HttpSession session = request.getSession(true); 
		//int id_principi=Integer.parseInt(request.getParameter("id_principi"));
		System.out.println("XD: " + scelta);
		
		switch (scelta) {

		case "PrincipiManager":
			allPrincipi = this.principiServiceDTO.getAllPrincipi();
			System.out.println("principio");
			request.setAttribute("allPrincipi", allPrincipi);
			getServletContext().getRequestDispatcher("/homePrincipi.jsp").forward(request, response);
			break;	
			
		case "ShowPrincipio":
			/*principio = this.principiServiceDTO.getPrincipio(id_principi);
			request.setAttribute("principio", principio);
			//System.out.println("principio"+ principio.getDescrizione());
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);*/
			break;	
			
		}
		
	}
		
		/*private void showAllPrincipi(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			allPrincipi = this.principiServiceDTO.getAllPrincipi();
			request.setAttribute("allPrincipi", allPrincipi);
			getServletContext().getRequestDispatcher("/principi.jsp").forward(request, response);
		} */
	

}
