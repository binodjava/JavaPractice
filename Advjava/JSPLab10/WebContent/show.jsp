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
	<h1>Java Learning Center</h1>
	<table border="2" style="font-size: 26; color: red;">
		<tr>
			<td>1)String,Wrappers and Date.</td>
			<td><c:out value="${requestScope.EM}" /> <br />${sessionScope.PH}
				<br />${applicationScope.DOB}<br /></td>
		</tr>
		<tr>
			<td>2)Collection of String,Wrappers and Date.</td>
			<td><table bgcolor="#c3d599" style="font-size: 26; color: red;">
					<tr>
						<c:forEach var="x" items="${requestScope.AL}">
							<td>${x }</td>
						</c:forEach>
					</tr>
				</table>
				<table bgcolor="wheet" style="font-size: 26; color: red;">
					<tr>
						<c:forEach var="x" items=${sessionScope.STR}">
							<td>${x}</td>
						</c:forEach>
					</tr>
				</table></td>
		</tr>

		<tr>
			<td>3)Collection of Collections</td>
			<td><table bgcolor="#c3d599" style="color: red">
					<c:forEach var="list" items="${requestScope.ALL}">
						<tr>
							<c:forEach var="x" items="${list}">
								<td>${x}</td>
							</c:forEach>
						</tr>
					</c:forEach>
				</table></td>
		</tr>

		<tr>
			<td>4)Custom or User defined class object</td>
			<td>Cid : ${sessionScope.CUST.cnae}<br /> Cname
				:${sessionScope.CUST.account.accno}<br /> Email
				:${sessionScope.CUST.account.email}<br /> Phone
				:${sessionScope.CUST.account.phone}<br /> Accno
				:${sessionScope.CUST.account.accno}<br /> Atype
				:${sessionScope.CUST.account.atype}<br /> Bal
				:${sessionScope.CUST.account.bal}<br /> Street
				:${sessionScope.CUST.address.street}<br /> City
				:${sessionScope.CUST.address.city}<br /></td>
		</tr>

		<tr>
			<td>5)Collection of User defined class object</td>
			<td>
				<table bgcolor="wheet" style="font-size: 26; color: red">
					<tr>
						<td>Cid</td>
						<td>Cname</td>
						<td>Email</td>
						<td>Phone</td>
						<td>Accno</td>
						<td>Atype</td>
						<td>Street</td>
						<td>City</td>
					</tr>
					<c:forEach var="cust" items="${sessionScope.CS}">
						<tr>
							<td>${cust.cid}</td>
							<td>${cust.cname}</td>
							<td>${cust.email}</td>
							<td>${cust.phone}</td>
							<td>${cust.account.accno}</td>
							<td>${cust.account.atype}</td>
							<td>${cust.account.bal}</td>
							<td>${cust.account.address.street}</td>
							<td>${cust.account.address.city}</td>
						</tr>
					</c:forEach>
				</table>
			</td>
		</tr>

		<tr>
			<td>6)Map Object</td>
			<td><table style="font-size: 26; color: red;">
					<tr>
						<td>Map Key</td>
						<td>Map value</td>
					</tr>

					<c:forEach var="entry" items="${sessionScope.HM}">
						<tr>
							<td>${entry.key}</td>
							<td>${entry.value}</td>
						</tr>
					</c:forEach>
				</table></td>
		</tr>

		<tr>
			<td>7)Collection of Map Object</td>
			<td><table bgcolor="wheet" style="font-size: 26; color: red;">
					<c:forEach var="map" items="${requestScope.AL2}">
						<tr>
							<td><table bgcolor="#c3d599"
									style="font-size: 26; color: red;">
									<tr>
										<td>Map Key</td>
										<td>MaP value</td>
									</tr>
									<c:forEach var="entry" items="${map}">
										<tr>
											<td>${entry.key}</td>
											<td>${entry.value}</td>
										</tr>
									</c:forEach>
								</table></td>
						</tr>
					</c:forEach>
				</table></td>
		</tr>
	</table>
</body>
</html>