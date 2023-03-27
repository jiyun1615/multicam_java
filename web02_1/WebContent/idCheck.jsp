<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
String[] list = { "root", "admin", "hong" };
String result = "사용가능";
for (String s : list) {
	if(s.equals(id)){
		result = "중복된 id, 사용 불가";
		break;	
	}
}
%><%=result%>