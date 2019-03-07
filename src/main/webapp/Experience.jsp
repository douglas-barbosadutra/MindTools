<%@ page import="com.virtualpairprogrammers.model.Experience" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>
<% List<Experience> allExperiences = (List<Experience>) request.getAttribute("allExperiences");%>
</head>

<body>

<form action="ExperienceServlet" method="post">

<table>
     
 <% for(Experience experiences : allExperiences) {
%>
  
 
 

  <tr>
	<td>
             <%= experiences.getId_experience()%>
	</td>
 	
	<td>
             <%= experiences.getId_user()%>
	</td>
 
	<td>
             <%= experiences.getCommento()%>
	</td>

	<td>
             <%= experiences.getPositivo()%>
	</td>
 	
	<td>
             <%= experiences.getNegativo()%>
	</td>
 	
	<td>
             <%= experiences.getScore()%>
	</td>

	<td>
             <a href="ExperienceServlet?richiesta=ModificaExperience&id=<%=  experiences.getId_experience()%>">Modifica</a>
	</td>

         <td>
             <a href="ExperienceServlet?richiesta=EliminaExperience&id=<%= experiences.getId_experience()%>">Elimina</a>
         </td>
  </tr>

<% }%>

</table>

<input type="submit" value="SellProducts" name="richiesta"> <a href="home.jsp">Home <h3><a href="insertExperience.jsp">Inserisci Experience</a></h3>

</form>
</body>
</html>