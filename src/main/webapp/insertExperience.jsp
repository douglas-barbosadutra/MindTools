<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>INSERT----MY----EXPERIENCE]</title>
</head>
<body>


<h2><center>------- INSERT EXPERIENCE -------</center></h2>
<form action="CustomersServlet?richiesta=home" method="post">
	<input type="submit" value="HOME" name="richiesta">
</form>
     <form action="ExperienceServlet?pulsante=InsertExperience" method="post">
     <h3>Quanto e stato utile questo principio per te? </h3>
     	
     	<h4>Commento:<br> <input type = "text" id = "experience" name ="commento" placeholder = "inseriscicommento"></h4>
     	
     	<h4>Aspetto positivo:<br> <input type = "text" id = "experience" name ="positivo" placeholder = "inserisciaspettopositivo"></h4><br>
     	
     	<h4>Aspetto negativo:<br> <input type = "text" id = "experience" name ="negativo" placeholder = "inserisci aspettonegativo"></h4><br>
     	<h4>Voto: <input type = "radio"  id = "experience " name = "score" value = "1"> 1 
     	 <input type = "radio"  id = "experience " name = "score" value = "2"> 2 
     	  <input type = "radio"  id = "experience " name = "score" value = "3"> 3 
     	   <input type = "radio"  id = "experience " name = "score" value = "4"> 4 
     	    <input type = "radio"  id = "experience " name = "score" value = "5"> 5
     	</h4>
     	<input type="submit" value="InsertExperience" name="richiesta">
     </form>

     

</body>
</html>