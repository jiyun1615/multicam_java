package 조건문;

import javax.swing.JOptionPane;

public class 인기조사10명 {

	public static void main(String[] args) {
		
		int IU = 0;
		int BTS = 0;
		int NewJeans = 0;
		
		JOptionPane.showMessageDialog(null, "인기투표를 시작합니다!");
		
		for(int i=0; i<10; i++) {
			String reply = JOptionPane.showInputDialog("1.아이유 2.BTS 3.NewJeans");
			if(reply.equals("1")) {
				IU++;
			} else if(reply.equals("2")) {
				BTS++;
			} else if(reply.equals("3")) {
				NewJeans++;
			} else {
				JOptionPane.showMessageDialog(null, "1~3번을 투표해주세요!");
				i--;
			}
		}
		
		JOptionPane.showMessageDialog(null, "IU : " + IU + "명\nBTS : " 
					+ BTS + "명\nNewJeans : " + NewJeans + "명");
		

	}

}
