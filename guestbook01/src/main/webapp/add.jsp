<%@page import="com.douzone.guestbook.dao.GuestbookDao"%>
<%@page import="java.time.LocalDate"%>
<%@page import="com.douzone.guestbook.vo.GuestbookVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% 
	request.setCharacterEncoding("utf-8");

	GuestbookVo vo = new GuestbookVo();
	vo.setName(request.getParameter("name"));
	vo.setPassword(request.getParameter("password"));
	vo.setRegDate(LocalDate.now().toString());
	vo.setMessage(request.getParameter("message"));
	
	new GuestbookDao().insert(vo);
	
	response.sendRedirect(request.getContextPath());
%>