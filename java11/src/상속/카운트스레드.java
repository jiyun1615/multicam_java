package 상속;

public class 카운트스레드 extends Thread { //run()

	@Override
	public void run() {
		for (int i = 500; i > 0; i--) {
			System.out.println("카운트>> " + i);
			try {
				Thread.sleep(2000); //2초재워라!
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김.");
			}
		}
	}
}
