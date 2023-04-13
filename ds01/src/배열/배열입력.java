package 배열;

import java.util.Scanner;

public class 배열입력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[4];
	for(int i=0; i<4; i++	) {
		arr[i] = sc.nextInt();
	}
	
	/*
	 * for(int a : arr) { System.out.println(a); }
	 */
	
	for(int i=0; i<arr.length; i++) {
		if(arr[i] == 33) {
			System.out.println("위치는 " + (i+1));
		}
	}
		
		sc.close();
	}

}
