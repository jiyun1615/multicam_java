<%@page import="web03.Mock2DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="bag" class = "web03.Mock2VO"></jsp:useBean>
<jsp:setProperty property="*" name = "bag"/>
<% 	Mock2DAO dao = new Mock2DAO();
	dao.insert(bag);
%>
<meta charset="UTF-8">
