package 상속응용;

//동시에 실행시키고 싶은 부품인 Thread로 만들어 주세요.
//Thread 클래스 상속하면 바로 만들어짐 
public class 감소스레드 extends Thread {
	
	@Override
	public void run() {
		for(int i=500000; i>0; i--) {
			System.out.println("감소 : " + i);
		}
	}
	
}
