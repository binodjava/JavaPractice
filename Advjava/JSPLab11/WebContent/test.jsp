
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:import url="header.jsp">
		<c:param name="companyName" value="Java Learning Center" />
	</c:import>

	<form action="home.jsp" method="post">
		<h2>Enter Course Name</h2>
		<input type="text" name="courseName" />
		<h2>Enter Student Name</h2>
		<input type="text" name="studentName" /> <input type="submit"
			name="Submit" />
	</form>
	<c:import url="footer.jsp">
		<c:param name="companyName" value="Java Learning Center" />
	</c:import>
</body>
</html>