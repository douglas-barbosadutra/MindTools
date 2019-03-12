<%@ page import="com.virtualpairprogrammers.dto.PrincipiItaDTO" %>
<%@ page import="java.util.*" %>
 <%@ page import="com.virtualpairprogrammers.service.PrincipiItaService" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>

<% PrincipiItaService principiItaService = new PrincipiItaService();
List<PrincipiItaDTO> all_principi = principiItaService.getAllPrincipiita();%>
<meta charset="ISO-8859-1">
<title>Principi in Italiano</title>
</head>
<body>

<form action="PrincipiItaServlet?PrincipiItaManager" method="post">
 <table>
 <tr>
   <td>
      Principi:
   </td>
   <td>
   </td>
 
   </tr>
     <tr>
        <th></th>
         <th>
             ID_PRINCIPI
         </th>

         <th>
            NOME
         </th>
         <th>
        
        
         <th>
          </th>
         <th>
          </th>

     </tr>
        <%for (PrincipiItaDTO principi : all_principi) { %>
     <tr>
         <td>
             <input type="checkbox" name="principi" value="<%= principi.getIdprincipioita()%>"/>
         </td>

         <td>
             <%= principi.getIdprincipioita()%>
         </td>

         <td>
             <%=  principi.getNomeprincipio()%>
         </td>

    <td>
             <a href="PrincipiItaServlet?richiesta=ShowItaPrincipio&id=<%=principi.getIdprincipioita()%>">Seleziona Principio</a>
         </td>

     </tr>
     <% }%>
 </table>

</form>
</body>
</html>