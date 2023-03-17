<%@page import="multi.PlaceVO"%>
<%@page import="multi.PlaceDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!--브라우저가 보낸 데이터를 받아야 함 -> 자바로 짜야함. -->
<!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품필요함 -->

<%
	//자바코드 넣는 부분

String id = request.getParameter("id");

PlaceDAO dao = new PlaceDAO();
PlaceVO bag = dao.one(id);
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

	명소 ID :
	<%=bag.getId()%>
	<br> 명소 이름 :
	<%=bag.getName()%>
	<br> 주소 :
	<%=bag.getAddress()%>
	<br> 평점 :
	<%=bag.getScore()%>
	<br> 이미지 :
	<%=bag.getImg()%>
	<br>

	<div class="container mt-3">
		<table class="table">
			<thead class="table-dark">
				<tr>
					<th>ID</th>
					<th>이름</th>
					<th>주소</th>
					<th>평점</th>
					<th>이미지</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><%=bag.getId()%></td>
					<td><%=bag.getName()%></td>
					<td><%=bag.getAddress()%></td>
					<td><%=bag.getScore()%></td>
					<td><img src = "img2/<%=bag.getImg()%>" width="100"></td>
				</tr>
			</tbody>
		</table>
	</div>



</body>
</html>