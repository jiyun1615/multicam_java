package 상속;

public class 예외처리 {

	public static void main(String[] args) {
		System.out.println("1.프린트 가능");
		try {
			//에러가 발생할 거 같은 코드 넣기
			System.out.println("2. 문제발생코드 >>" + 1/0);
		}catch(Exception e){
			//문제 발생시, 프로그램 멈추지 말고 어떻게 처리할지 적는 곳.
			System.out.println("에러 발생");
		}
		
		System.out.println("3.프린트되나요?");
		
	}

}
