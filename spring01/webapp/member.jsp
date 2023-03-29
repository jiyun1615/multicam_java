<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>로그인 화면입니다.</h3>
	<hr>
	<form action="login" method="get">
		id : <input name="id" value="apple"> <br>
		pw : <input name="pw" value="1111"> <br> 
		<button type="submit">로그인</button>
	</form>

	<h3>회원가입 화면입니다.</h3>
	<hr>
	<form action="insert" method="get">
		id : <input name="id" value="apple"><br> 
		pw : <input	name="pw" value="1111"><br> 
		name : <input name="name" value="홍길동"><br> 
		tel : <input name="tel" value="010"><br>
		<button type="submit">회원가입</button>
	</form>


	<h3>회원수정 화면입니다.</h3>
	<hr>
	<form action="update" method="get">
		id : <input name="id" value="apple"><br> 
		tel : <input name="tel" value="011"><br>
		<button type="submit">서버로 전송</button>
	</form>
	<hr>

	<h3>회원탈퇴 화면입니다.</h3>
	<hr>
	<form action="delete" method="get">
		id : <input name="id" value="apple"><br>
		<button type="submit">서버로 전송</button>
	</form>
	<hr>

	<h3>회원검색 화면입니다.</h3>
	<hr>
	<form action="one" method="get">
		id : <input name="id" value="apple"><br>
		<button type="submit">서버로 전송</button>
	</form>
	<hr>
</body>
</html>