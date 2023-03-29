<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	//MVC 방법론 ver1 : ==> jsp로만 만들었을 때
//MVC 방법론 ver2 : ==> spring으로 만든다

//1. 브라우저에서 넘어오는 값 서버에서 받아주세요..
//넘어오는 값 제어해주는 코드(자바코드)
//Controller(자바코드)


//2. dao에 데이터값을 주면서 Insert요청하세요..(자바코드)
//DAO(JDBC4단계에 의해 코딩이 됨. 항상 방법이 똑같다.)
//Model(자바코드)

//3. 결과를 html에 담아서 클라이언트로 전송해주세요.
//보여주는 부분(html)
//View(html)
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{
	background : lightgray;
}
</style>

</head>
<body>
	장르 : 액션
	<img alt="" src="resources/img/action.png">
	

</body>
</html>