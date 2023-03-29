<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	검색 요청 완료 <br>
	
	<img alt="" src="resources/img/${bag.img}" width="100">
	${bag.id}
	${bag.name}
	<button onclick="location.href='${bag.url}'">구매하기</button> 
</body>
</html>