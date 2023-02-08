package 반복문;

import javax.swing.JOptionPane;

public class 누적연습2 {

	public static void main(String[] args) {

		// 1. 숫자누적
		int sum = 0;
		for (int i = 5; i <= 300; i++) {
			if (i % 5 == 0) {
				sum += i;
			}
		}

		System.out.println("5~300까지 5의 배수의 합은 " + sum + "입니다.");

		// 2.문자누적
		String foods = "";
		for (int i = 0; i < 4; i++) {
			String food = JOptionPane.showInputDialog("먹고싶은 음식을 입력해 주세요!");
			foods += food + " ";
		}
		
		System.out.println("당신이 먹고 싶은 음식은 " + foods + "들이군요!");
	}

}
