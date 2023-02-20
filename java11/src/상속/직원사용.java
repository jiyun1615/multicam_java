package 상속;

import 복습.직원;

public class 직원사용 {

	public static void main(String[] args) {
		직원 work = new 직원();		
		work.name = "홍길동";
//		work.address = "강남구";	//default니까 다른 패키지에서 사용 불가
//		work.salary = 10000;	//protected니까 상속X인 이상 사용 불가
		
		work.getClass();
		
	}

}
