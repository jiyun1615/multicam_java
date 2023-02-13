package 배열응용;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼랜덤 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.black);
		f.setSize(1200, 800);
		f.getContentPane().setLayout(null);
		
		JButton[] buttons = new JButton[300];
		for(int i=0; i<buttons.length; i++) {
			buttons[i] = new JButton("b" + i);
		}

		Font font = new Font("D2Coding", 1, 15);
		Random r = new Random();
		for(int i=0; i<buttons.length; i++) {
			int x = r.nextInt(1100);
			int y = r.nextInt(700);
			buttons[i].setBounds(x, y, 100, 50);
			buttons[i].setBackground(Color.pink);
			buttons[i].setForeground(Color.gray);
			buttons[i].setFont(font);
			
			f.getContentPane().add(buttons[i]);
		}
		
		f.setVisible(true);
	}

}
