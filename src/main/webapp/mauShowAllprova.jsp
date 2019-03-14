<%@ page import="com.virtualpairprogrammers.dto.PrincipiDTO" %>
<%@ page import="com.virtualpairprogrammers.dto.UserDTO" %>
<%@ page import="java.util.*" %>
 <%@ page import="com.virtualpairprogrammers.service.PrincipiService" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>

<% PrincipiService principiService = new PrincipiService();
List<PrincipiDTO> all_principi = principiService.getAllPrincipi();%>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<form action="PrincipiServlet?PrincipiManager" method="post">
<%
    UserDTO user= (UserDTO) session.getAttribute("utente") ;
	if (user.getLingua().equals("inglese")) {
		
		%>
 
   

 <%
 		int i;
        for (i=0; i < all_principi.size(); i++) { 
        PrincipiDTO principi = all_principi.get(i);
  %>
    
         
         
   <a ondblclick="(function(){
	    window.location.href = 'PrincipiServlet?richiesta=ShowPrincipio&id=<%=principi.getId_principi()%>'; 
	    return false;})();
	    return false;" 
	    onClick="(function(){
	    document.getElementById('img<%=i%>').src='card/<%=i %>retro.jpg'; 
	    return false;})();
	    return false;"> 
   <img id="img<%=i %>" src="card/<%=i %>front.jpg" width="170" height="180"></a>
		
      
	 
	 <%}
        
	}else { 
	 
		
	 
	 %>
	
 
        <%
        int i;
        for (i=0; i < all_principi.size(); i++) { 
        PrincipiDTO principi = all_principi.get(i);
        %>
     
      <a ondblclick="(function(){
	    window.location.href = 'PrincipiServlet?richiesta=ShowPrincipio&id=<%=principi.getId_principi()%>'; 
	    return false;})();
	    return false;" 
	    onClick="(function(){
	    document.getElementById('img<%=i%>').src='card/<%=i %>retro.jpg'; 
	    return false;})();
	    return false;"> 
        <img id="img<%=i %>" src="card/<%=i %>front.jpg" width="170" height="180"></a>
 
	 <%}
	} %>

 </form> 

</body>

</html>