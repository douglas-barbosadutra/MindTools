<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrazione</title>
</head>
<body>
<h3>Completa i campi per la registrazione</h3>
<form action="RegistrazioneServlet" method="post">
     	
     	<h4>Username: <input type = "text" id = "user" name ="username" placeholder = "inserisci username"></h4>
     	
     	<h4>Password: <input type = "password" id = "user" name ="password" placeholder = "inserisci la password"></h4>
     	
     	<h4>Nome: <input type = "text" id = "user" name ="nome" placeholder = "inserisci nome"></h4>
     	
     	<h4>Cognome: <input type = "text" id = "user" name ="cognome" placeholder = "inserisci cognome"></h4>
     	
     	<h4>E-mail: <input type = "text" id = "user" name ="mail" placeholder = "inserisci e-mail"></h4>
     	
     	<h4>Lingua: <input type = "text" id = "user" name ="lingua" placeholder = "inserisci lingua"></h4>
     	
     	<input type="submit" value="registrati" name="richiesta">
</form>

</body>
</html>