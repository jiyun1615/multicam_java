package 상속응용;

import java.util.Date;

public class 카운트스레드2 extends Thread {
	@Override
	public void run() {
		for (int i = 500; i > 0; i--) {
			Date date = new Date();
			System.out.println("카운트 >> " + date);
			// 스레드에 텀 두기
			try {
				Thread.sleep(1000);  	//1초
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
