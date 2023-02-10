package 배열응용;

import java.util.Random;

public class 수능 {

	public static void main(String[] args) {
		Random r = new Random(42);
		int[] score = new int[10000];
		
		int cnt=0;
		int cnt2 = 0;
		int sum = 0;
		
		System.out.print("만점자 : ");
		for(int i=0; i<score.length; i++) {
			score[i] = r.nextInt(451);
			
			//1.
			if(score[i] == 450) {
				cnt++;
				System.out.print(i + "번 ");
			}
			//2.
			if(score[i] == 0) cnt2++;
			sum += score[i];
		}
		
		System.out.println();
		System.out.println("만점자 수 : " + cnt + "명");
		System.out.println("0점자 수: " + cnt2 + "명");
		
		//3.
		double avg = (double)sum/10000;
		System.out.println("평균 : " + avg + "점");
		
		//4.
		int cnt3=0;
		for(int x : score) {
			if(x <= avg+50 && x >= avg-50) {
				cnt3++;
			}
		}
		System.out.println("평균 범위 내 : " + cnt3 + "명");
		
		
		//30% 범위 내
		int cnt30 = 0;
		double avg2 = (double)(sum*0.3)/3000;
		for(int x : score) {
			if(x >= avg2) {
				cnt30++;
			}
		}

		System.out.println("점수 상위 30 퍼 이상인 사람 수 : " + cnt30);
		
	}

}
