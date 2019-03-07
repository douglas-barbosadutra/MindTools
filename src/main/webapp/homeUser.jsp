<html>
<head>
<title>Menu User</title>
</head>
<body>
     <h1>Benvenuto <%= request.getSession().getAttribute("user")%></h1>
     <h2>------- MENU USER -------</h2>
     <h2>    <h2>

     <h3>1. Visualizza tutti i principi</h3>
     <form action="PrincipiServlet" method="post">
     <button type= "submit" value= "PrincipiManager" name="richiesta">Home Principi</button>
     </form>

     <h3>2. Visualizza principio casuale </h3>
     <form>
     <a href="Principi.jsp"></a>
     </form>

     <h3>3. Visualizza per parola chiave</h3>
     <form action="" method="post">
     <input type="submit" value="SearchProduct" name="richiesta">
     </form>

     <h3>4. Logout<h3>
     <form action="LogoutServlet" method="post">
     <input type="submit" value="Logout" name="Logout">
     </form>
     
     

</body>
</html>