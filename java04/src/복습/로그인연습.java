package 복습;

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

public class 로그인연습 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(460, 500);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel l1 = new JLabel("ID : ");
		JLabel l2 = new JLabel("PW : ");
		JLabel l3 = new JLabel();
		JLabel l4 = new JLabel();
		
		JTextField text1 = new JTextField(20);
		JTextField text2 = new JTextField(20);
		JTextField text3 = new JTextField();
		JTextField text4 = new JTextField();
		
		JButton b1 = new JButton();
		
		ImageIcon icon = new ImageIcon("로그인.png");
		ImageIcon iconNo = new ImageIcon("no.png");
		ImageIcon iconOk = new ImageIcon("ok.png");
		
		Font font = new Font("D2Coding", 1, 20);
		
		b1.setIcon(icon);
		l1.setFont(font);
		l2.setFont(font);
		text1.setFont(font);
		text2.setFont(font);
		text1.setBackground(Color.pink);
		text1.setForeground(Color.black);
		text2.setBackground(Color.pink);
		text2.setForeground(Color.black);
		l3.setForeground(Color.red);
		
		
		f.add(l1);
		f.add(text1);
		f.add(l2);
		f.add(text2);
		f.add(l3);
		f.add(b1);
		
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = text1.getText();
				String pw = text2.getText();
				
				if(id.equals("root") && pw.equals("1234")) {
//					JOptionPane.showMessageDialog(f, "로그인 성공!");
//					l3.setText("");
					l3.setIcon(iconOk);
				}else {
					text1.setText(null);
					text2.setText(null);
//					l3.setText("비밀번호나 아이디 오류입니다.");
					l3.setIcon(iconNo);
					
				}
				
				
			}
		});
		
		
		
		f.setVisible(true);
	}

}
