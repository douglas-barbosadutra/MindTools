<%@ page import="com.pCarpet.dto.FeedbackPrincipiExperienceDTO" %>
<%@ page import="com.pCarpet.dto.PrincipiDTO" %>
<%@ page import="java.util.*" %>
<%@ page language="java" import="java.sql.*" %>
<%@ page import="com.pCarpet.services.FeedbackService" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<% 
FeedbackPrincipiExperienceDTO all_feedback = (FeedbackPrincipiExperienceDTO)session.getAttribute("feedback");
List<PrincipiDTO> secondari = (List<PrincipiDTO>)session.getAttribute("secondari");

 %>


<meta charset="ISO-8859-1">

<title>Visualizza Feedback</title>
</head>
<body>
 <a href="Feedback/showFeedback">Experiences</a>
 
  <form action="PrincipiServlet" method=GET>
		<button type="submit" value="Indietro" name="richiesta">Indietro</button>
	</form>


 <table>
	
				<th></th>
				<th>EXPERIENCE</th>
				
				<th>PRINCIPIO</th>
				
				
				
				
				<th>ALTRI PRINCIPI USATI</th>
				
				<tr>
		
		<td></td>

    	<td>
     	<%=all_feedback.getId_experience()
       %></td>
		<td><%=all_feedback.getId_principi()%>
		
		  <%=all_feedback.getNome_principioITA()%>
			              
              </td>
				
        <td>
            <%for (PrincipiDTO s : secondari) { %>
                <td> 
				 
				
				<%= 
              	s.getIdPrincipi()
              
              	 %> 
              	 <%= 
              	s.getNome() 
              
              	 %> </td> 
            </td>
				
              
  
    <% }%>
    
   
   
 
</body>
</html>
