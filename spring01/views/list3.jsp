<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	검색 요청 완료 <br>
	
	<img alt="" src="resources/img/${bag.img}" width="100">
	${bag.id}
	${bag.name}
	<button onclick="location.href='${bag.url}'">구매하기</button> 
	
	
	
	<div class="container mt-3">
		<table class="table">
			<tr class="table-dark">
				<td>ID</td>
				<td>Name</td>
				<td>Content</td>
				<td>Price</td>
				<td>Company</td>
				<td>Img</td>
			</tr>
			<%
			
			if(list.size() != 0){
				for (MovieVO bag2 : list) {
			%>
			<tr>
				<td><%=bag2.getID()%></td>
				<td><a
					href="http://localhost:8888/web02/one4.jsp?id=<%=bag2.getID()%>"><%=bag2.getTitle()%></a></td>
				<td><%=bag2.getContent()%></td>
				<td><%=bag2.getLocation()%></td>
				<td><%=bag2.getDirector()%></td>
			</tr>
			<%
				}}else{
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

