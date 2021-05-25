<%@page import="com.douzone.guestbook.vo.GuestbookVo"%>
<%@page import="com.douzone.guestbook.dao.GuestbookDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	Long id = Long.valueOf(request.getParameter("id"));
	String password = request.getParameter("password");
	
	GuestbookVo vo = new GuestbookDao().findById(id);
	if(vo.getPassword().equals(password)){
		new GuestbookDao().delete(vo);
	}
	
	response.sendRedirect(request.getContextPath());
%>