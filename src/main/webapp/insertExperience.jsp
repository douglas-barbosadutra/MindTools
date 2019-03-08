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
List<PrincipiDTO> allPrincipi = principiService.getAllPrincipi();%>
<title>INSERT----MY----EXPERIENCE]</title>
</head>
<body>


<h2><center>------- INSERT EXPERIENCE -------</center></h2>

<form action="ExperienceServlet" method="post">
	<input type="submit" value="HOME" name="richiesta">
</form>
     <form action="ExperienceServlet?action=Insert_Experience" method="post">
     <h3>Quanto e stato utile questo principio per te? </h3>
     	
     	<h4>Commento:<br> <input type = "text" id = "experience" name ="commento" placeholder = "inseriscicommento" class = "my_text"></h4>
     	
     	<h4>Aspetto positivo:<br> <input type = "text" id = "experience" name ="positivo" placeholder = "inserisciaspettopositivo"></h4><br>
     	
     	<h4>Aspetto negativo:<br> <input type = "text" id = "experience" name ="negativo" placeholder = "inserisci aspettonegativo"></h4><br>
     	<h4>Voto: <input type = "radio"  id = "experience " name = "score" value = "1"> 1 
     	 <input type = "radio"  id = "experience " name = "score" value = "2"> 2 
     	  <input type = "radio"  id = "experience " name = "score" value = "3"> 3 
     	   <input type = "radio"  id = "experience " name = "score" value = "4"> 4 
     	    <input type = "radio"  id = "experience " name = "score" value = "5"> 5
     	</h4>
     	
 <table>
 <th> Altri Principi consultati </th>
  <tr aling= center>
	<td>
	 <% for(int i = 0 ; i< 8 ; i++ ) { %>
	  <input type = "checkbox"   name = "ids_principi[]" value = "<%allPrincipi.get(i).getId_principi(); %>" >
	 <%= allPrincipi.get(i).getId_principi()%> <%= allPrincipi.get(i).getDescrizione() %> </td> <br> <% }%> </tr>
	<tr>
	 <td>
	 <% for(int i = 8 ; i< 16 ; i++ ) { %>
	  <input type = "checkbox"  name = "ids_principi[]" value = "<%allPrincipi.get(i).getId_principi(); %>" >
	 <%= allPrincipi.get(i).getId_principi()%> <%= allPrincipi.get(i).getDescrizione() %> </td> <br> <% }%> </tr>
	 
	 <td>
	 <% for(int i = 16 ; i< 24 ; i++ ) { %>
	  <input type = "checkbox"  name = "ids_principi[]" value = "<%allPrincipi.get(i).getId_principi(); %>" >
	 <%= allPrincipi.get(i).getId_principi()%> <%= allPrincipi.get(i).getDescrizione() %> </td> <br> <% }%>
	 
	 <td>
	 <% for(int i = 24 ; i< 32 ; i++ ) { %>
	  <input type = "checkbox"  name = "ids_principi[]" value = "<%allPrincipi.get(i).getId_principi(); %>" >
	 <%= allPrincipi.get(i).getId_principi()%> <%= allPrincipi.get(i).getDescrizione() %> </td> <br> <% }%>
	 <td>
	 <% for(int i = 32 ; i< 40 ; i++ ) { %>
	  <input type = "checkbox"  name = "ids_principi[]" value = "<%allPrincipi.get(i).getId_principi(); %>" >
	 <%= allPrincipi.get(i).getId_principi()%> <%= allPrincipi.get(i).getDescrizione() %> </td> <br>
	 
  </tr>
  <% }%>
  <tr>
	
	 
  </tr>





</table>
     	
     <input type="submit" name="action" value="Insert Experience">
     	
     </form>
     
     

     

</body>
</html>