package multi;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Monday")
public final class Monday extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Monday() {
    	
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	String temp = config.getInitParameter("temp");
		System.out.println(temp);
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
