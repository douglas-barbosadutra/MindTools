<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
    <%@ page import="com.pCarpet.dto.PrincipiDTO" %>
  
    <%@ page import="java.util.*" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<% List<PrincipiDTO> allPrincipi = (List<PrincipiDTO>) request.getAttribute("allPrincipi");
int idprincipio =Integer.parseInt(request.getParameter("id"));

%>
<title>INSERT----MY----EXPERIENCE]</title>
</head>
<body>


<h2><center>------- Insert Experience -------</center></h2>


 <a href="PrincipiServlet?richiesta=return" name="richiesta" method="post">Home </a>
     <form action="Experience/insertExperience" method="post">
     <h3>How much was this principle useful for you? </h3>
     	
     	<h4>Comment: <br> <textarea  id = "experience" name ="commento" placeholder = "InsertComment" rows="10" cols="50" ></textarea></h4>
     	
     	<h4>Positive Aspect:<br> <textarea id = "experience" name ="positivo" placeholder = "InsertPositiveComment" rows="5" cols="50"> </textarea></h4><br>
     	
     	<h4>Negative Aspect:<br> <textarea  id = "experience" name ="negativo" placeholder = "InsertNegativeComment" rows="5" cols="50"> </textarea></h4><br>
     	<h4>Score: <input type = "radio"  id = "experience " name = "score" value = "1"> 1 
     	 <input type = "radio"  id = "experience " name = "score" value = "2"> 2 
     	  <input type = "radio"  id = "experience " name = "score" value = "3"> 3 
     	   <input type = "radio"  id = "experience " name = "score" value = "4"> 4 
     	    <input type = "radio"  id = "experience " name = "score" value = "5"> 5
     	</h4>
     	
 <table >
 <h4> Other principles consulted </h4>
  <tr>
	  <td>
	 <% for(int i = 0 ; i< 8 ; i++ ) { %>
	  <input type = "checkbox"  name = "idsprincipi[]" value = "<%= allPrincipi.get(i).getIdPrincipi()%>" >
	 <%= allPrincipi.get(i).getIdPrincipi()%> <%= allPrincipi.get(i).getNome() %> <br> 
	 <% }%> 
	  </td>
	  <td>
	 <% for(int i = 8 ; i< 16 ; i++ ) { %>
	  <input type = "checkbox"  name = "idsprincipi[]" value = "<%= allPrincipi.get(i).getIdPrincipi()%>" >
	 <%= allPrincipi.get(i).getIdPrincipi()%> <%= allPrincipi.get(i).getNome() %> <br> 
	 <% }%> 
	  </td>
	   <td>
	 <% for(int i = 16 ; i< 24 ; i++ ) { %>
	  <input type = "checkbox"  name = "idsprincipi[]" value = "<%= allPrincipi.get(i).getIdPrincipi()%>" >
	 <%= allPrincipi.get(i).getIdPrincipi()%> <%= allPrincipi.get(i).getNome() %> <br> 
	 <% }%> 
	  </td>
	   <td>
	 <% for(int i = 24 ; i< 32 ; i++ ) { %>
	  <input type = "checkbox"  name = "idsprincipi[]" value = "<%= allPrincipi.get(i).getIdPrincipi()%>" >
	 <%= allPrincipi.get(i).getIdPrincipi()%> <%= allPrincipi.get(i).getNome() %> <br> 
	 <% }%> 
	  </td>
     <td>
	 <% for(int i = 32 ; i< 40 ; i++ ) { %>
	  <input type = "checkbox"  name = "idsprincipi[]" value = "<%= allPrincipi.get(i).getIdPrincipi()%>" >
	 <%= allPrincipi.get(i).getIdPrincipi()%> <%= allPrincipi.get(i).getNome() %> <br> 
	 <% }%>
	 </td> 
	 
  </tr>
  


</table>

  
     	
     <input type="submit" name="action" value="Insert Experience">
     
       <a href="ExperienceServlet?action=allExperiences"></a>
     	
     </form>








	
     

</body>
</html>