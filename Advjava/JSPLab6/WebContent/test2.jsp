<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.jlcindia.Student"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<hr />
	USING userBean and other tags
	<jsp:useBean id="ST" class="com.jlcindia.Student" scope="session"></jsp:useBean>
	<jsp:setProperty property="sid" name="ST" value="88" />
	<jsp:setProperty property="name" name="ST" value="Nivas" />
	<jsp:setProperty property="phone" name="ST" value="9066800603" />

	<br /> Sid:<jsp:getProperty property="sid" name="ST" /><br /> Name:<jsp:getProperty
		property="name" name="ST" /><br /> Phone:<jsp:getProperty
		property="phone" name="ST" />
	</h1>

</body>
</html>