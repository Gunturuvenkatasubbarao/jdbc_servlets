<%@ page import="java.sql.*"%>
<%

String User_Name = request.getParameter("User_Name");    
String Password = request.getParameter("Password");
String First_Name = request.getParameter("First_Name");
String Last_Name = request.getParameter("Last_Name");
String Email = request.getParameter("Email");
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mevan", "root", "root");
Statement st = con.createStatement();
int i = st.executeUpdate("insert into USER(First_Name, Last_Name, Email, User_Name, Password, Reg_Date) values ('" + First_Name + "','" 
		
+ Last_Name + "','" + Email + "','" + User_Name + "','" + Password + "', CURDATE())");
if (i > 0) {
        response.sendRedirect("Welcome.jsp");
       
    } else {
        response.sendRedirect("Index.jsp");
    }
%>