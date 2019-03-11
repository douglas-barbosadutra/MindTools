<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.virtualpairprogrammers.service.PrincipiService" %>
    <%@ page import="com.virtualpairprogrammers.dto.PrincipiDTO" %>
    <%@ page import="java.util.*" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<% PrincipiService principiService = new PrincipiService();
List<PrincipiDTO> allPrincipi = principiService.getAllPrincipi();
= request.getParameter("id_principi"); %>%>
<title>INSERT----MY----EXPERIENCE]</title>
</head>
<body>


<h2><center>------- INSERT EXPERIENCE -------</center></h2>


 <a href="PrincipiServlet?richiesta=return" name="richiesta" method="post">Home </a>
     <form action="ExperienceServlet?action=allExperiences" method="post">
     <h3>Quanto e stato utile questo principio per te? </h3>
     	
     	<h4>Commento: <br> <textarea  id = "experience" name ="commento" placeholder = "inseriscicommento" rows="10" cols="50" ></textarea></h4>
     	
     	<h4>Aspetto positivo:<br> <textarea id = "experience" name ="positivo" placeholder = "inserisciaspettopositivo" rows="5" cols="50"> </textarea></h4><br>
     	
     	<h4>Aspetto negativo:<br> <textarea  id = "experience" name ="negativo" placeholder = "inserisciaspettonegativo" rows="5" cols="50"> </textarea></h4><br>
     	<h4>Voto: <input type = "radio"  id = "experience " name = "score" value = "1"> 1 
     	 <input type = "radio"  id = "experience " name = "score" value = "2"> 2 
     	  <input type = "radio"  id = "experience " name = "score" value = "3"> 3 
     	   <input type = "radio"  id = "experience " name = "score" value = "4"> 4 
     	    <input type = "radio"  id = "experience " name = "score" value = "5"> 5
     	</h4>
     	
 <table >
 <h4> Altri Principi consultati </h4>
  <tr>
	  <td>
	 <% for(int i = 0 ; i< 8 ; i++ ) { %>
	  <input type = "checkbox"   name = "ids_principi[]" value = "<%allPrincipi.get(i).getId_principi(); %>" >
	 <%= allPrincipi.get(i).getId_principi()%> <%= allPrincipi.get(i).getDescrizione() %> <br>
	  <% }%> 
	
	 </td>
	  <td>
	 <% for(int i = 8 ; i< 16 ; i++ ) { %>
	  <input type = "checkbox"  name = "ids_principi[]" value = "<%allPrincipi.get(i).getId_principi(); %>" >
	 <%= allPrincipi.get(i).getId_principi()%> <%= allPrincipi.get(i).getDescrizione() %> <br> 
	 <% }%> 
	  </td>
	 <td>
	 <% for(int i = 16 ; i< 24 ; i++ ) { %>
	  <input type = "checkbox"  name = "ids_principi[]" value = "<%allPrincipi.get(i).getId_principi(); %>" >
	 <%= allPrincipi.get(i).getId_principi()%> <%= allPrincipi.get(i).getDescrizione() %>  <br>
	  <% }%> 
	 </td>
	 
	 <td>
	 
	 <% for(int i = 24 ; i< 32 ; i++ ) { %>
	  <input type = "checkbox"  name = "ids_principi[]" value = "<%allPrincipi.get(i).getId_principi(); %>" >
	 <%= allPrincipi.get(i).getId_principi()%> <%= allPrincipi.get(i).getDescrizione() %>  <br>
	  <% }%>
	   </td>
	 
     <td>
	 <% for(int i = 32 ; i< 40 ; i++ ) { %>
	  <input type = "checkbox"  name = "ids_principi[]" value = "<%allPrincipi.get(i).getId_principi(); %>" >
	 <%= allPrincipi.get(i).getId_principi()%> <%= allPrincipi.get(i).getDescrizione() %> <br> 
	 <% }%>
	 </td> 
	 
  </tr>
  


</table>

  
     	
     <input type="submit" name="action" value="Insert Experience">
     	
     </form>
     
     

     

</body>
</html>