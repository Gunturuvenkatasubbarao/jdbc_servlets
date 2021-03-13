<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page import ="java.util.*,com.ltts.ServletProject.model.*,com.ltts.ServletProject.Dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Auction</title>
</head>
<body>
<%
int id=Integer.parseInt(request.getParameter("id"));
AuctionDao ad=new AuctionDao();
Auction a1=ad.getAuctionById(id);
%>
<form action="./UpdateAuctionServlet" method="post">
Auction Id: <input type=hidden value="<%=a1.getAuction_id() %>" name="Auction_id"><br><br>
Player Id: <input type="number" value="<%=a1.getPlayer_id()%>" name="Player_id"><br><br>
Team Id: <input type="number" value="<%=a1.getTeam_id()%>" name="Team_id"><br><br>
Year: <input type="number" value="<%=a1.getYear()%>" name="Year"><br><br>
Amount:<input type="number" value="<%=a1.getAmount() %>"name="Amount">
<input type="submit" value="Update Auction">

</form>
</body>
</html>