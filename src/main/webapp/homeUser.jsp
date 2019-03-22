<%@ page import="com.pCarpet.dto.UserDTO" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<head>
<style>
   @import "/css/MyButton.css";
  </style>
</head>
<body background= "/imagen/mindtools.png">
<div style="width:55%; margin-top:17%; margin-left:35%;">
 
 <br>
 <br>
  <form action="/homeUser/ShowAllPrincipi" method="get">
   <a href="#" class="myButton"><button style="margin-top:1%"  type="submit" value="homeUser" >All Principles</button></a></form>
 <br>
 <br>  
 <form action="/homeUser/PrincipioRandom" method="get">
   <a href="#" class="myButton"><button style="margin-top:1%"  type="submit" value="homeUser" >Principio Random</button></a></form>
 <br>
 <br>
 <h2>Search By Key Word</h2>
  <form action="/homeUser/PrincipiByParola" method="get">
   <input type = "text" id="testo" name="pChiave" placeholder = "inserisci "testo">
   <button style="margin-top:1%"  type="submit" value="homeUser" >Cerca</button></form>
     </form>

     <br>
     <br>
 <form class="form-signin" action="/Experience/ShowAllExperience" method="GET">
    <a href="/Experience/ShowAllExperience"> All Experience</a></form>
      <br>
      <br>
  <strong> <form action="PrincipiServlet?richiesta=logout" method="post">
      <button type= "submit" value= "PrincipiServlet?action=logout" name="richiesta">Logout</button>
     </form></strong>
   <br>
   <br>
</div>

</body>
</html>