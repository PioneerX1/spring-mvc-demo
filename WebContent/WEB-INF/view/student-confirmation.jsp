<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Confirmation</title>
</head>
<body>

	<h2>Student Confirmation Info</h2>
	<br>
	<h3>First Name: ${student.firstName}</h3>
	<h3>Last Name: ${student.lastName}</h3>
	<h3>Country: ${student.country}</h3>
	<h3>Favorite Programming Language: ${student.favLang}</h3>
	<h3>Operating System: </h3>
		<ul>
			<c:forEach var="temp" items="${student.operatingSystems}">
				<li>${temp}</li>
			</c:forEach>
		</ul>
</body>
</html>