<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Java Learning Center</h1>
	<table>
		<tr>
			<td>Student Name</td>
			<td>${param.sname}</td>
		</tr>
		<tr>
			<td>Primary Email</td>
			<td>${param.sname}</td>
		</tr>
		<tr>
			<td>Primary Email</td>
			<td>${paramValues.email[0]}</td>
		</tr>
		<tr>
			<td>Secondary Email</td>
			<td>${paramValues.email[1]}</td>
		</tr>
		<tr>
			<td>Host</td>
			<td>${header.host}</td>
		<tr>
			<td>Refer</td>
			<td>${header.refer}</td>
		<tr>
			<td>JSessionID Cookie</td>
			<td>${cookie.JSESSIONID.value}</td>
		<tr>
			<td>Email Cookie</td>
			<td>${cookie.email.value}</td>
		<tr>
			<td>Phone Cookie</td>
			<td>${cookie.phone.value}</td>
		<tr>
			<td>CP : state</td>
			<td>${initParam.state}</td>
		<tr>
			<td>CP : city</td>
			<td>${initParam.city}</td>
		</tr>
		<tr>
			<td>using PageContext</td>
			<td>${pageContext.session.id}<br />
				${pageContext.request.remoteAddr}<br />
				${pageContext.request.method}<br />
				${pageContext.request.requestURI}<br />
				${pageContext.request.contentType}<br />
		</tr>
	</table>
</body>
</html>