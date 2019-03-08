    <%@ page import="com.virtualpairprogrammers.dto.PrincipiDTO" %>
    <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link href = "Stile.css" rel = "stylesheet" media = "screen">
		<%PrincipiDTO principio = (PrincipiDTO) session.getAttribute("principio"); %>
		<% int  idprincipio =principio.getId_principi(); %>
		
		<title>SelezionaPrincipio</title>
	</head>
	<body>
	<table>
	<tr>
				<th></th>
				<th>ID_PRINCIPI</th>
				<th>NOME</th>
				<th>DESCRIZIONE</th>
				<th>D_PUNTI</th>
				<th>D_NUMERI</th>
				<th>P_CHIAVE</th>
				<th></th>
				<th></th>

			</tr>
		<tr>
		
		<td></td>

				<td><%=idprincipio%></td>
				<td><%=principio.getNome()%></td>
				<td><%=principio.getDescrizione()%></td>
				<td><%=principio.getD_punti()%></td>
				<td><%=principio.getD_numeri()%></td>
				<td><%=principio.getP_chiave()%></td>
				<td></td>
				<td></td>
				
				<td>
             <a href="ExperienceServlet?action=Insert_Experience&id=<%=principio.getId_principi()%>">Inserisci Esperienza</a>
         </td>
				
				
		</tr>
	</table>
	</body>
	</html>