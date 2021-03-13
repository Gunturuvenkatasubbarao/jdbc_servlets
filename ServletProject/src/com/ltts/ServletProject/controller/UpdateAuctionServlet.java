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

import com.ltts.ServletProject.model.Auction;

/**
 * Servlet implementation class UpdatePlayerServlet
 */
@WebServlet("/UpdateAuctionServlet")
public class UpdateAuctionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateAuctionServlet() {
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
			int Auction_id=Integer.parseInt(request.getParameter("Auction_id"));
			int Player_id=Integer.parseInt(request.getParameter("Player_id"));
			int Team_id=Integer.parseInt(request.getParameter("Team_id"));
			int Year=Integer.parseInt(request.getParameter("Year"));
			int Amount=Integer.parseInt(request.getParameter("Amount"));
			Auction a = new Auction(Auction_id,Player_id,Team_id,Year,Amount);
			System.out.println("Inside Update Auction Servlet: "+a);
			AuctionDao ad=new AuctionDao();
			boolean b=false;
			RequestDispatcher rd=null;
			try {
				b=ad.updateAuction(Auction_id,Player_id,Team_id,Year,Amount); // Control TRanfers to Dao file
				rd=request.getRequestDispatcher("Success.html");
				rd.forward(request, response);
				//System.out.println("Successfully Inserted...");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				out.write("Already Auction id Used: "+e);
				rd=request.getRequestDispatcher("addAuction.html");
				rd.include(request, response);
				e.printStackTrace();
			}

	}
}
