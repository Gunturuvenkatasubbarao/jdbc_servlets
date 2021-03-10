package com.ltts.ServletProject.controller;

import java.io.IOException;
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
 * Servlet implementation class InsertAuctionServlet
 */
@WebServlet("/InsertAuctionServlet")
public class InsertAuctionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertAuctionServlet() {
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
		int Auction_id=Integer.parseInt(request.getParameter("Auction_id"));
		int Player_id=Integer.parseInt(request.getParameter("Player_id"));
		int Team_id=Integer.parseInt(request.getParameter("Team_id"));
		int Year=Integer.parseInt(request.getParameter("Year"));
		int Amount=Integer.parseInt(request.getParameter("Amount"));
		
		Auction a=new Auction(Auction_id,Player_id,Team_id,Year,Amount);		
		System.out.println("Inside Servlet: "+a);
		AuctionDao ad=new AuctionDao();	
		
		boolean b=false;
	    //RequestDispatcher rd=null;
		try {
			b=ad.insertAuction(a); // Control TRanfers to Dao file
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


