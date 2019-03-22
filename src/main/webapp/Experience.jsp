<%@ page import="com.pCarpet.dto.ExperienceDTO" %>
<%@ page import="com.pCarpet.dto.ExperienceUserFeedbackDTO" %>
<%@ page import="java.util.*" %>
<%@ page language="java" import="java.sql.*" %>
 <%@ page import="com.pCarpet.services.ExperienceService" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>

<% 
List<ExperienceUserFeedbackDTO> all_Experience1 = (List<ExperienceUserFeedbackDTO>) request.getAttribute("allExperiences");

%>
<meta charset="ISO-8859-1">
<title>Experiences</title>
</head>
<body>

<form action="ExperienceServlet?ExperienceManager" method="post">
 <table>
 <tr>
   <td>
      Esperienze:
   </td>
   <td>
   </td>
 
   </tr>
     <tr>
        <th></th>
         <th>
PRINCIPIO
         </th>

         <th>
            NOME
         </th>
         <th>
COGNOME
          </th>
         <th>
COMMENTO
          </th>
 <th>
SCORE
          </th>

     </tr>
        <%for (ExperienceUserFeedbackDTO Experience : all_Experience1) { %>
     <tr>
         <td>
           
         </td>

         <td>
            <%=  Experience.getId_principi()%>
         </td>

         <td>
             <%=  Experience.getNome()%>
         </td>
<td>
             <%=  Experience.getCognome()%>
         </td>
<td>
             <%=  Experience.getCommento()%>
         </td>
<td>
             <%=  Experience.getScore()%>
         </td>
    <td>
             <a href="FeedbackServlet?action=chooseFeedback&id=<%=Experience.getId_experience()%>">Seleziona Esperienza</a>
         </td>

     </tr>
     <% }%>
     
     
 </table>
 
</form>
</body>
</html>