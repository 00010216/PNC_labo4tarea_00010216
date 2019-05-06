<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--<h1>${message}</h1>-->
	<h2>Product information</h2>
	<form:form action = "${pageContext.request.contextPath}/formData" method="POST" modelAttribute ="product">
		<label>Name: </label><form:input type = "text" name = "name" path = "name"/><br>
		<label>Brand: </label><form:input type = "text" name = "brand" path = "brand"/><br>
		<label>Description: </label><form:input type = "text" name = "description" path = "description"/><br>
		<label>Category: </label><form:input type = "text" name = "category" path = "category"/><br>
		<input type = "submit" value = "Insert product"/>
	</form:form>
	</body>
</html>