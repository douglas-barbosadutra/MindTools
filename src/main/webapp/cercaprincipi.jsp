<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.virtualpairprogrammers.service.PrincipiService" %>
<%@ page import="com.virtualpairprogrammers.dto.PrincipiDTO" %>
<%@ page import="com.virtualpairprogrammers.dto.UserDTO" %>
<%@ page import="java.util.*" %>


<!DOCTYPE HTML>
<html>

<head>

<!-- <meta charset="UTF-8"> -->
<%-- <%PrincipiDTO principio = (PrincipiDTO) request.getAttribute("principio"); %> --%>
<%-- 		<% int  idprincipio =principio.getId_principi(); --%>
<%-- 		%> --%>
<!-- 		<title>SelezionaPrincipio</title> -->
<%-- <% PrincipiService principiService = new PrincipiService(); --%>
<%-- List<PrincipiDTO> all_principi = principiService.getAllPrincipi();%> --%>
<!-- <meta charset="ISO-8859-1"> -->


<% 
	UserDTO user= (UserDTO) session.getAttribute("utente") ;
	
		
		%>
</head>

<body>
  <h3>Principio</h3>
     <form action="PrincipiServlet" method="post">
     <input type = "text" id="testo" name="testo" placeholder = "inserisci "testo"">
     <input type="submit" value="lista" name="richiesta">
     </form>

</body>
</html>