<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page import ="java.util.*,com.ltts.ServletProject.model.*,com.ltts.ServletProject.Dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Team</title>
</head>
<body>
<%
int id=Integer.parseInt(request.getParameter("id"));
TeamDao td=new TeamDao();
Team t1=td.getTeamById(id);
%>
<form action="./UpdateTeamServlet" method="post">
Team Id: <%=t1.getTeam_id() %> <br><br>
Team Name: <input type="text" value="<%=t1.getTeam_Name()%>" name="Team_Name"><br><br>
Coach Name: <input type="text" value="<%=t1.getCoach_Name()%>" name="Coach_Name"><br><br>
Owner Name: <input type="text" value="<%=t1.getOwner_Name()%>" name="Owner_Name"><br><br>
Captain Name:<input type="text" value="<%=t1.getCaptain_Name() %>" name="Captain_Name"><br><br>
<input type="submit" value="Update Team">

</form>
</body>
</html>