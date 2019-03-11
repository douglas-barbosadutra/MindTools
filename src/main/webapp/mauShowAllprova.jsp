<%@ page import="com.virtualpairprogrammers.dto.PrincipiDTO" %>
<%@ page import="java.util.*" %>
 <%@ page import="com.virtualpairprogrammers.service.PrincipiService" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>

<% PrincipiService principiService = new PrincipiService();
List<PrincipiDTO> all_principi = principiService.getAllPrincipi();%>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="PrincipiServlet?PrincipiManager" method="post">
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
        <%for (PrincipiDTO principi : all_principi) { %>
     <tr>
         <td>
             <input type="checkbox" name="principi" value="<%= principi.getId_principi()%>"/>
         </td>

         <td>
             <%= principi.getId_principi()%>
         </td>

         <td>
             <%=  principi.getDescrizione()%>
         </td>

    <td>
             <a href="PrincipiServlet?richiesta=ShowPrincipio&id=<%=principi.getId_principi()%>">Seleziona Principio</a>
         </td>

     </tr>
     <% }%>
 </table>

</form>
</body>
</html>