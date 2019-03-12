<%@ page import="com.virtualpairprogrammers.dto.ExperienceDTO" %>
<%@ page import="java.util.*" %>
<%@ page language="java" import="java.sql.*" %>
 <%@ page import="com.virtualpairprogrammers.service.ExperienceService" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>

<% ExperienceService ExperienceService = new ExperienceService();
List<ExperienceDTO> all_Experience = ExperienceService.getAllExperiences();%>
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
ID_PRINCIPIO
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
        <%for (ExperienceDTO Experience : all_Experience) { %>
     <tr>
         <td>
             <input type="checkbox" name="Experience" value="<%= Experience.getId_experience()%>"/>
         </td>

         <td>
             <%= Experience.getId_experience()%>
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
             <a href="ExperienceServlet?action=ShowExperienceo&id=<%=Experience.getId_experience()%>">Seleziona Esperienza</a>
         </td>

     </tr>
     <% }%>
 </table>

</form>
</body>
</html>