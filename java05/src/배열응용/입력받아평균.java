package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		//입력 여러번 여러개 받아서 저장공간에 넣고 싶을 때
		
		int[] score = new int[5];
		
		for (int i = 0; i < score.length; i++) {	//배열에 사용자가 값 입력하기
			String data = JOptionPane.showInputDialog("숫자 입력");
			score[i] = Integer.parseInt(data);
		}
		
		for(int x : score) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		
		//1. 합계, 평균
		int sum = 0;
		for(int x : score) {
			sum += x;					//합계
		}
		double avg = (double)sum/score.length;		//평균
		System.out.println("전체 평균 : " + avg);
		
		//2. 300이상 숫자 합
		int sum300 = 0;
		for(int x : score) {
			if(x >= 300) {
				sum300 += x;
			}
		}
		System.out.println("300 이상인 수들의 합 : " + sum300);
		

		//3. (심화) 300이상 위치 index 프린트
		for(int i=0; i<score.length; i++) {
			if(score[i] >= 300) {
				System.out.print((i+1) + " ");		//0부터가 아니라 1부터로 출력함
			}
		}

	}

}
