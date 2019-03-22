<%@ page import="com.pCarpet.dto.UserDTO" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<head>
<meta charset="UTF-8">
<link href="/stile.css" rel="stylesheet" media="screen">
</head>
<body background= "/imagen/mindtools.png">
<div style="width:55%; margin-top:17%; margin-left:35%;">
 <table>
 <tr>
 <td>
  <form action="/homeUser/ShowAllPrincipi" method="get">
   <button   type="submit" value="homeUser" class="btn-toolset">All Principles</button></form>
 </td>
 <td>  
 <form action="/homeUser/PrincipioRandom" method="get">
   <button style="margin-top:1%"  type="submit" value="homeUser" class="btn-toolset">Principio Random</button></form>
 </td>
 <tr>
 </table>
 <table>
 <tr>
 <td>
  <form action="/Experience/ShowAllExperience" method="get">
   <a href="#" class="btn-toolset"><button style="margin-top:1%"  type="submit" value="homeUser" >All Experiences</button></a></form>
</td>
<td>
   <h2>Search By Key Word</h2>
  <form action="/homeUser/PrincipiByParola" method="get">
   <input type = "text" id="testo" name="pChiave" placeholder = "inserisci "testo">
   <button style="margin-top:1%"  type="submit" value="homeUser" >Cerca</button></form>
     </form> 
</td>
</tr>
</table>
  <strong> <form action="PrincipiServlet?richiesta=logout" method="post">
      <button type= "submit" value= "PrincipiServlet?action=logout" name="richiesta">Logout</button>
     </form></strong>
   <br>
   <br>
</div>

</body>
</html>