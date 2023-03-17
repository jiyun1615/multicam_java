<%@page import="multi.BBSDAO3"%>
<%@page import="multi.BbsVO"%>
<%@page import="multi.MemberDAO2"%>
<%@page import="multi.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!--브라우저가 보낸 데이터를 받아야 함 -> 자바로 짜야함. -->
<!-- 브라우저가 보낸 데이터를 받을 때 사용하는 부품필요함 -->

<%
	//자바코드 넣는 부분

String no = request.getParameter("no");

BBSDAO3 dao = new BBSDAO3();
BbsVO bag =  dao.one(Integer.parseInt(no));
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>read one complete</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<style type="text/css">
body {
/* 	background: #ffcf9c; */
		
}
</style>
</head>
<body>
검색 결과
<hr>
번호  : <%=bag.getNo()%> <br>
제목  : <%=bag.getTitle()%> <br>
내용  : <%=bag.getContent()%> <br>
작성자  : <%=bag.getWriter()%> <br>

<div class="container mt-3">
  <table class="table">
    <thead class="table-dark">
      <tr>
        <th>번호</th>
        <th>제목</th>
        <th>내용</th>
        <th>작성자</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td><%=bag.getNo()%></td>
        <td><%=bag.getTitle()%></td>
        <td><%=bag.getContent()%></td>
        <td><%=bag.getWriter()%> </td>
      </tr>
    </tbody>
  </table>
</div>



</body>
</html>