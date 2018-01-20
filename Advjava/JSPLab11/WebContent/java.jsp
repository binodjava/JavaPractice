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
		<c:param name="companyName" value="Java Learning Cente" />
	</c:import>

	<h1>
		This is java.jsp<br /> Hello ! ${param.stuName},<br> You have
		selected ${param.couName}
	</h1>
	<c:import url="footer.jsp">
		<c:param name="companyName" value="Java Learning Center" />
	</c:import>
</body>
</html>