<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link href = "/css/Stile.css" rel = "stylesheet" media = "screen">
		<title></title>
	</head>
	
	<body>
		<div class="content">
			
			<h1 class="title">Insert problema</h1>
		
				<form action="/Grafo/InsertProblema" method="GET">
				
					<input type="hidden" name="id_nodo" value="${id_nodo}">
			
					
						<label >Nome</label>
						<input type="text" id = "problema"  name="nome" value = "">	
						<textarea  id = "problema" name ="descrizione" placeholder ="Insert " rows="5" cols="50"></textarea>
					    <input type="submit" name="/Grafo/InsertProblema" value="Insert Problema">	
					
					 <a href="/Grafo/InsertProblema"></a>
				
				</form>
				
			</div>
			
		</div>
		
	</body>
</html>