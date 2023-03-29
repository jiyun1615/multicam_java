<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>책 등록 화면입니다</h3>
	<form action="insert3.multi">
	도서명 : <input name = "name" value="오만과편견">
	도서 url : <input name = "url" value="https://www.aladin.co.kr/shop/wproduct.aspx?ItemId=436838">
	도서 이미지 : <input name = "img" value="prideAndPrejudice.png">
	<button type="submit">등록</button>
	</form>
	
	<hr>
	
	<h3>책 삭제 화면입니다</h3>
	<form action="delete3.multi">
	도서id : <input name = "id" value="1">
	<button type="submit">삭제</button>
	</form>
	
	<hr>
	
	<h3>책 검색 화면입니다</h3>
	<form action="one3.multi">
	도서id : <input name = "id" value="1">
	<button type="submit">검색</button>
	</form>
</body>
</html>