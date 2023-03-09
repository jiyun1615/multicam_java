package 화면DB연결;

import 자바DB연결.MemberDAO2;
import 자바DB연결.MemberVO;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoginUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
//		FlowLayout flow = new FlowLayout();
//		f.setLayout(flow);
		f.getContentPane().setLayout(null);
		Font font = new Font("D2Coding", Font.BOLD, 20);
		Font fontTitle = new Font("D2Coding", Font.BOLD, 30);

		f.setTitle("로그인");

		JTextField text1 = new JTextField(20);
		JTextField text2 = new JTextField(20);

		JLabel l1 = new JLabel("로그인");
		JLabel l2 = new JLabel("아이디");
		JLabel l3 = new JLabel("패스워드");

		JButton b1 = new JButton("로그인");
		JButton b2 = new JButton("회원가입");

		l1.setFont(fontTitle);
		l2.setFont(font);
		l3.setFont(font);
		b1.setFont(font);
		b2.setFont(font);

		l1.setBounds(180, 10, 200, 200);
		l2.setBounds(100, 150, 100, 30);
		text1.setBounds(200, 150, 200, 30);
		l3.setBounds(100, 200, 100, 30);
		text2.setBounds(200, 200, 200, 30);
		b1.setBounds(150, 300, 200, 40);
		b2.setBounds(150, 350, 200, 40);
		
		Color blue = new Color(153, 153, 204);
		Color purple = new Color(204,153,255);
		Color bgColor = new Color(204, 204, 204);
		Color white = new Color(255, 255, 255);
		
		f.getContentPane().setBackground(bgColor);

		l1.setForeground(Color.white);
		l2.setForeground(white);
		l3.setForeground(white);
		
		
		b1.setBackground(blue);
		b1.setForeground(Color.white);
		b2.setBackground(blue);
		b2.setForeground(Color.white);
		
		f.add(l1);
		f.add(l2);
		f.add(text1);
		f.add(l3);
		f.add(text2);
		f.add(b1);
		f.add(b2);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String id = text1.getText();
				String pw = text2.getText();
				if(id.equals("")) {
					JOptionPane.showMessageDialog(f, "id는 필수 입력 항목입니다.");
				}else if(pw.equals("")) {
					JOptionPane.showMessageDialog(f, "pw는 필수 입력 항목입니다.");
				}
				MemberDAO2 dao = new MemberDAO2();
				MemberVO bag = new MemberVO();
				bag.setId(id);
				bag.setPw(pw);

				try {
					int check = dao.login(bag);
					if(check == 1) {
						JOptionPane.showMessageDialog(f, "로그인 성공!");
						BBSUI2 bbs = new BBSUI2();
						bbs.open();
					}else {
						JOptionPane.showMessageDialog(f, "로그인 실패 회원가입하세요!");
						MemberUI3 mem = new MemberUI3();
						mem.open();
					}
				} catch (Exception e1) {
				}

			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MemberUI3 mem = new MemberUI3();
				mem.open();
			}
		});
		
		f.setVisible(true);
	}

}
