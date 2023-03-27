package multi;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/haha2")
public class Hi2 extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service() 메서드 호출됨. 여기 내용이 실행될 예정임");
		String data = request.getParameter("data");
		System.out.println("서버에서 받은 데이터는 " + data);
	}
}
