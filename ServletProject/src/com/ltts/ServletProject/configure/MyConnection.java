package com.ltts.ServletProject.configure;

import java.io.FileReader;
import java.io.InputStream;
import java.sql.DriverManager;
import java.util.Properties;

import com.sun.jdi.connect.spi.Connection;

public class MyConnection {
	public static java.sql.Connection getConnection() throws Exception {
		//FileReader fr=new FileReader("src/db.properties");
		InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties");
		Properties p=new Properties();
		p.load(inputStream);
		
		String url=(String) p.getProperty("connection");
		String username=(String)p.getProperty("user");
		String password=(String)p.getProperty("password");
		System.out.println("Inside MyConnection.." +url+" "+username);
		Class.forName("com.mysql.cj.jdbc.Driver");
		java.sql.Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("Inside MyConnection..");
		return con;
		
	}
}
