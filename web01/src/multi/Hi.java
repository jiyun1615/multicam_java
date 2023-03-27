package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome2")
public class Hi extends HttpServlet {


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service() 메서드 호출됨. 여기 내용이 실행될 예정임");
		String id = request.getParameter("id");
		System.out.println("서버에서 받은 데이터는 " + id);
		String pw = request.getParameter("pw");
		System.out.println("서버에서 받은 데이터는 " + pw);
		PrintWriter out = response.getWriter();		//response : 서버가 브라우저에 응답할 때 사용
		//PrintWriter는 브라우저에 응답할 때 문자를 줄 수 있는 부품
		out.print("<!DOCTYPE html>\n" + 
				"<html>\n" + 
				"<head>\n" + 
				"<meta charset=\"UTF-8\">\n" + 
				"<title>Insert title here</title></head>\n" + 
				"<body>");
		out.print("<h3>");
		out.print("i am a web programmer...");
		out.print("</h3></body></html>");
		
		out.close();
	}

}
