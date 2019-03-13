<head>
<title>Menu User</title>
</head>
<body background= "btn-toolset">
<body>
     
            <center> <h2> Menu Utente </h2> </center>
    <center>
 <table> 
 <tr>
 <td>
   <a href="#" class="btn-toolset">
  <strong><form action="PrincipiServlet" method="post">
     <button type= "submit" value= "PrincipiManager" name="richiesta">English Principles</button>
     
     </form></strong></a>
   </td>
   <td>  
     <a href="#" class="btn-toolset">
  <strong><form action="PrincipiItaServlet" method="post">
     <button type= "submit" value= "PrincipiItaManager" name="richiesta">Principi in Italiano</button>
     
     </form></strong></a>

</td>
</tr>

</table> 
</center>
     <center>
       <a href="#" class="btn-toolset">
  <strong><form action="PrincipiServlet" method="post">
     <button type= "submit" value= "PrincipiManager" name="richiesta">Principio casuale</button>
     </form></strong></a>

     
       <a href="#" class="btn-toolset">
  <strong><form action="" method="post">
      <button type= "submit" value= "PrincipiManager" name="richiesta">Cerca per parola chiave</button>
     </form></strong></a>

     
      <a href="#" class="btn-toolset">
  <strong> <form action="UserServlet?action=logout" method="post">
      <button type= "submit" value= "UserServlet?action=logout" name="richiesta">Logout</button>
     </form></strong></a>
     
     </center>

</body>
</html>