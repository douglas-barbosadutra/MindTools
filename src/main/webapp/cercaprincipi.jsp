<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.pCarpet.services.PrincipiService" %>
<%@ page import="com.pCarpet.dto.PrincipiDTO" %>
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



</head>

<body>
  <h3>Principio</h3>
   <form action="/homeUser/PrincipiByParola" method="get">
   <input type = "text" id="testo" name="testo" placeholder = "inserisci "testo">
   <button style="margin-top:1%"  type="submit" value="homeUser" >Cerca</button></form>
     </form>

</body>
</html>