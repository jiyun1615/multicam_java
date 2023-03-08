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

public class MemberUI2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 700);
//		FlowLayout flow = new FlowLayout();
//		f.setLayout(flow);
		f.getContentPane().setLayout(null);
		Font font = new Font("D2Coding", Font.BOLD, 20);
		Font fontTitle = new Font("D2Coding", Font.BOLD, 30);

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
		JButton b3 = new JButton("전화번호수정");

		l1.setFont(fontTitle);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);

		l1.setBounds(180, 10, 200, 200);
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
		b3.setBounds(150, 500, 200, 40);
		
		Color blue = new Color(153, 153, 204);
		Color purple = new Color(204,153,204);
		Color darkpink = new Color(204, 153, 153);
		Color white = new Color(255, 255, 255);
		
		f.getContentPane().setBackground(darkpink);

		l1.setForeground(Color.white);
		l2.setForeground(white);
		l3.setForeground(white);
		l4.setForeground(white);
		l5.setForeground(white);
		
		
		b1.setBackground(blue);
		b1.setForeground(Color.white);
		b2.setBackground(blue);
		b2.setForeground(Color.white);
		b3.setBackground(blue);
		b3.setForeground(Color.white);
		
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
		f.add(b3);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String id = text1.getText();
				String pw = text2.getText();
				String name = text3.getText();
				String tel = text4.getText();
				if(id.equals("")) {
					JOptionPane.showMessageDialog(f, "id는 필수 입력 항목입니다.");
				}
				MemberDAO2 dao = new MemberDAO2();
				MemberVO bag = new MemberVO();
				bag.setId(id);
				bag.setPw(pw);
				bag.setName(name);
				bag.setTel(tel);

				try {
					int insertR = dao.insert(bag);
					if(insertR != 0) {
						JOptionPane.showMessageDialog(f, "insert 성공!");
					}else {
						JOptionPane.showMessageDialog(f, "재입력해주세요!");
					}
				} catch (Exception e1) {
				}

			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MemberDAO2 dao = new MemberDAO2();
				String id = text1.getText();
				MemberVO bag = new MemberVO();
				bag.setId(id);

				try {
					int deleteR = dao.delete(bag);
					if(deleteR != 0) {
						JOptionPane.showMessageDialog(f, "delete 성공!");
					}else {
						JOptionPane.showMessageDialog(f, "재입력해주세요!");
					}
				} catch (Exception e1) {
				}

			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MemberDAO2 dao = new MemberDAO2();
				String id = text1.getText();
				String tel = text4.getText();
				MemberVO bag = new MemberVO();
				bag.setId(id);
				bag.setTel(tel);

				try {
					int updateR = dao.update(bag);
					if(updateR != 0) {
						JOptionPane.showMessageDialog(f, "update 성공!");
					}else {
						JOptionPane.showMessageDialog(f, "재입력해주세요!");
					}
					
				} catch (Exception e1) {

				}

			}
		});

		f.setVisible(true);
	}

}
