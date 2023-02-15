package 메서드연습;

import java.util.Scanner;

public class 계산기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("더할 값 두개를 입력해주세요 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		계산기Class cal = new 계산기Class();
		cal.더하기(x, y);
		
		System.out.print("곱할 값 세개를 입력해주세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		cal.곱하기(a, b, c);
		
		
		sc.close();

	}

}
