package 조건문;

import javax.swing.JOptionPane;

public class 설문조사10명 {

	public static void main(String[] args) {
		
		int full = 0;
		int noFull = 0;
		
		for(int i=0; i<10; i++) {
			String reply = JOptionPane.showInputDialog("배가 부른가요? (y/n)");
			if(reply.equals("y") || reply.equals("Y")) {
				full ++;
			}
			else if(reply.equals("n") || reply.equals("N")) {
				noFull ++;
			} else {
				JOptionPane.showInputDialog("y 나 n 을 입력해주세요!");
				i--;
			}
		}
		
		System.out.println("배부른 사람 : " + full + "명");
		System.out.println("배부르지 않은 사람 : " + noFull + "명");
		

	}

}
