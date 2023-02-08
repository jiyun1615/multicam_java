package 확인문제;

import java.util.Scanner;

public class 심화문제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("더하기를 시작할 정수를 입력하세요 : ");
		int start = sc.nextInt();
		
		int end = 0;
		for(;;) {
			System.out.print("더하기를 끝낼 정수를 입력하세요 : ");
			end = sc.nextInt();
			if(end > start) {
				break;
			}
			else {
				System.out.println("시작 정수보다 큰 수를 입력하세요!");
			}
		}
		
		int result = 0;
		for(int i=start; i<=end; i++) {
			result += i;
		}
		System.out.println(start + "부터 " + end + "까지의 합은 " + result + "입니다.");
		
	}

}
