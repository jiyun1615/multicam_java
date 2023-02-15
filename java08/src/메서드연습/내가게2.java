package 메서드연습;

public class 내가게2 {

	public static void main(String[] args) {
		계산기2 cal2 = new 계산기2();
		int result = cal2.add(10, 10);
		double result1 = cal2.add(10.3, 10);
		double result2 = cal2.add(10.4, 10.5);
		String result3 = cal2.add("10001", 22);
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		

	}

}
