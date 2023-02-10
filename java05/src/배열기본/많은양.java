package 배열기본;

import java.util.Random;

public class 많은양 {

	public static void main(String[] args) {
		int[] score = new int[99];
		for(int x : score) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");

		Random r = new Random();
//		int data = r.nextInt(4);	//0~3
		int data = r.nextInt(4) + 1;	//1~4
//		System.out.println(data);
		
		for (int i = 0; i < score.length; i++) {
			score[i] = r.nextInt(4) + 1;
		}
		
		for(int x : score) {
			System.out.println(x);
		}
		
	}

}
