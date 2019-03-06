<html>
<head>
<title>Menu Admin</title>
</head>
<body>
     <h1>Benvenuto <%= request.getSession().getAttribute("amministratore")%></h1>
     <h2>------- MENU ADMIN -------</h2>
     <h2>    <h2>

     <h3>1. Inserisci utente</h3>
     <form action="ProdottoServlet" method="post">
     <input type="submit" value="ViewListProduct" name="richiesta">
     </form>

     <h3>2. Elimina utente </h3>
     <a href="deleteProdotto.jsp">Elimina Prodotto</a>

     <h3>3. Modifica utente</h3>
     <form action="" method="post">
     <input type="submit" value="SearchProduct" name="richiesta">
     </form>

     <h3>4. Visualizza utenti<h3>
     <form action="LogoutServlet" method="post">
     <input type="submit" value="Logout" name="Logout">
     </form>
     
     <h3>5. Logout<h3>
     <form action="LogoutServlet" method="post">
     <input type="submit" value="Logout" name="Logout">
     </form>

</body>
</html>