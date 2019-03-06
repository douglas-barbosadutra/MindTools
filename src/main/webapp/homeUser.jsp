<html>
<head>
<title>Menu User</title>
</head>
<body>
     <h1>Benvenuto <%= request.getSession().getAttribute("utente")%></h1>
     <h2>------- MENU USER -------</h2>
     <h2>    <h2>

     <h3>1. Visualizza i principi  </h3>
     <form action="ProdottoServlet" method="post">
     <input type="submit" value="ViewListProduct" name="richiesta">
     </form>

     <h3>2. Visualizza principi casuali</h3>
     <a href="deleteProdotto.jsp">Elimina Prodotto</a>

     <h3>3. Visualizza principi per parola chiave </h3>
     <form action="" method="post">
     <input type="submit" value="SearchProduct" name="richiesta">
     </form>

     <h3>4.logout<h3>
     <form action="LogoutServlet" method="post">
     <input type="submit" value="Logout" name="Logout">
     </form>

</body>
</html>