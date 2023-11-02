package com.hope;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
//Servlet to retrieve the information needed on the
//Student homepage
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public StudentServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    //doGet method retrieves the course information
    //using a CourseRepository object and SQL through it.
    //The data is returned to the studentHome jsp to be
    //Displayed to the student
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CourseRepository courseRepository = new CourseRepository();
		
		List<Course> cou = courseRepository.getCourseTables();
		
		for(Course course : cou){
			System.out.println(course.toString());
		}
		
		request.setAttribute("courses", cou);
		
		RequestDispatcher rd = request.getRequestDispatcher("studentHome.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
