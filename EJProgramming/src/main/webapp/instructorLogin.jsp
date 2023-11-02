<%
request.getSession().removeAttribute("username");
%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%--html code designing the instructor login page asking for a username
 and a password. The input is then passed onto the InstructorLoginServlet
 to be compared to the user information on the database.--%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Instructor Login Page</title>
</head>
<body>
	<form action="InstructorLoginServlet" method="post">
	<table>
		<tr>
			<th colspan="2">Instructor Login Page</th>
		</tr>
		<tr>
			<td>Username</td>
			<td><input type="text" name="username" /></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="password" /></td>
		</tr>
		<tr>
			<td colspan ="2"><input type="submit" value="Login" /></td>
		</tr>
	</table>
	</form>
</body>
</html>