<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import ="java.util.*,com.ltts.ServletProject.model.*,com.ltts.ServletProject.Dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Team</title>
</head>
<body>
<%
TeamDao td=new TeamDao();
List<Team> li=td.getAllTeam();
%>
<table>
<tr>
<th>Team Id</th>
<th>Team Name</th>
<th>Coach Name</th>
<th>Owner Name</th>
<th>Captain Name</th>
<th></th>
</tr>
<%
for(Team t:li){
%>
<tr>
<td><%=t.getTeam_id() %></td>
<td><%=t.getTeam_Name() %></td>
<td><%=t.getCoach_Name() %></td>
<td><%=t.getOwner_Name() %></td>
<td><%=t.getCaptain_Name() %></td>
<td><a href="editTeam.jsp?id=<%=t.getTeam_id()%>">Update</a></td>
</tr>
<%} %>
</table>

</body>
</html>
