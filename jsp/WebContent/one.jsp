<%@page import="multi.MemberDAO2"%>
<%@page import="multi.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!--브라우저가 보낸 데이터를 받아야 함 -> 자바로 짜야함. -->
<!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품필요함 -->

<%
	//자바코드 넣는 부분

String id = request.getParameter("id");

MemberDAO2 dao = new MemberDAO2();
MemberVO bag =  dao.one(id);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>read one complete</title>

<style type="text/css">
body {
	background: #ffcf9c;
		
}
</style>
</head>
<body>
검색 결과
<hr>
아이디 : <%=bag.getId()%> <br>
비밀번호 : <%=bag.getPw()%> <br>
이름 : <%=bag.getName()%> <br>
전화번호 : <%=bag.getTel()%> <br>
</body>
</html>