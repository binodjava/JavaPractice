<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>JLC Bookstore</h1>
		<h2>Book Search</h2>
		<h1>Your Order has placed successfully.</h1>
		<%
			session.invalidate();
		%>
		<br />
		<a href="index.jssp">GO TO SEARCH PAGE</a>


	</center>

</body>
</html>