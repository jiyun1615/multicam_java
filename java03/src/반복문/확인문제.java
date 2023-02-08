package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 확인문제 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 400);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton b1 = new JButton("star 10");
		JButton b2 = new JButton("coffee 5");
		JButton b3 = new JButton("latte 3");
		JButton b4 = new JButton("count i");

		Font font = new Font("D2Coding", 1, 40);

		f.getContentPane().setBackground(Color.white);
		b1.setBackground(Color.pink);
		b2.setBackground(Color.black);
		b3.setBackground(Color.pink);
		b4.setBackground(Color.black);

		b1.setForeground(Color.black);
		b2.setForeground(Color.pink);
		b3.setForeground(Color.black);
		b4.setForeground(Color.pink);

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		// 버튼에 액션 넣기
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i=0; i<10; i++) {
					System.out.print("*");
				}
				
				System.out.println("");
			}
		});
		;

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i=0; i<5; i++) {
					System.out.print("coffee ");
				}
				
				System.out.println("");
			}
		});
		;
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i=0; i<3; i++) {
					System.out.println("latte");
				}
			}
		});
		;
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i=0; i<3; i++) {
					System.out.println((i+1) + " count");
				}
			}
		});
		;

		f.setVisible(true);
	}

}
