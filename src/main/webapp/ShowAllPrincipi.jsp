<%@ page import="com.virtualpairprogrammers.dto.PrincipiDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
 <head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<% String mode = session.getAttribute(showallprincipi("ShowAllPrincipi").toString()); %>
/* <% include file="index.jsp" %> */
<h1 class="title">Lista dei principi del task n. ${idTaskScelto}</h1>
<div style="padding-left:10%"; padding-right:10%">
<table class="table table-striped">
<thead>
<tr>
 <th>id_principi</th>
 <th>nome</th>
 <th>descrizione</th>
 <th>d_punti</th>
  <th>d_numeri</th>
  <th>p_chiavi</th>
  <%if(mode.equals("delete")){
	  %><th>Opzioni</th><% 
	  } %>
	  </tr>
	  </thead>
	  <tbody>
	  <%
	  List<PrincipiDTO> instructions = (List<PrincipiDTO>)session.getAttribute("listaprincipi");
	  for(int i=0; i < instructions.size(); i++)
	  {
	   %>
	   <tr>
	   <th><%out.println(instructions.get(i).getid_principi()); %></th>
	   <th><%out.println(instructions.get(i).getnome()); %></th>
	   <th><%out.println(instructions.get(i).getdescrizione()); %></th>
	   <th><%out.println(instructions.get(i).getid_punti()); %></th>
	  <th><%out.println(instructions.get(i).getd_numeri()); %></th>
	  <th><%out.println(instructions.get(i).getp_chiavi()); %></th>
	 <%if(mode.equals("delete")){ 
	    %><th><a style="text-decoration:none; text-align:center;" class="btn btn-primary" href="/Instruction/deleteInstruction?id=<%=instructions.get(i).getid_principi()%>"></a>%>">Elimina</a></th><%
	 } %>
	 </tr><%
	  }
	 %>
	  
	  </tbody>
	</table>
</div>
</body>
</html>	  
	  
	  
 



