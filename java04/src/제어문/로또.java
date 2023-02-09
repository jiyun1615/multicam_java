package 제어문;

import java.util.Random;

public class 로또 {

	public static void main(String[] args) {
		Random r = new Random();	//seed
		
		int start = 1;
		for(int i=0; i<6; i++) {
			int num = r.nextInt(10);
			start = start + num;
			System.out.println("lotto : " + (r.nextInt(45)+1)); 	//0~34
		}
		
		
		//1~10
		for(int i=0; i<6; i++) {
			System.out.print((r.nextInt(10)+1) + " ");
		}
		System.out.println();
		//2~20
		for(int i=0; i<6; i++) {
			System.out.print((r.nextInt(20)+2) + " ");
		}
		System.out.println();
		//3~30
		for(int i=0; i<6; i++) {
			System.out.print((r.nextInt(30)+3) + " ");
		}
		System.out.println();
		
	}

}
