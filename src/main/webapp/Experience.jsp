<%@ page import="com.virtualpairprogrammers.dto.ExperienceDTO" %>
<%@ page import="com.virtualpairprogrammers.dto.ExperienceUserFeedbackDTO" %>
<%@ page import="java.util.*" %>
<%@ page language="java" import="java.sql.*" %>
 <%@ page import="com.virtualpairprogrammers.service.ExperienceService" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>

<% ExperienceService ExperienceService = new ExperienceService();
List<ExperienceUserFeedbackDTO> all_Experience = ExperienceService.getAllExperienceUserFeedbackDTO();
//List<ExperienceUserFeedbackDTO> all_Experience1 = (List<ExperienceUserFeedbackDTO>) request.getAttribute("allExperiences"); %>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
        <%for (ExperienceUserFeedbackDTO Experience : all_Experience) { %>
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
             <a href="FeedbackServlets?action=chooseFeedback&id=<%=Experience.getId_experience()%>">Seleziona Esperienza</a>
         </td>

     </tr>
     <% }%>
 </table>

</form>
</body>
</html>