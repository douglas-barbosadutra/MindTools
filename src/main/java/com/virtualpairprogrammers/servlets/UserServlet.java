package com.virtualpairprogrammers.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.virtualpairprogrammers.converter.UserConverter;
import com.virtualpairprogrammers.dto.UserDTO;
import com.virtualpairprogrammers.model.User;
import com.virtualpairprogrammers.service.UsersService;


/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final UsersService userService = new UsersService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		final HttpSession session = request.getSession();

		if (request != null) {
			final String action = request.getParameter("richiesta").toString();
			
			if(action != null) {
			
			switch(action) {
					
				case "openInsertUser":
					
					getServletContext().getRequestDispatcher("/userInsert.jsp").forward(request, response);
					
				break;
					
				case "insertUser":{
					
					String username = request.getParameter("username").toString();
					String password = request.getParameter("password").toString();
					String nome = request.getParameter("nome").toString();
					String cognome = request.getParameter("cognome").toString();
					String email = request.getParameter("email").toString();
					String tipo_user = "user";
					User user = new User(username, password, nome, cognome, email, tipo_user);
					UserDTO userDTO = UserConverter.toDTO(user);
					userService.insertUsers(userDTO);
					
					session.setAttribute("showUser", "list");
					callShowView(session, request, response);
					
				} break;
					
				case "showUser":{
					
					session.setAttribute("showUser", "list");
					callShowView(session, request, response);
					
				}break;
					
				case "deleteUserManagement":{
					
					session.setAttribute("showUser", "delete");
					callShowView(session, request, response);
					
				}break;
				
			/*	case "deleteUser":
					
					int id = Integer.parseInt(request.getParameter("id").toString());
					userService.deleteUser(id);
					
					session.setAttribute("showUser", "delete");
					callShowView(session, request, response);
					
				break;*/
				
				case "openUpdateUser":{
					
					getServletContext().getRequestDispatcher("/userUpdate.jsp").forward(request, response);
					
				} break;
				
				/*case "updateUser": {
					
					String nome = request.getParameter("nome").toString();
					String cognome = request.getParameter("cognome").toString();
					String username = request.getParameter("username").toString();
					String password = request.getParameter("password").toString();
					String email = request.getParameter("email").toString();
					String telefono = request.getParameter("telefono").toString();
					
					userService.updateUser(nome, cognome, email, telefono, username, password);
					getServletContext().getRequestDispatcher("/homeUser.jsp").forward(request, response);
				
					
				}break;*/
									
				case "logout":
					
					getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
					
				break;
					
				}
			
			}
			
		}
	}
    
        private void callShowView(HttpSession session, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<UserDTO> users = userService.getAllUsers();
		session.setAttribute("users_list", users);
		
		getServletContext().getRequestDispatcher("/userShow.jsp").forward(request, response);
	}

	
	

}
