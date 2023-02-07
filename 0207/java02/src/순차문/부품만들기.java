package 순차문;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 부품만들기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 600);
	
		JButton b1 = new JButton();
		b1.setText("Button1");
		f.add(b1);
		
		
		//보여줄 것인지 결정 -> 맨 끝이어야함
		f.setVisible(true);

	}

}
