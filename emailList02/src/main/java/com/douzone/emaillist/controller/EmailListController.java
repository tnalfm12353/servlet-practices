package com.douzone.emaillist.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.douzone.emaillist.dao.emailListDao;
import com.douzone.emaillist.vo.EmailListVo;

public class EmailListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// post 방식으로 전달받는 파라미터 값의 인코딩 처리.
		request.setCharacterEncoding("utf-8");
		
		String action = request.getParameter("a");
		if("form".equals(action)) {
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/form.jsp");
			rd.forward(request, response);
		} else if("add".equals(action)) {
			// 1. 요청처리
			String firstName = request.getParameter("fn");
			String lastName = request.getParameter("ln");
			String email = request.getParameter("email");
			
			EmailListVo vo = new EmailListVo();
			vo.setFirstName(firstName);
			vo.setLastName(lastName);
			vo.setEmail(email);
			
			new emailListDao().insert(vo);
			
			// 2. redirect 응답
			response.sendRedirect(request.getContextPath() + "/elist");
			
		} else {
			/* default request(action) */
			
			// 1. 요청처리
			List<EmailListVo> list = new emailListDao().findAll();
			
			// 2. requst범위에 데이터(객체) 저장
			request.setAttribute("list", list);
			
			// 3. view로 포워딩
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
			rd.forward(request, response);
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
