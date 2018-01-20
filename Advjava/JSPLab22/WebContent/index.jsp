<%@page autoFlush="true" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<fmt:setBundle basename="message" scope="session" />
<fmt:setLocale value="${LAN}" scope="session" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">
		<fmt:message key="welcome.header" />
	</h1>
	<br />
	<br />
	<br />
	<h2 align="center">
		<a href="changelocale.jlc?language=en"><fmt:message
				key="language.english" /></a> <a href="changelocale.jlc?language=hi"><fmt:message
				key="language.hindi" /></a>
	</h2>
</body>
</html>