package com.ltts.ServletProject.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.ServletProject.Dao.TeamDao;
import com.ltts.ServletProject.model.Team;

/**
 * Servlet implementation class InsertTeamServlet
 */
@WebServlet("/InsertTeamServlet")
public class InsertTeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertTeamServlet() {
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
		int Team_id=Integer.parseInt(request.getParameter("Team_id"));
		String Team_Name=request.getParameter("Team_Name");
		String Coach_Name=request.getParameter("Coach_Name");
		String Owner_Name=request.getParameter("Owner_Name");
		String Captain_Name=request.getParameter("Captain_Name");
		
		Team t=new Team(Team_id,Team_Name,Coach_Name,Owner_Name,Captain_Name);		
		System.out.println("Inside Servlet: "+t);
		TeamDao td=new TeamDao();	
		
		boolean b=false;
	    //RequestDispatcher rd=null;
		try {
			b=td.insertTeam(t); // Control TRanfers to Dao file
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

