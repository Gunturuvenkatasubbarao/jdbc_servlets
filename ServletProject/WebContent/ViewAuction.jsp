<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import ="java.util.*,com.ltts.ServletProject.model.*,com.ltts.ServletProject.Dao.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Auction</title>
</head>
<body>
<%
AuctionDao ad=new AuctionDao();
List<Auction> li=ad.getAllAuction();
%>
<table>
<tr>
<th>Auction Id</th>
<th>Player Id</th>
<th>Team Id</th>
<th>Year</th>
<th>Amount</th>
<th></th>
</tr>
<%
for(Auction a:li){
%>
<tr>
<td><%=a.getAuction_id() %></td>
<td><%=a.getPlayer_id() %></td>
<td><%=a.getTeam_id() %></td>
<td><%=a.getYear() %></td>
<td><%=a.getAmount() %></td>
<td><a href="editauction.jsp?id=<%=a.getAuction_id()%>">Update</a></td>
</tr>
<%} %>
</table>

</body>
</html>
