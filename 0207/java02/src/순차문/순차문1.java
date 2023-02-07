package 순차문;

import javax.swing.JOptionPane;

public class 순차문1 {

	public static void main(String[] args) {
		String data1 = JOptionPane.showInputDialog("정수를 입력하시오 - 1");
		String data2 = JOptionPane.showInputDialog("정수를 입력하시오 - 2");

		Integer.parseInt(data1);
		Integer.parseInt(data2);

		String result = data1 + data2;

		System.out.println(result);

	}

}
