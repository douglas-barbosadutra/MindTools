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
<% FeedbackService feedbackService = new FeedbackService();
int id = 1;
FeedbackPrincipiExperienceDTO all_feedback = feedbackService.getAllFeedbackPrincipiExperienceDTO(id);
List<PrincipiDTO> secondari = all_feedback.getSecondari(); %>

<meta charset="ISO-8859-1">

<title>Visualizza Feedback</title>
</head>
<body>
<a href="FeedbackServlet?action=choose" name="action" method="post">Experiences </a>
<form action="FeedabckServlet?FeedbackManager" method="post">
 <table>
 <tr>
   

   <td>
   </td>
        <th></th>
         <th></th>
         <th>
             EXPERIENCE
         </th>
 <th></th>
  <th></th>
         <th>
            PRINCIPIO 
         </th>
<th></th>
  <th></th>
         <th>
            ALTRI PRINCIPI USATI
         </th>

         <th>
          </th>

     </tr>
       
     </tr>
       
         
     <tr>
            
     <tr>
         
         <td>
            <%=all_feedback.getId_experience()
              %>
             <%=all_feedback.getNome_principioITA()
              %>
            
              <%for (PrincipiDTO d: secondari) { %>
              <%d.getId_principi(); %>
              
         </td>
          <%} %>
  <th></th>
  <th></th>
        
  <th></th>
  <th></th>
       <td>
          
   
     </tr>
    
     
     
     <tr>
       
      </tr>
      
 </table>

</body>
</html>
