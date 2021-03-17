package com.ltts.ServletProject.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.ServletProject.Dao.AuctionDao;
import com.ltts.ServletProject.Dao.TeamDao;
import com.ltts.ServletProject.model.Auction;
import com.ltts.ServletProject.model.Team;

/**
 * Servlet implementation class UpdateTeamServlet
 */
@WebServlet("/UpdateTeamServlet")
public class UpdateTeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateTeamServlet() {
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
		int Team_id=Integer.parseInt(request.getParameter("Team_id"));
		String Team_Name=request.getParameter("Team_Name");
		String Coach_Name=request.getParameter("Coach_Name");
		String Owner_Name=request.getParameter("Owner_Name");
		String Captain_Name=request.getParameter("Captain_Name");
		Team t = new Team(Team_id,Team_Name,Coach_Name,Owner_Name,Captain_Name);
		System.out.println("Inside Update Team Servlet: "+t);
		TeamDao ad=new TeamDao();
		boolean b=false;
		RequestDispatcher rd=null;
		try {
			b=ad.updateTeam(Team_id,Team_Name,Coach_Name,Owner_Name,Captain_Name); // Control TRanfers to Dao file
			rd=request.getRequestDispatcher("Success.html");
			rd.forward(request, response);
			//System.out.println("Successfully Inserted...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			out.write("Already Team id Used: "+e);
			rd=request.getRequestDispatcher("addTeam.html");
			rd.include(request, response);
			e.printStackTrace();
		}
	}

}
