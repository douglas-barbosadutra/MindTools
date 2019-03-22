<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href="stile.css" rel="stylesheet" media="screen">
		<title>Login</title>
	</head>
<body background ="imagen/brainviolet.png">
<div style="width:55%; margin-top:17%; margin-left:35%;">
  <form action="/Login/authentication" method="post">
        <label>Username</label>
		<input type="text"  name="username">
		<br>
		<br>
	    <label>Password</label>
		<input type="password"  name="password">
	    <br>
		<button style="margin-top:2%"  type="submit" value="Login">Login</button>
	</form>
	 <form action="/Login/registrazione" method="post">
	  <button style="margin-top:1%"  type="submit" value="Registrazione">Registrazione</button>
		</form>
 </div>
	</body>
</html>
