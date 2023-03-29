<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>당신의 음식은??</h3>
<hr>
<form action="food" method="get">
	좋아하는 음식 : <input name = "like" value="치킨"><br>
	싫어하는 음식 : <input name = "dislike" value="마라탕"><br>
	<button type="submit">서버로 전송</button>
</form>
</body>
</html>