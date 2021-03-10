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
<th>Player Number</th>
<th>Player Name</th>
<th>Player Skill</th>
<th>Country</th>
<th>Player DOB</th>
<th></th>
</tr>
<%
for(Team p:li){
%>
<tr>
<td><%=p.getPlayer_id() %></td>
<td><%=p.getPlayer_Name() %></td>
<td><%=p.getSkill() %></td>
<td><%=p.getCountry() %></td>
<td><%=p.getDOB() %></td>
<td><a href="editplayer.jsp?id=<%=p.getPlayer_id()%>">Update</a></td>
</tr>
<%} %>
</table>

</body>
</html>