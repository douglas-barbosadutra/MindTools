<%@ page import="com.virtualpairprogrammers.model.Experience" %>
<%@ page import="com.virtualpairprogrammers.dto.ExperienceDTO" %>
<%@ page import="com.virtualpairprogrammers.service.ExperienceService" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>


</head>

<body>
<%String lista = request.getAttribute("allExperiences").toString();
out.print(lista.length());

 %>

<form action="ExperienceServlet?action=allExperiences" method="post">
     

  
  <table width="300">

  <tr>
  <%for(int i =0; i< lista.length(); i++) { %>
    
     <td>No.Principio</td>
     <td>Nome</td>
     <td>Cognome</td>
     <td>Experienza</td>
     <td>Score </td>  
  </tr>
    <tr>
  	<td<%lista.valueOf(i); %>></td>
  

  </tr>
    <tr>
  	
  </tr>
  
 
</table>


</br></br>
        <% 
     }%>
<a href="insertExperience.jsp">Link</a>

 <h3><a href="insertExperience.jsp">Inserisci Experience</a></h3>

</form>
</body>
</html>