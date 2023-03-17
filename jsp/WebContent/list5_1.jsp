<%@page import="multi.PlaceVO"%>
<%@page import="multi.PlaceDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!--브라우저가 보낸 데이터를 받아야 함 -> 자바로 짜야함. -->
<!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품필요함 -->

<%
	String ss = request.getParameter("search");
	PlaceDAO dao = new PlaceDAO();
	ArrayList<PlaceVO> list = dao.search(ss);
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
	
}

a {
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
			<tr class="table-dark">
				<td>ID</td>
				<td>Name</td>
				<td>Address</td>
				<td>Score</td>
				<td>Image</td>
			</tr>
			<%
				if (list.size() != 0) {
				for (PlaceVO bag2 : list) {
			%>
			<tr>
				<td><%=bag2.getId()%></td>
				<td><a
					href="http://localhost:8888/web02/one5.jsp?id=<%=bag2.getId()%>"><%=bag2.getName()%></a></td>
				<td><%=bag2.getAddress()%></td>
				<td><%=bag2.getScore()%></td>
				<td><img src="img2/<%=bag2.getImg()%>" width="100" height="100"></td>
			</tr>
			<%
				}
			} else {
			%>
			<tr>
				<td colspan=1>값이 존재하지 않습니다.</td>
			</tr>
			<%
				}
			%>
		</table>
	</div>
</body>
</html>