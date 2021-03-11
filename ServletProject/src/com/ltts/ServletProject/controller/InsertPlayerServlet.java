package com.ltts.ServletProject.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.ltts.ServletProject.Dao.PlayerDao;
import com.ltts.ServletProject.model.Player;

@WebServlet("/InsertPlayerServlet")
public class InsertPlayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		int Player_id=Integer.parseInt(request.getParameter("Player_id"));
		String Player_Name=request.getParameter("Player_Name");
		String Skill=request.getParameter("Skill");
		String country=request.getParameter("country");
		String DOB=request.getParameter("DOB");
		Date d=Date.valueOf(DOB);
		int Age=Integer.parseInt(request.getParameter("Age"));
		int Matches=Integer.parseInt(request.getParameter("Matches"));
		int Runs=Integer.parseInt(request.getParameter("Runs"));
		int Wickets=Integer.parseInt(request.getParameter("Wickets"));
		String Batting_Style=request.getParameter("Batting_Style");
		String Bowling_Style=request.getParameter("Bowling_Style");
		
		Player p=new Player(Player_id,Player_Name,Skill,country,d,Age,Matches,Runs,Wickets,Batting_Style,Bowling_Style);		
		System.out.println("Inside Servlet: "+p);
		PlayerDao pd=new PlayerDao();	
		
		boolean b=false;
	    //RequestDispatcher rd=null;
		try {
			b=pd.insertPlayer(p); // Control TRanfers to Dao file
			//rd=request.getRequestDispatcher("success.html");
			//rd.forward(request, response);
			System.out.println("Successfully Inserted...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//out.write("Aready used the id"+e);
			//rd=request.getRequestDispatcher("addplayer.html");
			e.printStackTrace();
		}
	}

}
