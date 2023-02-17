package 상속응용;

public class PC상황표 {

	public static void main(String[] args) {
		카운트스레드 count = new 카운트스레드();
		카운트스레드2 timer = new 카운트스레드2();
		이미지스레드 image = new 이미지스레드();
		
		image.start();
		count.start();
		timer.start();
		
	}

}
