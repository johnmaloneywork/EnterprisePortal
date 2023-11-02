package com.hope;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CourseRegistrationServlet
 */
public class CourseRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CourseRegistrationServlet() {
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
		
		String student_course = request.getParameter("student_course");
		MySQLCon db = new MySQLCon();
			request.getSession().setAttribute("student_course", student_course);
			ServletContext ctx = getServletContext();
			String baseURL = ctx.getInitParameter("baseURL");
			System.out.println(baseURL + "base url");
			RequestDispatcher rd = request.getRequestDispatcher("StudentServlet");
			rd.forward(request, response);
	}

}
