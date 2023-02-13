package 배열복습;

import java.util.Arrays;
import java.util.Random;

public class 배열정렬순위 {

	public static void main(String[] args) {
		Random r = new Random(42);
		int[] score = new int[10000];
		
		for(int i=0; i<score.length; i++) {
			score[i] = r.nextInt(1000) + 1;
		}
		//정렬
		Arrays.sort(score);
		for(int x : score) {
			System.out.println(x);
		}
		
		//최대, 최솟값
		System.out.println("최솟값 : " + score[0]);
		System.out.println("최댓값 : " + score[score.length-1]);
		
		//상위 30% = 3000;
		int sum30 = 0;
		for(int i = (int)(score.length*0.7); i<score.length; i++) {
			sum30 = sum30 + score[i];
		}
		System.out.println("상위 30% 평균 : " + sum30/3000);
		
		
		int sumDown30 = 0;
		for(int i=0; i<(score.length*0.3); i++) {
			sumDown30 = sumDown30 + score[i];
		}
		
		System.out.println("하위 30% 평균 : " + sumDown30/3000);
	}

}
