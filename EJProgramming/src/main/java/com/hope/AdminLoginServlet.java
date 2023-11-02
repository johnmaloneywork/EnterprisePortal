package com.hope;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.hope.MySQLCon;

/**
 * Servlet implementation class AdminLoginServlet
 */
//Servlet class for admin login
public class AdminLoginServlet extends HttpServlet{
	
	private static final long serialVersionUID = 14325235L;
	
	public AdminLoginServlet() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	//Method which retrieves username and password from the jsp
	//Connection to the database is created and the information
	//is passed to the databased and checked to the corresponding
	//information. If correct the user is brought to the home
	//page for admin. If not an error is shown
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		MySQLCon db = new MySQLCon();
		int flag = db.adminLogin(username, password);
		if(flag >= 1) {
			request.getSession().setAttribute("username", username);
			ServletContext ctx = getServletContext();
			String baseURL = ctx.getInitParameter("baseURL");
			System.out.println(baseURL + "base url");
			RequestDispatcher rd = request.getRequestDispatcher("AdminServlet");
			rd.forward(request, response);
		}
		else {
			response.getWriter().append("error in login");
		}
	}

}
