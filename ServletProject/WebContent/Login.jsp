<%@ page import="java.sql.*"%>
<%
    String User_Name = request.getParameter("User_Name");   
    String Password = request.getParameter("Password");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mevan","root", "root");
    PreparedStatement ps= con.prepareStatement("select * from User where User_Name=? and Password=? ");
    ps.setString(1, User_Name);
    ps.setString(2,Password);
    ResultSet rs=ps.executeQuery();
    if (rs.next()) {
        session.setAttribute("userid", User_Name);
        response.sendRedirect("index.html");
    } else {
        out.println("Invalid password <a href='Index.jsp'>try again</a>");
    }
%>