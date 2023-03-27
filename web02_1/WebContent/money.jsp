<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String m = request.getParameter("money");
	String c = request.getParameter("choice");
	
	int money = Integer.parseInt(m);
	switch (c) {
	case "1":
		money = money - 1000;
		break;
	case "2":
		money = money + 1000;	
		break;
	}
%>
<%=money%>