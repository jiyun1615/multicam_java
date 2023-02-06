package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		// 산술연산자 (사칙연산자, + - * / %)
		int x = 20;
		int y = 10;

		System.out.println("x + y = " + (x + y)); // + x + y 로 하면 2010 으로 나옴
		System.out.println("x - y = " + (x - y)); // + x - y 로 하면 에러
		System.out.println("x * y = " + x * y);
		System.out.println("x / y = " + x / y);
		System.out.println("x % y = " + x % y);
		System.out.println();
		System.out.println("x == y ? " + (x == y));
		System.out.println("x != y ? " + (x != y));
		System.out.println("x > y ? " + (x > y));
		System.out.println("x >= y ? " + (x >= y));

	}

}
