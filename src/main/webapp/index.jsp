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
		
			<h1 >MINDTOOLS</h1>
			
			<form action="/Login/authentication" method="post">
		
				<div >
					<label ">Username</label>
					<input type="text"  name="username">
					
					<label >Password</label>
					<input type="password"  name="password">
				</div>
				
				<div >
					<button style="margin-top:2%" class="btn btn-primary" type="submit" value="Login">Login</button>
				</div>
			
			</form>
			
		</div>		
		
	</body>
</html>
