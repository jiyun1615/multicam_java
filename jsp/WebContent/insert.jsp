<%@page import="multi.MemberDAO2"%>
<%@page import="multi.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!--브라우저가 보낸 데이터를 받아야 함 -> 자바로 짜야함. -->
<!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품필요함 -->

<%
	//자바코드 넣는 부분
//HttpServletRequest request = new HttpServletRequest();
//tomcat은 미리 request를 만들어서 내장시켜둠.

String id = request.getParameter("id"); //apple
String pw = request.getParameter("pw"); //apple
String name = request.getParameter("name"); //apple
String tel = request.getParameter("tel"); //apple

MemberVO bag = new MemberVO();
bag.setId(id);
bag.setPw(pw);
bag.setName(name);
bag.setTel(tel);

MemberDAO2 dao = new MemberDAO2();
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
가입한 id : <%=id%> <br>
가입한 pw : <%=pw%> <br>
가입한 name : <%=name%> <br>
가입한 tel : <%=tel%> <br>

</body>
</html>