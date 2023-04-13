package 배열;

import java.util.Scanner;

public class 배열입력4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] arr = new double[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}

		for (double a : arr) {
			System.out.println(a);
		}

		int cnt =0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 22.2) {
				cnt++;
			}
		}
		System.out.println("22.2의 개수는 " + cnt);

		sc.close();
	}

}
