package jstlel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/03")
public class _03Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<UserVo> users = new ArrayList<UserVo>();
		
		UserVo vo1 = new UserVo();
		vo1.setId(1L);
		vo1.setName("둘리1");
		users.add(vo1);
		
		UserVo vo2 = new UserVo();
		vo2.setId(2L);
		vo2.setName("둘리2");
		users.add(vo2);
		
		UserVo vo3 = new UserVo();
		vo3.setId(3L);
		vo3.setName("둘리3");
		users.add(vo3);
		
		request.setAttribute("users", users);
		
		request.getRequestDispatcher("/WEB-INF/views/03.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
