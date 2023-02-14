package 부품응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 600);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		Font font = new Font("D2Coding", 1, 20);
		
		f.setTitle("내 일기장 로그인");
		
		JLabel imgL = new JLabel();
		JLabel l1 = new JLabel("아이디 : ");
		JLabel l2 = new JLabel("패스워드 : ");
		
		JTextField t1 = new JTextField(20);
		JTextField t2 = new JTextField(20);
		
		JButton btnLogin = new JButton();
		JButton btnReset = new JButton();
		
		ImageIcon img1 = new ImageIcon("diary.png");
		ImageIcon imgLogin = new ImageIcon("login.png");
		ImageIcon imgReset = new ImageIcon("reset2.png");
		
		l1.setFont(font);
		l2.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		
		Color bgColor = new Color(204, 102, 102);
		
		btnLogin.setBorder(null);
		btnReset.setBorder(null);
		
		f.getContentPane().setBackground(bgColor);
		l1.setForeground(Color.white);
		l2.setForeground(Color.white);
		
		
		imgL.setIcon(img1);
		btnLogin.setIcon(imgLogin);
		btnReset.setIcon(imgReset);
		
		
		f.add(imgL);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(btnLogin);
		f.add(btnReset);
		
		
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(t1.getText().equals("root") && t2.getText().equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공");
					//일기장쓰기 부품의 open() 기능
					일기장쓰기 diary = new 일기장쓰기();
					f.setVisible(false);
					diary.open();
					
				}else {
					JOptionPane.showMessageDialog(f, "아이디나 비밀번호가 일치하지 않습니다.");
				}
				
			}
		});
		
		btnReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
				
			}
		});
		
		
		f.setVisible(true);
	}

}
