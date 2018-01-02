<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GuestBook</title>


</head>
<body>
<ul>
	<c:forEach items="${guestBookEntries}" var="guestBookEntry">
		<li><span>${guestBookEntry.userName}</span></li>
		<li><span>${guestBookEntry.message}</span></li>
	</c:forEach>
	
	
</ul>
	<form:form method="post" modelAttribute="guestBookEntry">


		<table>
			<tr>
				<td>Enter Username:</td>
				<td><form:input path="userName" type="text" /></td>
			</tr>
			<tr>
				<td>Enter Message:</td>
				<td><form:input path="message" type="text" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="submit"></td>
			</tr>
		</table>
	</form:form>

</body>
</html>