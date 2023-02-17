package 연습문제;

import java.util.Date;

public class 스레드1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			Date date = new Date();
			System.out.println(date);
			try {
				Thread.sleep(5000);
			} catch (Exception e) {

			}
		}
	}
}
