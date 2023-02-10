package 배열응용;

public class 여러개배열 {

	public static void main(String[] args) {
		String[] family = {"아버지", "어머니", "형", "나"};
		int[] age = {100, 50, 30, 25};
		double[] height = {175.5, 150.5, 180.5, 165.5};
		

		System.out.println("이름\t나이\t키");
		System.out.println("------------------");
		
		for (int i = 0; i < family.length; i++) {
			System.out.println(family[i] + "\t" + age[i] + "\t" + height[i]);	
		}

	}

}
