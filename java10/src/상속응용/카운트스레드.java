package 상속응용;

public class 카운트스레드 extends Thread {
	@Override
	public void run() {
		for (int i = 500; i > 0; i--) {
			System.out.println("카운트 >> " + i);
			// 스레드에 텀 두기
			try {
				Thread.sleep(1000);  	//1초
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
