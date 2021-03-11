package com.ltts.ServletProject.controller;

import java.io.IOException;
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
		String Name=request.getParameter("Name");
		int Age=Integer.parseInt(request.getParameter("Age"));
		Player p=new Player();
		System.out.println("Inside Servlet: "+p);
		PlayerDao pd=new PlayerDao();
		boolean b=false;
		try {
			b=pd.UpdatePlayer(Name,Age); // Control TRanfers to Dao file
			System.out.println("Successfully Updated...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
