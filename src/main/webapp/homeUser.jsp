<%@ page import="com.virtualpairprogrammers.dto.UserDTO" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>


<head>
<title>Menu User</title>
</head>
<body background= "btn-toolset">
     
<center> <h2> Menu</h2> </center>


<center>
 <table> 
 <tr>
 <td>
   <a href="#" class="btn-toolset">
  <strong><form action="PrincipiServlet" method="post">
     <button type= "submit" value= "PrincipiManager" name="richiesta">All Principles/ Tutti i Principi</button>
     
     </form></strong></a>
   </td>
</tr>

</table> 
</center>
     <center>
       <a href="#" class="btn-toolset">
  <strong><form action="PrincipiServlet" method="post">
     <button type= "submit" value= "PrincipiManager" name="richiesta">Random Principles/ Principi casuali</button>
     </form></strong></a>

     
       <a href="#" class="btn-toolset">
  <strong><form action="" method="post">
      <button type= "submit" value= "PrincipiManager" name="richiesta">Search by key word/ Cerca per parola chiave</button>
     </form></strong></a>

     
      <a href="#" class="btn-toolset">
  <strong> <form action="UserServlet?action=logout" method="post">
      <button type= "submit" value= "UserServlet?action=logout" name="richiesta">Logout</button>
     </form></strong></a>
     
     </center>
    

</table>
</body>
</html>