package 확인문제;

public class 문제풀이2 {

	public static void main(String[] args) {
		double x = 33.3;
		double y = 22.2;
		
		boolean result = (x == 44.2);
		boolean result1 = (x == y);
		boolean result2 = (y > 55);
		
		System.out.println("x 가 44.2와 동일한가요? " + result);
		System.out.println("x 가 y와 동일한가요? " + result1);
		System.out.println("y 가 55보다 큰가요? " + result2);

	}

}
