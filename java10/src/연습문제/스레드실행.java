package 연습문제;

public class 스레드실행 {

	public static void main(String[] args) {
		스레드1 s1 = new 스레드1();
		스레드2 s2 = new 스레드2();
		
		s1.start();
		s2.start();
		

	}

}
