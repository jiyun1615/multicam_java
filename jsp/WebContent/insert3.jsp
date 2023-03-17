<%@page import="multi.ProductDAO"%>
<%@page import="multi.ProductVO"%>
<%@page import="multi.BBSDAO3"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- 가방 만들고 값 다 받아오는 코드 -->
<jsp:useBean id="bag" class="multi.ProductVO"></jsp:useBean>
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

ProductDAO dao = new ProductDAO();
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
<%-- 제품 이름 : <%=name%> <br>
제품 설명 : <%=content%> <br>
제품 가격 : <%=price%> <br>
제품 회사 : <%=company%> <br>
제품 이미지 : <img src="img/<%=img%>"> <br> --%>
</body>
</html>