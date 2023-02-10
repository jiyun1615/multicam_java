package 배열기본;

import java.util.Random;

public class 많은양2 {

	public static void main(String[] args) {
		int[] score2 = new int[1000];
		
		Random r = new Random(42);
		
		for(int i=0; i<score2.length; i++) {
			score2[i] = r.nextInt(19)+2;		//임의의 값 넣기
		}
		
		int cnt = 0;
		int sum = 0;
		for(int x : score2) {
			System.out.println(x);
			if(x>=15) cnt++;				//3이상인 수 몇개인지
			if(x>=15) {
				sum += x;
			}
		}
		
		System.out.println("===================");
		System.out.println("15이상인 수의 갯수 :" + cnt);
		System.out.println("15이상인 수의 합 : " + sum);
		
	}

}
