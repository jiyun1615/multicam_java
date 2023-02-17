package 상속응용;

public class 별 extends Thread {
	
	@Override
	public void run() {
		for(int i=0; i< 500000; i++) {
			System.out.println("*");
		}
	}
}
