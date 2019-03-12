<%@ page import="com.virtualpairprogrammers.dto.PrincipiDTO" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>


</head>

<body>
<%
List<PrincipiDTO> all_principi = (List<PrincipiDTO>) request.getAttribute("listaprincipi");
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
             <%= principi.getId_principi()%>
         </td>

         <td>
             <%=  principi.getDescrizione()%>
         </td>

     </tr>
     <% }%>
 </table>
</body>
</html>