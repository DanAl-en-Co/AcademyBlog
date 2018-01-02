<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Osudio Academy Blog</title>
</head>
<body>
	<header>
		<img src="<c:url value='/images/osudio_horizontal.png' />">
		<nav>
			<a href="<c:url value='/homepage.jsp' />">Home</a>
		</nav>
	</header>
	<section>
		<h1><spring:message code="homepage.title" /></h1>
		<p><spring:message code="homepage.intro" /></p>
		<form action="guestbook" method="post">
			<p>Enter username :<input type="text" name="username"></p>
			<p>Enter password :<input type="text" name="message"></p>
			<c:if test="${errorMessage ne null}">
				<p>${errorMessage}</p>
			</c:if>
			<input type="submit" value="Login">
		</form>
	</section>
	<footer>
		<p><spring:message code="copyright" /></p>
	</footer>
	
	
</body>
</html>