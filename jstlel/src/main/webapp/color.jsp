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
	<%
		if("orange".equals(color)) {
	%>
		<h1 style="color:orange">Hello World</h1>
	<%
		} else if("red".equals(color)) {
	%>
		<h1 style="color:red">Hello World</h1>
	<%
		} else if("gray".equals(color)) {
	%>
		<h1 style="color:gray">Hello World</h1>
	<%
		} else {
	%>
		<h1 style="color:#eee">Hello World</h1>
	<%
		}
	%>
</body>
</html>