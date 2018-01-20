<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp">
		<jsp:param name="cname" value="Java Learning Center" />
	</jsp:include>
	<form action="test.jsp">
		<h1>Select the Branch</h1>
		<select name="branch">
			<option value="MKR">Mathikere</option>
			<option value="BTM">BTM Layout</option>
		</select> <input type="submit" value="Submit" />
	</form>
	<jsp:include page="footer.jsp">
		<jsp:param name="cname" value="Java Learning Center" />
	</jsp:include>

</body>
</html>