<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.io.File"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String path = request.getRealPath("/");
		path = path + "WEB-INF/files";
		File dir = new File(path);
		String str[] = dir.list();
		if (str.length == 0) {
	%>
	<form color="red" size="5">NO FILES TO DOWNLOAD</form>
	<%
		} else {

			for (int i = 0; i < str.length; i++) {
				String fnm = str[i];
	%>
	<br /><%=fnm%>:
	<a href="download.jlc?filename=<%=fnm%>">Download</a>
	<%
		}
		}
	%>

</body>
</html>