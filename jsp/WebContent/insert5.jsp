<%@page import="multi.PlaceDAO"%>
<%@page import="multi.MovieDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- 가방 만들고 값 다 받아오는 코드 -->
<jsp:useBean id="bag" class="multi.PlaceVO"></jsp:useBean>
<jsp:setProperty property="*" name="bag"/>

<%
PlaceDAO dao = new PlaceDAO();
dao.insert(bag);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style type="text/css">
body {
	background: #ffcf9c;
		
}
</style>
</head>
<body>
명소 추가 요청 완료

<hr>
명소 ID : <%=bag.getId() %>
명소제목 : <%=bag.getName() %> <br>
명소 설명 : <%=bag.getAddress()%> <br>
명소 장소 : <%=bag.getScore()%> <br>
명소 감독 : <%=bag.getImg()%> <br>
</body>
</html>