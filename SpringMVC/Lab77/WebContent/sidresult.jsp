<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<br>
		<h1>
			Java Learning Center<br />
		</h1>
		<h2>Student Search Form</h2>
		<table>
			<tr>
				<td>Student ID</td>
				<td>${STO.sid}</td>
				<td>Batch ID</td>
				<td>${STO.bid}</td>
				<td>Student Name</td>
				<td>${STO.name}</td>
				<td>Email ID</td>
				<td>${STO.email}</td>
				<td>Phone No</td>
				<td>${STO.phone}</td>
		</table>
	</center>
</body>
</html>