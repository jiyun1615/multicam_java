package 상속응용;

public class 별내이름동시 {

	public static void main(String[] args) {
		별 star = new 별();
		내이름 name = new 내이름();
		증가스레드 plus = new 증가스레드();
		감소스레드 minus = new 감소스레드();
		
		
		star.start();
		name.start();
		plus.start();
		minus.start();
		
	}

}
