package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/check.do")
public class check extends HttpServlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("check 서블릿 객체 생성");
	}
	
	@Override
	public void destroy() {
		System.out.println("check 서블릿 객체 소멸");
	}
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String find = request.getParameter("today");
		if(find.equals("맑음")) {
			out.print("나가자");
		}else if(find.equals("흐림")) {
			out.print("코딩");
		}else if(find.equals("비옴")) {
			out.print("쇼핑");
		}else {
			out.print("그냥 있자");
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String pass = request.getParameter("pass");
		if(pass.equals("나는왕이다")) {
			out.print("<img src = 'img/yes.jpg'>들어오세요");	
			
		}else {
			out.print("<img src = 'img/no.png'>들어올 수 없습니다.");
		}
	}

}
