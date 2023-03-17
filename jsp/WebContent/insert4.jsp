<%@page import="multi.MovieDAO"%>
<%@page import="multi.ProductDAO"%>
<%@page import="multi.ProductVO"%>
<%@page import="multi.BBSDAO3"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- 가방 만들고 값 다 받아오는 코드 -->
<jsp:useBean id="bag" class="multi.MovieVO"></jsp:useBean>
<jsp:setProperty property="*" name="bag"/>

<%
	//자바코드 넣는 부분
//HttpServletRequest request = new HttpServletRequest();
//tomcat은 미리 request를 만들어서 내장시켜둠.

/* String name = request.getParameter("name"); 
String content = request.getParameter("content");
String price= request.getParameter("price");
String company= request.getParameter("company");
String img= request.getParameter("img");


bag.setName(name);
bag.setContent(content);
bag.setPrice(Integer.parseInt(price));
bag.setCompany(company);
bag.setImg(img); */

MovieDAO dao = new MovieDAO();
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
제품 추가 요청 완료

<hr>
영화 ID : <%=bag.getID() %>
영화제목 : <%=bag.getTitle() %> <br>
영화 설명 : <%=bag.getContent()%> <br>
영화 장소 : <%=bag.getLocation()%> <br>
영화 감독 : <%=bag.getDirector()%> <br>
</body>
</html>