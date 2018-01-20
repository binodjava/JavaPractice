<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>User Account Login</h1>
		<form action="verifyUser.jlc" method="post" commandName="user">
			<table>
				<tr>
					<td>User Name</td>
					<td><font color="red" size="5"> <form:errors
								path="username" /></font></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><font color="red" size="5"> <form:errors
								path="password" /></font></td>
				</tr>
			</table>

			<br /> <input type="submit" value="Account Login">
		</form>
	</center>
</body>
</html>