package com.virtualpairprogrammers.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.virtualpairprogrammers.converter.UserConverter;
import com.virtualpairprogrammers.dto.UserDTO;
import com.virtualpairprogrammers.model.User;
import com.virtualpairprogrammers.service.UsersService;


public class RegistrazioneServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	private final UsersService userService = new UsersService();
	
	
	public RegistrazioneServlet()
	{
		super();
	}
	
	 public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	 {
		// final HttpSession session = request.getSession();
		 
		 if (request != null) 
		 {
			final String action = request.getParameter("richiesta").toString();
			
			if(action != null)
			{
				String username = request.getParameter("username").toString();
				String password = request.getParameter("password").toString();
				String nome = request.getParameter("nome").toString();
				String cognome = request.getParameter("cognome").toString();
				String email = request.getParameter("mail").toString();
				String tipouser = "user";
				String lingua = request.getParameter("lingua").toString();
				
				UserDTO userDTO = new UserDTO(username, password, nome, cognome, email, tipouser, lingua);
				System.out.println(userDTO);
				User user = UserConverter.toEntity(userDTO);
				
				userService.insert(user);
				response.sendRedirect("index.jsp");
				
			}
	     }
	 
}
}
	 
