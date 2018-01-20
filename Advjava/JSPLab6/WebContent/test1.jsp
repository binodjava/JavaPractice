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
	<h1>
		<%
			Student st = new Student();
			st.setSid(99);
			st.setName("Binod");
			st.setPhone(6579999);
			session.setAttribute("STUD", st);
		%>
		</hr>
		<%
			
			Student std=(Student)session.getAttribute("STUD");
		%>
		Sid:<%=std.getSid()%><br /> 
		Name:<%=std.getName()%><br /> 
		Name:<%=std.getPhone()%><br />
		
</body>
</html>