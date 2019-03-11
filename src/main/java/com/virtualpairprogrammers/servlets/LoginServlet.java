 package com.virtualpairprogrammers.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.virtualpairprogrammers.converter.UserConverter;
import com.virtualpairprogrammers.dto.UserDTO;
import com.virtualpairprogrammers.service.UsersService;

public class LoginServlet extends HttpServlet {

	private final UsersService usersService = new UsersService();

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		final HttpSession session = request.getSession();
		session.setAttribute("utente", request);
		

		if (request != null) {
			final String user = request.getParameter("username").toString();
			final String password = request.getParameter("password").toString();
			// recuperiamo l'utente
			final UserDTO userDTO = usersService.getUserByUsernameAndPassword(user, password);
			

			if (userDTO != null) {
				session.setAttribute("utente", userDTO);
				UsersService.user =(UserConverter.toEntity(userDTO));
				
			}
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
