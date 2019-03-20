<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		
		<title>Registrazione</title>
	</head>
	
	<body >
		
		<div style="width:25%; margin-top:15%; margin-left:35%;">
		
			<center><h1 >MINDTOOLS</h1></center>
			
			<form action="/Registrazione/reg" method="post">
		
				
					<label ">Username</label>
					<input type="text"  name="username">
					<br>
					<label >Password</label>
					<input type="password"  name="password">
					<br>
					<label >Nome</label>
					<input type="text"  name="nome">
					<br>
					<label >Cognome</label>
					<input type="text"  name="cognome">
					<br>
					<label >Email</label>
					<input type="text"  name="email">
					<br>
					<label >Lingua</label>
					<input type="text"  name="lingua">
					<br>
					
					<button style="margin-top:2%"  type="submit" value="Registrati">Registrati</button>
				
				
			</form>
			
			
			</div>
		
	</body>
</html>
