<%@page import="java.util.ArrayList"%>
<%@page import="multi.BBSDAO3"%>
<%@page import="multi.BbsVO"%>
<%@page import="multi.MemberDAO2"%>
<%@page import="multi.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!--브라우저가 보낸 데이터를 받아야 함 -> 자바로 짜야함. -->
<!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품필요함 -->

<%
	BBSDAO3 dao = new BBSDAO3();
ArrayList<BbsVO> list = dao.list();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>read one complete</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<style type="text/css">
body {
	/* 	background: #ffcf9c; */
	
}
a{
	text-decoration: none;
	color: black;
}
</style>
</head>
<body>
	검색 결과
	
	<hr>
	<div class="container mt-3">
		<table class="table">
			<tr class = "table-dark">
				<td>No</td>
				<td>Title</td>
				<td>Content</td>
				<td>Writer</td>
			</tr>
			<%
				for (BbsVO bag2 : list) {
			%>
			<tr>
				<td><%=bag2.getNo()%></td>
				<td><a href="http://localhost:8888/web02/one2.jsp?no=<%=bag2.getNo()%>"><%=bag2.getTitle()%></a></td>
				<td><%=bag2.getContent()%></td>
				<td><%=bag2.getWriter()%></td>
			</tr>
			<%
				}
			%>
		</table>
	</div>
</body>
</html>