package 배열심화;

public class practice {

	public static void main(String[] args) {
		int[] num1 = {100, 200, 300};
		int[] num2 = num1;    //얕은복사
		System.out.println("num1 : " + num1 + "\nnum2 : " + num2 );
		
		num1[0] = 1;
		for(int i=0; i<num1.length; i++) {
			System.out.print(num1[i] + " ");
		}
		System.out.println();
		for(int i=0; i<num2.length; i++) {
			System.out.print(num2[i] + " ");
		}
	}

}
