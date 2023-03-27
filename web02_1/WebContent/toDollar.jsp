<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String w = request.getParameter("won");
	String result = "";
	int won = Integer.parseInt(w);
	double dollar = won * 0.00078;
	result = result + dollar;
%><%=result%>