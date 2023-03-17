<%@page import="multi.BBSDAO3"%>
<%@page import="multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!--브라우저가 보낸 데이터를 받아야 함 -> 자바로 짜야함. -->
<!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품필요함 -->

<%
	//자바코드 넣는 부분
//HttpServletRequest request = new HttpServletRequest();
//tomcat은 미리 request를 만들어서 내장시켜둠.

String title = request.getParameter("title"); //apple
String content = request.getParameter("content"); //apple
String writer = request.getParameter("writer"); //apple

BbsVO bag = new BbsVO();
bag.setTitle(title);
bag.setContent(content);
bag.setWriter(writer);

BBSDAO3 dao = new BBSDAO3();
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
회원가입 요청 완료

<hr>
가입한 title : <%=title%> <br>
가입한 content : <%=content%> <br>
가입한 writer : <%=writer%> <br>

</body>
</html>