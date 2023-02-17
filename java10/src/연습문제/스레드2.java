package 연습문제;

import java.util.Random;
import java.util.Scanner;

public class 스레드2 extends Thread {
	public static int cnt = 0;
	@Override
	public void run() {
		Random r = new Random(42);
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 100; i++) {
			cnt = r.nextInt(10);
			System.out.println("예측 숫자 (1~10)를 입력하세요!");
			int k = sc.nextInt();
			if(k == cnt) {
				System.out.println("정답입니다!");
			}else {
				System.out.println("오답입니다.");
				System.out.println("답은 " + cnt + "였습니다!");
			}
			try {
				Thread.sleep(3000);
			} catch (Exception e) {

			}
		}
		
		sc.close();
	}
}
