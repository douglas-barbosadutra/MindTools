<%@ page import="com.pCarpet.dto.UserDTO" %>
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
  <strong><form class="form-signin" action="/homeUser/ShowAllPrincipi" method="post">
    <a href="/homeUser/ShowAllPrincipi"> All Principles</a></form>
     
     </form></strong></a>
   </td>
</tr>

</table> 
</center>
     <center>
       <a href="#" class="btn-toolset">
  <strong><form action="PrincipiServlet" method="post">
     <button type= "submit" value= "PrincipiRandom" name="richiesta">Random Principles</button>
     </form></strong></a>

     
       <a href="#" class="btn-toolset">
  <strong><form action="PrincipiServlet" method="post">
      <button type= "submit" value= "cercaprincipi" name="richiesta">Search by key word</button>
     </form></strong></a>
     
  <a href="#" class="btn-toolset">
 <strong><form class="form-signin" action="/homeUser/Experience" method="post">
    <a href="/homeUser/Experience"> All Experience</a></form>
     
      <a href="#" class="btn-toolset">
  <strong> <form action="PrincipiServlet?richiesta=logout" method="post">
      <button type= "submit" value= "PrincipiServlet?action=logout" name="richiesta">Logout</button>
     </form></strong></a>
     
     </center>
    
     
</table>
</body>
</html>