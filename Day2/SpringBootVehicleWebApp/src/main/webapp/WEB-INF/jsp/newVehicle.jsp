<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Vehicle Management : New Vehicle Registration</title>
</head>
<body>

	<h1>New Vehicle Registration</h1>
	<form:form modelAttribute="form">
		<form:errors path="" element="div" />
		<div>
			<form:label path="name">Name</form:label>
			<form:input path="name" />
			<form:errors path="name" />
		</div>

		<div>
			<input type="submit" />
		</div>
	</form:form>
</body>
</html>