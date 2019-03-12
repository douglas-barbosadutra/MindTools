    <%@ page import="com.virtualpairprogrammers.dto.PrincipiItaDTO" %>
    <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <!DOCTYPE html>
<html>
	<head>
	
		<meta charset="UTF-8">
		<link href = "Stile.css" rel = "stylesheet" media = "screen">
		<%PrincipiItaDTO principio = (PrincipiItaDTO) session.getAttribute("principioita"); %>
		<% int  idprincipio =principio.getIdprincipioita(); %>
		
		<title>SelezionaPrincipio</title>
	</head>
	<body>
	<form action="ExperienceServlet?action=Insert_Experience" method="post">
	<table>
	<tr>
				<th></th>
				<th>No.</th>
				<th>NOME</th>
				<th>DOMANDA</th>
				<th>PERCORSO</th>
				<th>PAROLA CHIAVE</th>
				<th></th>
				<th></th>

			</tr>
		<tr>
		
		<td></td>

				<td><%=principio.getIdprincipioita()%></td>
				<td><%=principio.getNomeprincipio()%></td>
				<td><%=principio.getDomanda()%></td>
				<td><%=principio.getPercorso()%></td>
				<td><%=principio.getParolachiave()%></td>
				<td></td>
				<td></td>
				
				<td>
             <a href="PrincipiItaServlet?richiesta=InserisciExperience&id=<%=principio.getIdprincipioita()%>">Inserisci Esperienza</a>
              <a href="ExperienceServlet?action=Insert_Experience&id=<%=principio.getIdprincipioita()%>"></a>
         </td>
				
				
		</tr>
	</table>
	</form>
	</body>
	</html>