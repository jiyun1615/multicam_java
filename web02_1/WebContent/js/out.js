function 로그인(){
	var id2 = 'root';
	id = prompt('아이디 입력')
	if(id == id2){
		alert('로그인 성공')
	}else{
		alert('로그인 실패')
	}
}

function 비교(){
	n1 = 100
	n2 = 200
	
	//두 수의 크기 비교 
	if(n1 == n2){
		alert('두 수가 같습니다.')
	}else{
		alert('두 수가 같지 않습니다.')
	}
	
	mood1 = prompt('친구의 기분')
	mood2 = prompt('나의 기분')
	
	if(mood1 == mood2){
		alert('둘의 기분이 같네요')
	}else{
		alert('둘의 기분이 다르네요!')
	}
	
}