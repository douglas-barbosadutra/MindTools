    <%@ page import="com.pCarpet.dto.PrincipiDTO" %>
    <%@ page import="com.pCarpet.dto.UserDTO" %>
    <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <!DOCTYPE html>
<html>
	<head>
	
		<meta charset="UTF-8">
		<link href = "Stile.css" rel = "stylesheet" media = "screen">
		<%PrincipiDTO principio = (PrincipiDTO) session.getAttribute("Principio"); %>
		<% int  idprincipio =principio.getIdPrincipi();%>
		
		<title>SelezionaPrincipio</title>
	</head>
	
	
	<body>
	<form class="form-signin" action="/homeUser/SelezionaPrincipio" method="GET">
	
	<center><table>
	
	
	<tr><td><img src="/card/<%=idprincipio%>front.jpg"  width="400" height="500"></td><td>     

	<img src="/card/<%=idprincipio%>retro.jpg" width="400" height="500"></td></tr>    
	

	</form>
	 <tr><td>  <form action="PrincipiServlet" method=post>
		<button type="submit" value="Indietro" name="richiesta">Indietro</button> 
	 <a href="homeUser/SelezionaPrincipio/insertExperience&principio=<%=principio%>">Insert Experience</a></td><td> 
	 
	</form></td></tr> 
	
	</table></center>
	
	</body>
	</html>