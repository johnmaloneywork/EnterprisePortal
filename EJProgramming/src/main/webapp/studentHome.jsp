<%@page import="org.w3c.dom.NameList"%>
<%@page import="com.google.protobuf.Empty"%>

<%@ page import ="java.util.List"%>

<%@ page import ="com.hope.Course" %>
<%@ page import ="com.hope.Student" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

 <%--html code designing the student homepage. A table is created
 which displays the current courses available, this information is 
 retrieved from the StudentServlet, and in turn from the database. 
 The page also allows the user to register for a particular course. 
 When registering for a course, this information is passed to the 
 course registration servlet and then stored in the database. The
 page also displays the courses the user has already registered 
 for. --%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home</title>
</head>
<body>
	<form action="StudentServlet" method="get">
	List of Courses
	
	<table border = 1>
		<tr>
			<th>Course ID</th>
			<th>Course Name</th>
		</tr>
		<%
		List<Course> courses = (List) request.getAttribute("courses");
		
		for(Course cou : courses){
		%> <tr>
			<td><%=cou.getCourseId() %></td>
			<td><%=cou.getCourseName() %></td>
			</tr>
			<%
			}
			%>
	</table>
	</form>
	<p>
	<form action="CourseRegistrationServlet" method="post">
	<table border = 1>
	<%
		List<Course> courseNames = (List) request.getAttribute("courseNames");
		%>
		<label for = "chosenCourse"> Register for: </label>
		<select name = "course-names" id = "course-names">
			<c:forEach var="course" items="${courses}">
    				<option><c:out value="${course}"/></option>
  				</c:forEach>
			
		</select>
	</table>
	<input type="submit" value="Submit">
	</form>
	<p>
	
	List of Registered Courses
	<table border = 1>
		<tr>
			<th>Course Name</th>
		</tr>
		<%
		
		String c = (String) request.getAttribute("student_course");
		Student student = new Student();
		
		student.setCourse(c);
		
		
		%> <tr>
			<td><%=student.getCourse() %></td>
			</tr>
	</table>
</body>
</html>