package 확인문제;

import javax.swing.JOptionPane;

public class 문제4 {

	public static void main(String[] args) {
		int year = 2023;
		double time = 1.1;
		String hobby = JOptionPane.showInputDialog("당신의 취미는 무엇인가요?");
		String result = year + "년, 당신의 취미는 " + hobby + "입니다.";
		String result1 = "하루에 " + hobby + "를 " + time + "시간만큼 합니다."; 
		System.out.println(result);
		System.out.println(result1);
		
		

	}

}
