<%
String str = (String) session.getAttribute("username");
if(str == null){
	String redirectURL = application.getInitParameter("baseURL") + "instructorLogin.jsp";
	response.sendRedirect(redirectURL);
}
%>

 <%--html code designing the instructor homepage. Didn't
 get to this part as got stuck elsewhere. --%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Instructor Home</title>
</head>
<body>
	<p>Welcome to Instructor Homepage</p>
</body>
</html>