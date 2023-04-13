package 배열;

import java.util.Scanner;

public class 배열입력2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] arr = new double[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}

		for (double a : arr) {
			System.out.println(a);
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 22.2) {
				System.out.println("22.2의 위치는 " + (i + 1));
			}else if(arr[i] == 33.3) {
				System.out.println("33.3의 위치는 " + (i+1));
			}
		}

		sc.close();
	}

}
