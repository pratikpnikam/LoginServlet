<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>

<%
if(session.getAttribute("username")==null){
	response.sendRedirect("index.jsp");
}

%>
Welcome ${username }<br>
<a href="Videos.jsp">Videos</a><br>

<form action="Logout1" method="get">

<input type="submit" value="Logout">
</form>


</body>
</html>