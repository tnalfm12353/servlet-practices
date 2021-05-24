<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello world</h1>
	<h2>Hello world</h2>
	<h3>Hello world</h3>
	<h4>Hello world</h4>
	<h5>Hello world</h5>
	<h6>Hello world</h6>
	
	<table border="1px solid #eee" celspacing="0" cellpading="10" >
		<tr>
			<th>글번호</th>
			<th>글제목</th>
			<th>작성자</th>
		</tr>
		<tr>
			<td>1</td>
			<td>어서오고</td>
			<td>또치</td>		
		</tr>
		<tr>
			<td>2</td>
			<td>반갑고</td>
			<td>둘리</td>
		</tr>
		<tr>
			<td>3</td>
			<td>ㅇㅇㅇ</td>
			<td>ㅂㅂㅂㅂ</td>		
		</tr>
	</table>
	<br/>
	<img src='images/cat.jpg' style='width:320px; border:1px solid #000000000; border-radius: 8px;' />
	<img src='/helloweb/images/cat.jpg' style='width:320px; border:1px solid #000000000; border-radius: 8px;' />
	<br/>
	<a href="form.jsp">폼으로 가기</a>
	<br/>
	<a href = "hello.jsp?name=hong&email=hong@naver.com">hello</a>
	<p>
	5월 24, 2021 11:53:47 오전 org.apache.catalina.startup.VersionLoggerListener log
	INFO: 명령 행 아규먼트:  -Dcatalina.base=C:\Users\BIT\Documents\bitAcademy\workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0
	5월 24, 2021 11:53:47 오전 org.apache.catalina.startup.VersionLoggerListener log
	INFO: 명령 행 아규먼트:  -Dcatalina.home=C:\Users\BIT\Documents\bitAcademy\apache-tomcat-8.5.66
	</p>
</body>
</html>