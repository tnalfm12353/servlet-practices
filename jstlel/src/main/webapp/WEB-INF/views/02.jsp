<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Scope(객체의 저장범위) Test</h1>
	
	<h3> request scope</h3>
	${vo.id } <br/>
	${vo.name } <br/>
	
	
	<h3> session scope</h3>
	${sessionScope.vo.id } <br/>
	${sessionScope.vo.name } <br/>
</body>
</html>