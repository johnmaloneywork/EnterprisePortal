package com.hope;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminServlet
 */

//Servlet to retrieve the information needed on the
//Student homepage
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AdminServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    //doGet method retrieves the course information
    //using a CourseTableRepository object and SQL through it.
    //The data is returned to the adminHome jsp to be
    //Displayed to the student
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		CourseTableRepository courseRepository = new CourseTableRepository();
		
		List<CourseTable> cou = courseRepository.getCourseTables();
		
		for(CourseTable course : cou){
			System.out.println(course.toString());
		}
		
		request.setAttribute("courseList", cou);
		
		List<String> nameList = courseRepository.getInstructorNames();
		
		for(String name : nameList) {
			System.out.println(name);
		}
		
		request.setAttribute("nameList", nameList);
		
		RequestDispatcher rd = request.getRequestDispatcher("adminHome.jsp");
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
