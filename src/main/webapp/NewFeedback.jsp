<%@ page import="com.virtualpairprogrammers.dto.FeedbackPrincipiExperienceDTO" %>
<%@ page import="com.virtualpairprogrammers.dto.PrincipiDTO" %>
<%@ page import="java.util.*" %>
<%@ page language="java" import="java.sql.*" %>
<%@ page import="com.virtualpairprogrammers.service.FeedbackService" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<% 


FeedbackPrincipiExperienceDTO all_feedback = (FeedbackPrincipiExperienceDTO)request.getAttribute("feedbackList");
List<PrincipiDTO> secondari = (List<PrincipiDTO>)request.getAttribute("secondari");


 %>


<meta charset="ISO-8859-1">

<title>Visualizza Feedback</title>
</head>
<body>
 <a href="ExperienceServlet?action=allExperiences">Experiences</a>
 
  <form action="PrincipiServlet" method=post>
		<button type="submit" value="Indietro" name="richiesta">Indietro</button>
	</form>

<form action="FeedbackServlet?chooseFeedback" method="post">

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
              	s.getId_principi()
              
              	 %> 
              	 <%= 
              	s.getNome() 
              
              	 %> </td> 
            </td>
				
              
  
    <% }%>
    
   
   
 
</body>
</html>
