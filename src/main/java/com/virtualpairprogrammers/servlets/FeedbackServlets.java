package com.virtualpairprogrammers.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.virtualpairprogrammers.dto.FeedbackDTO;
import com.virtualpairprogrammers.service.FeedbackService;

public class FeedbackServlet extends HttpServlet {

	private final FeedbackService usersService = new FeedbackService();

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		final HttpSession session = request.getSession();
		session.setAttribute("utente", request);
		

		if (request != null) {
			final String user = request.getParameter("username").toString();
			final String password = request.getParameter("password").toString();
			// recuperiamo l'utente
			final FeedbackDTO userDTO = feedbackService.getUserByUsernameAndPassword(user, password);

			if (userDTO != null)
				session.setAttribute("utente", userDTO);

			// verifichiamo che tipo di ruolo ha all'interno dell'applicazione
			// e lo reindirizziamo nella jsp opportuna
			
			switch (usersService.getUserByUsernameAndPassword(user, password).getTipouser()) {
			case "amministratore":
				getServletContext().getRequestDispatcher("/homeAdmin.jsp").forward(request, response);
				break;
				
			case "user":
				getServletContext().getRequestDispatcher("/homeUser.jsp").forward(request, response);
				break;
			default:
				getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
				break;
			}
		}
	}

}
