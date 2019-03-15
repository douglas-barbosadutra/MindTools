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

int id_experience= 1;
FeedbackService feedbackservice = new FeedbackService();
FeedbackPrincipiExperienceDTO all_feedback = feedbackservice.getAllFeedbackPrincipiExperienceDTO(id_experience);
FeedbackPrincipiExperienceDTO all_feedback1 = (FeedbackPrincipiExperienceDTO)request.getAttribute("feedbackList");
FeedbackPrincipiExperienceDTO principio =new FeedbackPrincipiExperienceDTO();

List<PrincipiDTO> secondari = feedbackservice.listaPrincipiSecondari(id_experience);

 %>


<meta charset="ISO-8859-1">

<title>Visualizza Feedback</title>
</head>
<body>
<a href="FeedbackServlet?action=choose" name="action" method="post">Experiences </a>
<form action="FeedabckServlets?chooseFeedback" method="post">

 <table>
	
				<th></th>
				<th>EXPERIENCE</th>
				<th>PRINCIPIO</th>
				<th>ALTRI PRINCIPI USATI</th>
				
				<tr>
		
		<td></td>

   	<td><%=all_feedback.getId_experience()
              %></td>
				
				<td><%=all_feedback.getNome_principioITA()
              %></td>
        <td>
           
				
				 
				<td>
				<%= //principio.getSecondari();
              	secondari.get(0).getId_principi()
              
              	 %>
              	 </td>
				
              
   <td>
   
   </td>

    
    
    
    </table>
    
  <th></th>
  <th></th>
        
  <th></th>
  <th></th>
      
     </tr>
    
    
          <%//} %>
     
     <tr>
       
      </tr>
  </table>    
 
</body>
</html>
