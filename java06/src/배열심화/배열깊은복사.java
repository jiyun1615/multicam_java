package 배열심화;

public class 배열깊은복사 {

	public static void main(String[] args) {
		int[] num3 = {100, 200, 300};
//		int[] num4 = num3;				//얕은 복사 -> 주소를 복사
//		System.out.println("num3 : " + num3 + "\nnum4 : " + num4 );
		int[] num4 = num3.clone();		//깊은 복사 -> 값만 복사
		
		System.out.println(num3);
		System.out.println(num4);
		
		num3[0] = 999;
		for(int i=0; i<num3.length; i++) {
			System.out.print(num3[i] + " ");
		}
		System.out.println();
		for(int i=0; i<num4.length; i++) {
			System.out.print(num4[i] + " ");
		}
	}

}
