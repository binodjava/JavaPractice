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
	<h1>hello guys No Gaurantee</h1>
	<%
		String str = "JAVA,JDBC,SERVLETSJSP";
		request.setAttribute("STR", str);
	%>
	<c:forTokens items="${STR}" delims="," var="c">
		<br />${c}
</c:forTokens>

	<c:forEach begin="1" end="25" step="2" var="i">
		<br />${i}
</c:forEach>
	<c:set var="CN" value="${param.courseName}" scope="session" />
	<c:choose>
		<c:when test="${CN eq 'java'}">
			<c:redirect url="java.jsp">
				<c:param name="stuName" value="${param.studentName}" />
				<c:param name="couName" value="${param.courseName}" />
			</c:redirect>
		</c:when>
		<c:when test="${CN eq 'jdbc'}">
			<c:redirect url="jdbc.jsp">
				<c:param name="stuName" value="${param.studentName}" />
				<c:param name="couName" value="${param.courseName}" />
			</c:redirect>
		</c:when>
		<c:otherwise>
			<c:redirect url="other.jsp">
				<c:param name="stuName" value="${param.studentName}" />
				<c:param name="couName" value="${param.courseName}" />
			</c:redirect>
		</c:otherwise>
	</c:choose>
</body>
</html>