<%@ page import="com.virtualpairprogrammers.dto.FeedbackDTO" %>
<%@ page import="java.util.*" %>
<%@ page language="java" import="java.sql.*" %>
<%@ page import="com.virtualpairprogrammers.service.FeedbackService" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<% FeedbackService feedbackService = new FeedbackService();
List<FeedbackDTO> all_feedback = feedbackService.getFeedback();%>
<meta charset="ISO-8859-1">

<title>Visualizza Feedback</title>
</head>
<body>

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
            PRINCIPI
         </th>
<th></th>
  <th></th>
         <th>
            SECONDARI
         </th>

         <th>
          </th>

     </tr>
        <%for (FeedbackDTO feedback : all_feedback) { %>
     <tr>
         <td>
             <input type="checkbox" name="feedback" value="<%= feedback.getId_feedback()%>"/>
         </td>

         <td>
             <%= feedback.getId_experience()%>
         </td>
  <th></th>
  <th></th>
         <td>
             <%=  feedback.getId_principi()%>
         </td>
  <th></th>
  <th></th>
<td>
             <%=  feedback.getSecondario()%>
         </td>
    <td>
  <th></th>
  <th></th>
             <a href="FeedbackServlet?action=showFeedback=<%=feedback.getId_feedback()%>">Seleziona Feedback</a>
         </td>

     </tr>
     <% }%>
 </table>

</body>
</html>