<%
    if ((session.getAttribute("User_Name") == null) || (session.getAttribute("User_Name") == "")) {
%>
You are not logged in<br/>
<a href="Index.jsp">Please Login</a>
<%} else {
%>
Welcome <%=session.getAttribute("userid")%>
<a href='Logout.jsp'>Log out</a>
<%
    }
%>