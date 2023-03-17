<%@page import="multi.MovieVO"%>
<%@page import="multi.MovieDAO"%>
<%@page import="multi.ProductVO"%>
<%@page import="multi.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!--브라우저가 보낸 데이터를 받아야 함 -> 자바로 짜야함. -->
<!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품필요함 -->

<%
	//자바코드 넣는 부분

String id = request.getParameter("id");

MovieDAO dao = new MovieDAO();
MovieVO bag = dao.one(id);
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
	background: #f6deff;
}
</style>
</head>
<body>
	검색 결과
	<hr>

	ID :
	<%=bag.getID()%>
	<br> 이름 :
	<%=bag.getTitle()%>
	<br> 설명 :
	<%=bag.getContent()%>
	<br> 위치 :
	<%=bag.getLocation()%>
	<br> 감독 :
	<%=bag.getDirector()%>
	<br>

	<div class="container mt-3">
		<table class="table">
			<thead class="table-dark">
				<tr>
					<th>ID</th>
					<th>제목</th>
					<th>설명</th>
					<th>위치</th>
					<th>감독</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><%=bag.getID()%></td>
					<td><%=bag.getTitle()%></td>
					<td><%=bag.getContent()%></td>
					<td><%=bag.getLocation()%></td>
					<td><%=bag.getDirector()%></td>
				</tr>
			</tbody>
		</table>
	</div>



</body>
</html>