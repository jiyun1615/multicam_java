package 연습문제;

import javax.swing.JOptionPane;

public class 추가문제 {

	public static void main(String[] args) {
		
		
		//추가문제 1
		String a_ = JOptionPane.showInputDialog("연산할 수 1번을 입력하세요");
		String b_ = JOptionPane.showInputDialog("연산할 수 2번을 입력하세요");

		String c_ = JOptionPane.showInputDialog("연산자를 입력하세요");
		
		double a = Double.parseDouble(a_);
		double b = Double.parseDouble(b_);
		
		double answer = 0;
		
		switch (c_) {
		case "+":
			answer = a+b;
			break;
		case "-":
			answer = a-b;
			break;
		case "*": case "x": case "X":
			answer = a*b;
			break;
		case "/":
			answer = a/b;
			break;
		default:
			break;
		}
		
		System.out.println(answer);

		
		//추가문제 2
		String x_ = JOptionPane.showInputDialog("연산할 수 1번을 입력하세요");
		String y_ = JOptionPane.showInputDialog("연산할 수 2번을 입력하세요");
		
		int x = Integer.parseInt(x_);
		int y = Integer.parseInt(y_);
		
		double ans = (double)x/y;
		System.out.printf("%.2f", ans);
		
		
	}

}
