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

import com.virtualpairprogrammers.service.PrincipiService;

public class PrincipiServlet extends HttpServlet {

	// private final PrincipiService principiServiceDTO = new PrincipiService();
	private List<PrincipiDTO> allPrincipi = new ArrayList<>();
	private PrincipiDTO principio = new PrincipiDTO();
	private PrincipiService principiServiceDTO;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		principiServiceDTO = new PrincipiService();
		final String scelta = request.getParameter("richiesta");
		final HttpSession session = request.getSession(true);
		int id_principi=Integer.parseInt(request.getParameter("id_principi"));
		// System.out.println("XD: " + scelta);

		switch (scelta) {
		case "PrincipiManager":
			allPrincipi = this.principiServiceDTO.getAllPrincipi();
			
			request.setAttribute("allPrincipi", allPrincipi);

			getServletContext().getRequestDispatcher("/mauShowAllprova.jsp").forward(request, response);
			break;

		case "ShowPrincipio":
			principio = this.principiServiceDTO.getPrincipio(Integer.parseInt(request.getParameter("id")));
			session.setAttribute("principio", principio);
			getServletContext().getRequestDispatcher("/SelezionaPrincipio.jsp").forward(request, response);
			break;
		case "return":
			getServletContext().getRequestDispatcher("/homeUser.jsp").forward(request, response);
			break;
		case "InserisciExperience":
			
			request.setAttribute("id_principi", id_principi);
			getServletContext().getRequestDispatcher("/insertExperience.jsp").forward(request, response);
			break;
			
			

		}

	}

	/*
	 * private void showAllPrincipi(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { allPrincipi =
	 * this.principiServiceDTO.getAllPrincipi(); request.setAttribute("allPrincipi",
	 * allPrincipi);
	 * getServletContext().getRequestDispatcher("/principi.jsp").forward(request,
	 * response); }
	 */

}
