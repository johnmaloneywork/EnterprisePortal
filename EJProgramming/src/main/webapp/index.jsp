<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%--html code designing the homepage. Allowing the user to sign
 in to whichever user type they are assoicated with. The input is 
 then passed onto which ever jsp responds to their user type.--%>
    
<!DOCTYPE html>
<html>
<head>Homepage</head>
<body>
<div id = "container">
	<div id="stuLogin">
		<a href="studentLogin.jsp">Student Login</a>
	</div>
	<div id="adminLogin">
		<a href="adminLogin.jsp">Admin Login</a>
	</div>
	<div id="instructLogin">
		<a href="instructorLogin.jsp">Teacher Login</a>
	</div>
</div>
</body>
</html>