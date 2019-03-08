<%@ page import="com.virtualpairprogrammers.model.Experience" %>
<%@ page import="com.virtualpairprogrammers.dto.ExperienceDTO" %>
<%@ page import="com.virtualpairprogrammers.service.ExperienceService" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>
<% ExperienceService experienceService = new ExperienceService();
List<ExperienceDTO> allExperience = experienceService.getAllExperience(); %>

</head>

<body>

<form action="ExperienceServlet" method="post">
     
 <% for(ExperienceDTO experiences : allExperience) { %>
  
  <table border="1" width="300">
  <tr>
    <td>nome</td>
    <td>cognome</td>
  </tr>
  <tr>
  	<td colspan=2>princio</td>
  </tr>
    <tr>
  	<td colspan=2><%= experiences.getCommento()%></td>
  </tr>
</table>
<a href="insertExperience.jsp?idexpirience=<%= experiences.getId_experience()%>">Link</a>

</br></br>

<% } %>

 <h3><a href="insertExperience.jsp">Inserisci Experience</a></h3>

</form>
</body>
</html>