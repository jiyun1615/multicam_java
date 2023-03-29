<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>게시판 작성 화면입니다.</h3>
	<hr>
	<form action="insert2" method="get">
		title : <input name="title" value="제목"><br>
		 content : <input name="content" value="내용 라라라"><br> 
		 writer : <input name="writer" value="홍길동"><br>
		<button type="submit">작성</button>
	</form>


	<h3>게시판수정 화면입니다.</h3>
	<hr>
	<form action="update2" method="get">
		no : <input name="no" value="7"><br> 
		content : <input name="content" value="내용바꾼다ㅏ"><br>
		<button type="submit">서버로 전송</button>
	</form>
	<hr>

	<h3>게시판 삭제 화면입니다.</h3>
	<hr>
	<form action="delete2" method="get">
		no : <input name="no" value="7"><br>
		<button type="submit">서버로 전송</button>
	</form>
	<hr>

	<h3>게시판검색 화면입니다.</h3>
	<hr>
	<form action="one2" method="get">
		no: <input name="no" value="7"><br>
		<button type="submit">서버로 전송</button>
	</form>
	<hr>
</body>
</html>