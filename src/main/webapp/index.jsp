<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		
		<title>Login</title>
	</head>
	
	<body >
		
		<div style="width:25%; margin-top:15%; margin-left:35%;">
		
			<center><h1 >MINDTOOLS</h1></center>
			
			<form action="/Login/authentication" method="post">
		
				
					<label ">Username</label>
					<input type="text"  name="username">
					<br>
					<label >Password</label>
					<input type="password"  name="password">
					<br>
					<button style="margin-top:2%"  type="submit" value="Login">Login</button>
				
			</form>
			
			<form action="/Login/registrazione" method="post">
				<button style="margin-top:2%"  type="submit" value="Registrazione">Registrazione</button>
			</form>
		</div>
	</body>
</html>
