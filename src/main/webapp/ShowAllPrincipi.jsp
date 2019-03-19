 <%@ page import="com.pCarpet.dto.PrincipiDTO" %>
<%@ page import="com.pCarpet.dto.UserDTO" %>
<%@ page import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
List<PrincipiDTO> all_principi = (List<PrincipiDTO>) request.getAttribute("listaprincipi");
%>
<body>
<form class="form-signin" action="/homeUser/ShowAll" method="GET">
<%
 		int i;
        for (i=0; i < all_principi.size(); i++) { 
        PrincipiDTO principi = all_principi.get(i);
  %>
    
         
   <a ondblclick="(function(){
	    window.location.href = 'homeUser/SelezionaPrincipio&id=<%=principi.getIdPrincipi()%>'; 
	    return false;})();
	    return false;" 
	    onClick="(function(){
	    document.getElementById('img<%=i%>').src='card/<%=i %>retro.jpg'; 
	    return false;})();
	    return false;"> 
   <img id="img<%=i %>" src="card/<%=i %>front.jpg" width="170" height="180"></a>
		
      
	 
	 <% } %>
        

 </form> 

</body>

</html>