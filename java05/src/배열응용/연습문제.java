package 배열응용;

import java.util.Scanner;

public class 연습문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//1
		
		int[] arr = new int[5];
		System.out.print("5개의 정수를 입력해주세요 : ");
		for(int i =0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("첫번째, 세번째 값의 합은 : " + (arr[0] + arr[2]) + " 입니다.");
		//2
		String[] arr2 = new String[3];
		System.out.println("3개의 String 값을 입력해주세요");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.next();
		}
		System.out.println(arr2[0] + " 보다는 " + arr2[1]);

	}

}
