package 복습;

import javax.swing.JOptionPane;

public class Practice_BMI {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("이름이 무엇인가요?");
		String height_s = JOptionPane.showInputDialog("키가 얼마인가요?");
		String weight_s = JOptionPane.showInputDialog("몸무게는 얼마인가요?");
		
		JOptionPane.showMessageDialog(null, "안녕");
		
		double height = Double.parseDouble(height_s);
		double weight = Double.parseDouble(weight_s);
		
		double BMI = (height - weight)* 0.9;
		
		String answer = name + "님의 BMI 는 " + BMI + "입니다.";
		
		System.out.println(answer);
		
	}

}
