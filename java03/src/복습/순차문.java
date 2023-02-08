package 복습;

import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		//입력 -> 처리 -> 출력
		//두개의 숫자를 입력받아 처리, 출력
		
		String n1 = JOptionPane.showInputDialog("숫자 1 입력");
		String n2 = JOptionPane.showInputDialog("숫자 2 입력");
		
		int n11 = Integer.parseInt(n1);
		int n22 = Integer.parseInt(n2);
		
		//정수와 정수의 연산의 결과는 무조건 정수 -> 반면 하나라도 실수이면 결과는 무조건 실수!
		System.out.println((double)n11/n22);
	}

}
