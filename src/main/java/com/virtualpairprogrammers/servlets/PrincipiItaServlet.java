package com.virtualpairprogrammers.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.virtualpairprogrammers.dto.PrincipiItaDTO;

import com.virtualpairprogrammers.service.PrincipiItaService;

public class PrincipiItaServlet extends HttpServlet {

	// private final PrincipiService principiServiceDTO = new PrincipiService();
	private List<PrincipiItaDTO> allPrincipi = new ArrayList<>();
	private PrincipiItaDTO principioita = new PrincipiItaDTO();
	private PrincipiItaDTO idprincipioita = new PrincipiItaDTO();
	private PrincipiItaService principiitaService;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		principiitaService = new PrincipiItaService();
		final String scelta = request.getParameter("richiesta");
		final HttpSession session = request.getSession(true);
		

		switch (scelta) {
		case "PrincipiItaManager":
			allPrincipi = this.principiitaService.getAllPrincipiita();
			
			request.setAttribute("allPrincipi", allPrincipi);

			getServletContext().getRequestDispatcher("/ShowAllPrincipiIta.jsp").forward(request, response);
			break;

		case "ShowItaPrincipio":
			principioita = this.principiitaService.getPrincipio(Integer.parseInt(request.getParameter("id")));
			session.setAttribute("principioita", principioita);
			getServletContext().getRequestDispatcher("/SelezionaPrincipioIta.jsp").forward(request, response);
			break;
			
		case "return":
			getServletContext().getRequestDispatcher("/homeUser.jsp").forward(request, response);
			break;
		/*case "InserisciExperience":
			idprincipio = this.principiServiceDTO.getPrincipio(Integer.parseInt(request.getParameter("id")));
			int id_principi= idprincipio.getId_principi();
			System.out.println("SEI QUI???: " + id_principi);  
			request.setAttribute("id_principi", id_principi);  // qua Arriva correttamente
			getServletContext().getRequestDispatcher("/insertExperience.jsp").forward(request, response);
		
			break; */
			
			

		}

	}

}
