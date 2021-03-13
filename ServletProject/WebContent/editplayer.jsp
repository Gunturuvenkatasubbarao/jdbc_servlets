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
int id=Integer.parseInt(request.getParameter("id"));
PlayerDao pd=new PlayerDao();
Player p1=pd.getPlayerById(id);
%>
<form action="./UpdatePlayerServlet" method="post">
Player Id: <input type="hidden" value="<%=p1.getPlayer_id()%>" name="Player_id" > <br><br>
Player Name: <input type="text" value="<%=p1.getPlayer_Name()%>" name="Player_Name"><br><br>
Skill: <input type="text" value="<%=p1.getSkill()%>" name="Skill"><br><br>
Player Country: <input type="text" value="<%=p1.getCountry()%>" name="country"><br><br>
Player DOB:<input type="Date" value="<%=p1.getDOB()%>" name="DOB"><br><br>
Player Age:<input type="number" value="<%=p1.getAge()%>" name="Age"><br><br>
Player Matches:<input type="number" value="<%=p1.getMatches() %>"name="Matches"><br><br>
Player Runs:<input type="number" value="<%=p1.getRuns() %>"name="Runs"><br><br>
Player Wickets:<input type="number" value="<%=p1.getWickets() %>"name="Wickets"><br><br>
Player Batting_Style:<input type="text" value="<%=p1.getBatting_Style() %>"name="Batting_Style"><br><br>
Player Bowling_Style:<input type="text" value="<%=p1.getBowling_Style() %>"name="Bowling_Style"><br><br>
<input type="submit" value="Update Player">

</form>
</body>
</html>