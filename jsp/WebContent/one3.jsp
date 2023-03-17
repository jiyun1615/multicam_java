<%@page import="multi.ProductVO"%>
<%@page import="multi.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!--브라우저가 보낸 데이터를 받아야 함 -> 자바로 짜야함. -->
<!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품필요함 -->

<%
	//자바코드 넣는 부분

String id = request.getParameter("id");

ProductDAO dao = new ProductDAO();
ProductVO bag = dao.one(Integer.parseInt(id));
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
	<%=bag.getName()%>
	<br> 설명 :
	<%=bag.getContent()%>
	<br> 가격 :
	<%=bag.getPrice()%>
	<br> 회사 :
	<%=bag.getCompany()%>
	<br> 이미지 :
	<%=bag.getImg()%>
	<br>

	<div class="container mt-3">
		<table class="table">
			<thead class="table-dark">
				<tr>
					<th>ID</th>
					<th>이름</th>
					<th>설명</th>
					<th>가격</th>
					<th>회사</th>
					<th>이미지</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><%=bag.getID()%></td>
					<td><%=bag.getName()%></td>
					<td><%=bag.getContent()%></td>
					<td><%=bag.getPrice()%></td>
					<td><%=bag.getCompany()%></td>
					<td><img src = "img/<%=bag.getImg()%>" width="100"></td>
				</tr>
			</tbody>
		</table>
	</div>



</body>
</html>