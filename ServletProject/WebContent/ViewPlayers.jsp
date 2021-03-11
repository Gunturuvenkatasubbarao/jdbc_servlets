<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import ="java.util.*,com.ltts.ServletProject.model.*,com.ltts.ServletProject.Dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
PlayerDao pd=new PlayerDao();
List<Player> li=pd.getAllPlayers();
%>
<table>
<tr>
<th>Player Number</th>
<th>Player Name</th>
<th>Player Skill</th>
<th>Country</th>
<th>Player DOB</th>
<th>Player Age</th>
<th>Player Matches</th>
<th>Player Runs</th>
<th>Player Wickets</th>
<th>Player Batting_Style</th>
<th>Player Bowling_style</th>
</tr>
<%
for(Player p:li){
%>
<tr>
<td><%=p.getPlayer_id() %></td>
<td><%=p.getPlayer_Name() %></td>
<td><%=p.getSkill() %></td>
<td><%=p.getCountry() %></td>
<td><%=p.getDOB() %></td>
<td><%=p.getAge() %></td>
<td><%=p.getMatches() %></td>
<td><%=p.getRuns() %></td>
<td><%=p.getWickets() %></td>
<td><%=p.getBatting_Style() %></td>
<td><%=p.getBowling_Style() %></td>

<td><a href="editplayer.jsp?id=<%=p.getPlayer_id()%>">Update</a></td>
</tr>
<%} %>
</table>

</body>
</html>