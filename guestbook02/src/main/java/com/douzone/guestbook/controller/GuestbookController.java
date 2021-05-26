package com.douzone.guestbook.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.douzone.guestbook.dao.GuestbookDao;
import com.douzone.guestbook.vo.GuestbookVo;


public class GuestbookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String action = request.getParameter("a");
		if("deleteform".equals(action)) {
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/deleteform.jsp");
			rd.forward(request, response);
		} else if("add".equals(action)) {
			GuestbookVo vo = new GuestbookVo();
			vo.setName(request.getParameter("name"));
			vo.setPassword(request.getParameter("password"));
			vo.setRegDate(LocalDate.now().toString());
			vo.setMessage(request.getParameter("message"));
			
			new GuestbookDao().insert(vo);
			
			response.sendRedirect(request.getContextPath() + "/gb");
		} else if("delete".equals(action)) {
			
			Long id = Long.valueOf(request.getParameter("id"));
			String password = request.getParameter("password");
			
			GuestbookVo vo = new GuestbookDao().findById(id);
			if(vo.getPassword().equals(password)){
				new GuestbookDao().delete(vo);
			}
			
			response.sendRedirect(request.getContextPath() + "/gb");
		} else {
			List<GuestbookVo> list = new GuestbookDao().findAll();
			
			request.setAttribute("list", list);
			
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
			rd.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
