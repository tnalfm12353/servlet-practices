<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String email = request.getParameter("email");
	String password = request.getParameter("password");
	String birthYear = request.getParameter("birthYear");
	String gender = request.getParameter("gender");
	String hobbies[] = request.getParameterValues("hobby");
	String profile = request.getParameter("profile");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=email %> <br/>
	<%=password %> <br/>
	<%=birthYear %> <br/>
	<%=gender %> <br/>
	<%
		for(String hobby: hobbies){
	%>
	 		<h5> <%=hobby %> </h5>
	<%
		}
	%>
	<%=profile.replace("\n", "<br/>") %>
</body>
</html>