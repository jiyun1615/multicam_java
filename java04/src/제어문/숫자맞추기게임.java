package 제어문;

import java.util.Random;
import java.util.Scanner;

public class 숫자맞추기게임 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int n = r.nextInt(100);
		System.out.println("숫자맞추기 게임입니다!");

		int num = 0;
		int cnt = 0;
		
		while(true) {
			System.out.print("당신이 생각한 숫자를 입력해주세요 : ");
			num = sc.nextInt();
			if(num == n) {
				System.out.print("정답입니다!!");
				System.out.print("당신이 시도한 횟수는 " + cnt + "번 입니다.");
				break;
			}else {
				cnt++;
				if(num < n) {
					System.out.println("비교적 작습니다.");
				}
				else {
					System.out.println("정답보다 큽니다.");
				}
			}
		}
		
		sc.close();
	}

}
