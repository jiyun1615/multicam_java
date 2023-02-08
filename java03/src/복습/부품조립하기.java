package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품조립하기 {

	public static void main(String[] args) {
		//1. 자주 써서 RAM에 언제든 사용할 수 있도록 준비되어 있음
		// 부품명.기능()
		
		//2. 자주X, 쓸때마다 제공되는 틀을 이용해서 찍어내어 여러개 만들어
		//	RAM에 저장해두고 사용
		// 벽돌 b = new 벽돌();
		
		JFrame f = new JFrame();
		f.setSize(500, 300);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel l1 = new JLabel();
		
		JTextField text1 = new JTextField(20);
		
		JButton b1 = new JButton("Button");
		Font font1 = new Font("D2Coding", 1, 20);
		Font font2 = new Font("D2Coding", 1, 30);
		
		
		f.getContentPane().setBackground(Color.white);
		l1.setText("당신이 생각한 숫자를 입력하세요");
		text1.setBackground(Color.pink);
		text1.setForeground(Color.black);
		b1.setBackground(Color.darkGray);
		b1.setForeground(Color.white);
		
		f.add(l1);
		f.add(text1);
		f.add(b1);
		
		l1.setFont(font1);
		b1.setFont(font2);
		text1.setFont(font1);
		
		f.setVisible(true);
		

	}

}
