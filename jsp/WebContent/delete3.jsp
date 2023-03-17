<%@page import="multi.ProductDAO"%>
<%@page import="multi.BBSDAO3"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!--브라우저가 보낸 데이터를 받아야 함 -> 자바로 짜야함. -->
<!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품필요함 -->

<%
	//자바코드 넣는 부분
//HttpServletRequest request = new HttpServletRequest();
//tomcat은 미리 request를 만들어서 내장시켜둠.

String id = request.getParameter("id"); 

ProductDAO dao = new ProductDAO();
dao.delete(Integer.parseInt(id));

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete complete</title>

<style type="text/css">
body {
	background: #ffcf9c;
		
}
</style>
</head>
<body>
제품삭제 요청 완료

<hr>
삭제한 제품 id : <%=id%> <br>
</body>
</html>