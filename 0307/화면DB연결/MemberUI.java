package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MemberUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 600);
//		FlowLayout flow = new FlowLayout();
//		f.setLayout(flow);
		f.getContentPane().setBackground(Color.pink);
		f.getContentPane().setLayout(null);
		Font font = new Font("D2Coding", Font.BOLD, 20);
		
		f.setTitle("회원가입");
		
		JTextField text1 = new JTextField(20);
		JTextField text2 = new JTextField(20);
		JTextField text3 = new JTextField(20);
		JTextField text4 = new JTextField(20);
		
		JLabel l1 = new JLabel("회원가입화면");
		JLabel l2 = new JLabel("아이디");
		JLabel l3 = new JLabel("패스워드");
		JLabel l4 = new JLabel("이름");
		JLabel l5 = new JLabel("전화번호");
		
		JButton b1 = new JButton("회원가입");
		JButton b2 = new JButton("회원탈퇴");

		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		b1.setFont(font);
		b2.setFont(font);

		l1.setBounds(180, 10, 200, 200);
		l1.setBackground(Color.white);
		l2.setBounds(100, 150, 100, 30);
		text1.setBounds(200, 150, 200, 30);		
		l3.setBounds(100, 200, 100, 30);
		text2.setBounds(200, 200, 200, 30);	
		l4.setBounds(100, 250, 100, 30);
		text3.setBounds(200, 250, 200, 30);	
		l5.setBounds(100, 300, 100, 30);
		text4.setBounds(200, 300, 200, 30);	
		b1.setBounds(150, 400, 200, 40);
		b2.setBounds(150, 450, 200, 40);
		
		b1.setBackground(Color.white);
		b2.setBackground(Color.white);
		
		f.add(l1);
		f.add(l2);
		f.add(text1);
		f.add(l3);
		f.add(text2);
		f.add(l4);
		f.add(text3);
		f.add(l5);
		f.add(text4);
		f.add(b1);
		f.add(b2);
		
		
		f.setVisible(true);
	}

}
