package 순차문;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 영화좌석 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(350, 500);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		for (int i = 0; i < 50; i++) {
			JButton b = new JButton((i+1)+"번");
			f.add(b);
		}
		f.setVisible(true);

	}

}
