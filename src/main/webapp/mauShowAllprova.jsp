<%@ page import="com.virtualpairprogrammers.dto.PrincipiDTO" %>
<%@ page import="com.virtualpairprogrammers.dto.UserDTO" %>
<%@ page import="java.util.*" %>
 <%@ page import="com.virtualpairprogrammers.service.PrincipiService" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>

<% PrincipiService principiService = new PrincipiService();
List<PrincipiDTO> all_principi = principiService.getAllPrincipi();%>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="PrincipiServlet?PrincipiManager" method="post">
<%
    UserDTO user= (UserDTO) session.getAttribute("utente") ;
	if (user.getLingua().equals("inglese")) {
		
		%>
 <table>
 <tr>
 
   <td>
      Principles:
   </td>
   <td>
   </td>
 
   </tr>
     <tr>
        <th></th>
         <th>
             NUMBER
         </th>

         <th>
            NAME
         </th>
         <th>
        
        
         <th>
          </th>
         <th>
          </th>

     </tr>
        <%for (PrincipiDTO principi : all_principi) { %>
     <tr>
         <td>
             <input type="checkbox" name="principi" value="<%= principi.getId_principi()%>"/>
         </td>

         <td>
             <%= principi.getId_principi()%>
         </td>

         <td>
             <%=  principi.getNome()%>
         </td>
         
         <td>
             <a href="PrincipiServlet?richiesta=ShowPrincipio&id=<%=principi.getId_principi()%>">Selection</a>
         </td>
      
	 
	 <%}
        
	}else { 
	 
	 
	 %>
	 <table>
 <tr>
 
   <td>
      Principi:
   </td>
   <td>
   </td>
 
   </tr>
     <tr>
        <th></th>
         <th>
             NUMERO
         </th>

         <th>
            NOME
         </th>
         <th>
        
        
         <th>
          </th>
         <th>
          </th>

     </tr>
        <%for (PrincipiDTO principi : all_principi) { %>
     <tr>
         <td>
             <input type="checkbox" name="principi" value="<%= principi.getId_principi()%>"/>
         </td>

         <td>
             <%= principi.getId_principi()%>
         </td>

         <td>
             <%=  principi.getNomeita()%>
         </td>
         
         <td>
             <a href="PrincipiServlet?richiesta=ShowPrincipio&id=<%=principi.getId_principi()%>">Seleziona</a>
         </td>
           </tr>
 
 

 </form>     
	 
	 <%}
	} %>
	  
    

</table>



</body>

</html>