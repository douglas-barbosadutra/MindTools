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
System.out.print("feaaaaaa");
List<ExperienceUserFeedbackDTO> all_Experience1 = (List<ExperienceUserFeedbackDTO>) session.getAttribute("euf");

%>
<meta charset="ISO-8859-1">
<title>Experiences</title>
</head>
<body>


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
        <%for (ExperienceUserFeedbackDTO experience : all_Experience1) { %>
     <tr>
         <td>
           
         </td>
            <%=  experience.getPrincipi().getIdPrincipi()%>
         <td>
           
         </td>

         <td>
             <%=  experience.getNome()%>
         </td>
<td>
             <%=  experience.getCognome()%>
         </td>
<td>
             <%=  experience.getCommento()%>
         </td>
<td>
             <%=  experience.getScore()%>
         </td>
    <td>
             <a href="/Feedback/showFeedback?id=<%=experience.getExperience().getIdExperience()%>">Seleziona Esperienza</a>
         </td>

     </tr>
     <% }%>
     
     
 </table>
 

</body>
</html>