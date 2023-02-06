package 제어문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		String excercise = JOptionPane.showInputDialog("당신이 가장 좋아하는 운동은?");
		String day = JOptionPane.showInputDialog("당신이 운동하기 좋아하는 요일은?");

		String result = day + "에 당신은 " + excercise + "를 합니다.";
		
		System.out.println(result);

	}

}
