package 상속기본;

public class 카페 {
	public static void main(String[] args) {
		매니저 m = new 매니저();
		m.name = "홍길동";
		m.address = "강남구";
		m.bonus = 10000;
		m.rrn = "010101-2020202";
		m.salary =20000;
		
		System.out.println(m);
	}
}
