<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page session="false"%>>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Java Learning Center</h1>
	<table align="right">
		<tr>
			<td><h1>
					Total Visited :<%=application.getAttribute("TV")%></h1></td>
		</tr>
		<tr>
			<td><h1>
					Total Active :<%=application.getAttribute("TA")%></h1></td>
		</tr>
	</table>
	<br />
	<br />
	<h1>You have logged out successfully</h1>
	<br />
	<br />
	<a href="index.jsp">GO TO INDEX PAGE</a>
</body>
</html>