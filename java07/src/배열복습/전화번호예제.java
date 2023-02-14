package 배열복습;

import java.util.Scanner;

public class 전화번호예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("전화번호 입력 : ");
		String s = sc.next();
		
		//1. 공백 제거
		String s2 = s.trim();
		System.out.println(s2);
		
		//2. -을 기준으로 분리
		String[] s3 = s2.split("-");
		
		//3.통신사 분리
		if(s3[0].equals("011")) {
			System.out.println("SK");
		}else if(s3[0].equals("019")) {
			System.out.println("LG");
		}else {
			System.out.println("Apple");
		}
		
		//4. 최신 vs 올드
		if(s3[1].length() >= 4) {
			System.out.println("최신폰이네요!");
		}else {
			System.out.println("올드폰이네요!");
		}
		
		//5. 유효?
		int cnt = (s3[0]+s3[1]+s3[2]).length();
		if(cnt < 10) {
			System.out.println("유효하지 않은 번호입니다.");
		}else {
			System.out.println("유효한 전화번호입니다. ");
		}
		
		sc.close();

	}

}
