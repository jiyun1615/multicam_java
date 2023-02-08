package 확인문제;

import java.util.Scanner;

public class 심화문제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 정수를 입력하세요 : ");
		int start = sc.nextInt();
		System.out.print("끝 정수를 입력하세요 : ");
		int end = sc.nextInt();
		System.out.print("얼마만큼씩 증가할까요? : ");
		int jump = sc.nextInt();
		
		int sum = 0;
		for(int i=start; i<=end; i+=jump) {
			sum += i;
			if(sum > 100) {
				System.out.println("더한 값이 100을 넘어 종료합니다.");
				break;
			}
		}
		
		System.out.println(jump + "만큼 증가하며 더한 값은 " + sum + "입니다.");

	}

}
