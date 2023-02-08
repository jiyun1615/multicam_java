package 연습;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;
import javax.swing.JFrame;

public class 부품만들기2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 600);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		//선언부
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		
		JLabel text1 = new JLabel();
		JLabel text2 = new JLabel();
		
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		
		Font font = new Font("", 1, 20);
		
		text1.setFont(font);
		text2.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		
		b1.setText("Button1");
		b2.setText("Button2");
		text1.setText("ID");
		text2.setText("PW");
		
		f.add(text1);
		f.add(input1);
		f.add(b1);
		f.add(text2);
		f.add(input2);
		f.add(b2);
		
		
		
		
		//보여줄 것인지 결정 -> 맨 끝이어야함
		f.setVisible(true);

	}

}
