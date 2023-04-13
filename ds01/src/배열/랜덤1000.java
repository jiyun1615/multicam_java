package 배열;

import java.util.Random;

public class 랜덤1000 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[1000];
		for(int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(1000);
		}
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("최댓값은 " + max);
		
	}

}
