<%@ page import="com.pCarpet.dto.PrincipiDTO" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>


</head>

<body>
<%
List<PrincipiDTO> all_principi = (List<PrincipiDTO>) session.getAttribute("listaprincipi");
 %>
<table>
      <tr>
         <th>
             ID_PRINCIPI
         </th>

         <th>
            NOME
         </th>
 
     </tr>
        <%for (PrincipiDTO principi : all_principi) { %>
     <tr>
 
         <td>
             <%= principi.getIdPrincipi()%>
         </td>

         <td>
             <%=  principi.getNome()%>
         </td>

     </tr>
     <% }%>
 </table>
</body>
</html>