<%@ page import="java.sql.*"%>
<%
    String User_Name = request.getParameter("User_name");    
    String Password = request.getParameter("Password");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mevan","root", "root");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from User where User_Name.equals(User_Name) and Password.equal(Password)");
    if (rs.next()) {
        session.setAttribute("Userid", User_Name);
        response.sendRedirect("success.jsp");
    } else {
        out.println("Invalid password <a href='index.jsp'>try again</a>");
    }
%>