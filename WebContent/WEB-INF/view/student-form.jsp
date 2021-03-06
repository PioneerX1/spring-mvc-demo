<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Registration Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
		First Name: <form:input path="firstName" />
		<br>
		Last Name: <form:input path="lastName" />
		<br>
		Country: 
		<form:select path="country">
			<form:options items="${countryOptions}" />
		</form:select>
		<br>
		Favorite Programming Language:
		<br>
		${languageOptions.java} <form:radiobutton path="favLang" value="${languageOptions.java}" />
		${languageOptions.csharp} <form:radiobutton path="favLang" value="${languageOptions.csharp}" />
		${languageOptions.python} <form:radiobutton path="favLang" value="${languageOptions.python}" />
		${languageOptions.ruby} <form:radiobutton path="favLang" value="${languageOptions.ruby}" />
		<br>
		Operating Systems:
		<br>
		Linux <form:checkbox path="operatingSystems" value="Linux" />
		MacOS <form:checkbox path="operatingSystems" value="MacOS" />
		Windows <form:checkbox path="operatingSystems" value="Windows" />
		<br>
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>