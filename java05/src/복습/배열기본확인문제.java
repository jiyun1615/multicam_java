package 복습;

public class 배열기본확인문제 {

	public static void main(String[] args) {
		String[] travel = {"Paris", "Japan", "London", "Vancouver", "Barcelona"};
		char[] color = {'b','g','w','b','s'};
		double[] height = {166.5, 180.2, 178.3, 169.7, 190.3};
		
		for(String x : travel) {
			System.out.println(x);
		}
		System.out.println("--------------------");
		for(char x : color) {
			System.out.println(x);
		}
		System.out.println("--------------------");
		for(double x : height) {
			System.out.println(x);
		}
		
		
		
		
	}

}
