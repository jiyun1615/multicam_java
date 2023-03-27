<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String d = request.getParameter("dollar");
	String result = "";
	int dollar = Integer.parseInt(d);
	double won = dollar * 1283.94;
	result = result + won;
%><%=result%>