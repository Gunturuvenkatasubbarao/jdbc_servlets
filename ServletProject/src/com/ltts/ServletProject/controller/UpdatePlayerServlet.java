package com.ltts.ServletProject.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.ServletProject.Dao.PlayerDao;
import com.ltts.ServletProject.model.Player;

/**
 * Servlet implementation class UpdatePlayerServlet
 */
@WebServlet("/UpdatePlayerServlet")
public class UpdatePlayerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePlayerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		 PrintWriter out = response.getWriter(); 
			int Player_id=Integer.parseInt(request.getParameter("Player_id"));
			String Player_Name=request.getParameter("Player_Name");
			String Skill=request.getParameter("Skill");
			String country=request.getParameter("country");
		    String DOB=request.getParameter("DOB");
			int Age=Integer.parseInt(request.getParameter("Age"));
			int Matches=Integer.parseInt(request.getParameter("Matches"));
			int Runs=Integer.parseInt(request.getParameter("Runs"));
			int Wickets=Integer.parseInt(request.getParameter("Wickets"));
			String Batting_Style=request.getParameter("Batting_Style");
			String Bowling_Style=request.getParameter("Bowling_Style");
		
			Date d=Date.valueOf(DOB);
			Player p = new Player(Player_id,Player_Name,Skill,country,d,Age,Matches,Runs,Wickets,Batting_Style,Bowling_Style);
			System.out.println("Inside Update Player Servlet: "+p);
			PlayerDao pd=new PlayerDao();
			boolean b=false;
			RequestDispatcher rd=null;
			try {
				b=pd.updatePlayer(Player_id,Player_Name,Skill,country,d,Age,Matches,Runs,Wickets,Batting_Style,Bowling_Style); // Control TRanfers to Dao file
				rd=request.getRequestDispatcher("success.html");
				rd.forward(request, response);
				//System.out.println("Successfully Inserted...");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				out.write("Already Player id Used: "+e);
				rd=request.getRequestDispatcher("addplayer.html");
				rd.include(request, response);
				e.printStackTrace();
			}

	}
}
