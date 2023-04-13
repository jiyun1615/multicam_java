package 배열;

import java.util.Random;

public class 랜덤배열값 {

	public static void main(String[] args) {
		Random r = new Random(100);	
		int[] arr = new int[1000];
		
		for(int i=0; i<1000; i++) {
			arr[i] = r.nextInt(100);
		}
		
		for(int a : arr) {
			System.out.println(a);
		}
	}

}
