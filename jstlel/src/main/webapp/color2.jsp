<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="functions" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String color = request.getParameter("c");
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test='${param.c == "orange" }'>	
			<h1 style="color:orange">Hello World</h1>
		</c:when>
		<c:when test='${param.c == "gray" }'>	
			<h1 style="color:gray">Hello World</h1>
		</c:when>
		<c:when test='${param.c == "blue" }'>	
			<h1 style="color:blue">Hello World</h1>
		</c:when>
		<c:when test='${param.c == "green" }'>	
			<h1 style="color:green">Hello World</h1>
		</c:when>
		<c:otherwise>	
			<h1 style="color:#eee">Hello World</h1>
		</c:otherwise>
	</c:choose>
</body>
</html>