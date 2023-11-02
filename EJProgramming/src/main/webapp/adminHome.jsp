<%@page import="org.w3c.dom.NameList"%>
<%@page import="com.google.protobuf.Empty"%>

<%@ page import ="java.util.List"%>

<%@ page import ="com.hope.CourseTable" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

 <%--html code designing the admin homepage. A table is created
 which displays the current courses available and the instructors
 which are associated with each course. The information which is
 inserted into these tables is retrieved from the AdminServlet,
 which in turn is retrieved from the database. The admin user
 may assign courses to different instructors in this area.--%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home</title>
</head>
<body>
	<form action="AdminServlet" method="get">
	List of Courses
	
	<table border = 1>
		<tr>
			<th>Course ID</th>
			<th>Course Name</th>
			<th>Instructor ID</th>
			<th>Instructor Name</th>
			<th>Instructor List</th>
		</tr>
		<%
		List<CourseTable> myCourses = (List) request.getAttribute("courseList");
		for(CourseTable cou : myCourses){
		%> <tr>
			<td><%=cou.getCourseId() %></td>
			<td><%=cou.getCourseName() %></td>
			<td><%=cou.getInstructorId() %></td>
			<td><%=cou.getInstructorName() %></td>
			<td><label for="instructor">Choose instructor </label>
				<select name="instructor" id="instructor">
  					<c:forEach var="name" items="${nameList}">
    				<option><c:out value="${name}"/></option>
  				</c:forEach>
				</select>
			</td>
			
			</tr>
			<%
			}
			%>
	</table>
	</form>
	<form action="CourseAssignServlet" method="post">
	<input type="button" value="Submit">
	</form>
</body>
</html>