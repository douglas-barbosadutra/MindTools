    <%@ page import="com.virtualpairprogrammers.dto.PrincipiDTO" %>
    <%@ page import="com.virtualpairprogrammers.dto.UserDTO" %>
    <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <!DOCTYPE html>
<html>
	<head>
	
		<meta charset="UTF-8">
		<link href = "Stile.css" rel = "stylesheet" media = "screen">
		<%PrincipiDTO principio = (PrincipiDTO) request.getAttribute("principio"); %>
		<% int  idprincipio =principio.getId_principi(); %>
		
		<title>SelezionaPrincipio</title>
	</head>
	
	<% 
	UserDTO user= (UserDTO) session.getAttribute("utente") ;
	if (user.getLingua().equals("inglese")) { 
		
		%>
	
	
	<body>
	<form action="ExperienceServlet?action=Insert_Experience" method="post">
	<table>
	<tr>
				<th></th>
				<th>No.</th>
				<th>Question</th>
				<th>Path</th>
				<th>Key Word</th>
				<th></th>
				<th></th>

			</tr>
		<tr>
		
		<td></td>

				<td><%=idprincipio%></td>
				
				<td><%=principio.getD_numeri()%></td>
				<td><%=principio.getD_punti()%></td>			
				<td><%=principio.getP_chiave()%></td>
				<td></td>
				<td></td>
				
				<td>
             <a href="PrincipiServlet?richiesta=InserisciExperience&id=<%=principio.getId_principi()%>">Insert Experience</a>
             
              
         </td>
				
				
		</tr>
	</table>
	</form>
	
	 <%}
        
	else { 
	 
	 
	 %>
	 
	 <form action="ExperienceServlet?action=Insert_Experience" method="post">
	<table>
	<tr>
				<th></th>
				<th>No.</th>
				<th>Domanda</th>
				<th>Percorso</th>
				<th>Parola chiave</th>
				<th></th>
				<th></th>

			</tr>
		<tr>
		
		<td></td>

					<td><%=idprincipio%></td>
				
				<td><%=principio.getD_numeriIta()%></td>
				<td><%=principio.getD_puntiIta()%></td>			
				<td><%=principio.getP_chiaveIta()%></td>
				<td></td>
				<td></td>
				
				<td>
             <a href="PrincipiServlet?richiesta=InserisciExperience&id=<%=principio.getId_principi()%>">Inserisci Esperienza</a>
             
              
         </td>
				
				
		</tr>
	</table>
	</form>
	
	<% } %>
	
	
	
	
	</body>
	</html>