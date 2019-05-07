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
		
		<label>Name: </label><form:input type = "text" name = "name" path = "name"/>
		<form:errors path = "name" cssStyle = "color:#E81505"></form:errors><br>
		
		<label>Brand: </label><form:input type = "text" name = "brand" path = "brand"/>
		<form:errors path = "brand" cssStyle = "color:#E81505"></form:errors><br>
		
		<label>Description: </label><form:input type = "text" name = "description" path = "description"/>
		<form:errors path = "description" cssStyle = "color:#E81505"></form:errors><br>
		
		<label>Category: </label><form:input type = "text" name = "category" path = "category"/>
		<form:errors path = "category" cssStyle = "color:#E81505"></form:errors><br>
		
		<label>Price: </label><form:input type = "number" step = ".01" name = "price" path = "price"/>
		<form:errors path = "price" cssStyle = "color:#E81505"></form:errors><br>
		
		<label>Expiration date: </label><form:input type = "text" name = "price" path = "exp_date"/>
		<form:errors path = "exp_date" cssStyle = "color:#E81505"></form:errors><br>
		
		<input type = "submit" value = "Insert product"/>
	</form:form>
	</body>
</html>