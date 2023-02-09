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

public class 회원가입연습 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(380, 500);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JLabel logo = new JLabel();
		JLabel l1 = new JLabel("ID");
		JLabel l2 = new JLabel("PW");
		JLabel l3 = new JLabel("이름");
		JLabel l4 = new JLabel("전화번호 ");

		JTextField text1 = new JTextField(20);
		JTextField text2 = new JTextField(20);
		JTextField text3 = new JTextField(20);
		JTextField text4 = new JTextField(20);

		JButton b1 = new JButton("회원가입");

		ImageIcon iconCat = new ImageIcon("냥이1.png");
		ImageIcon iconOk = new ImageIcon("ok.png");

		Font font = new Font("D2Coding", 1, 20);

		logo.setIcon(iconCat);
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		text1.setFont(font);
		text2.setFont(font);
		text3.setFont(font);
		text4.setFont(font);
		b1.setFont(font);
		text1.setBackground(Color.pink);
		text1.setForeground(Color.black);
		text2.setBackground(Color.pink);
		text2.setForeground(Color.black);
		text3.setBackground(Color.pink);
		text3.setForeground(Color.black);
		text4.setBackground(Color.pink);
		text4.setForeground(Color.black);
		b1.setBackground(Color.black);
		b1.setForeground(Color.pink);

		f.add(logo);
		f.add(l1);
		f.add(text1);
		f.add(l2);
		f.add(text2);
		f.add(l3);
		f.add(text3);
		f.add(l4);
		f.add(text4);
		f.add(b1);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = text1.getText();
				String pw = text2.getText();
				String name = text3.getText();
				String phone = text4.getText();

				if (id.equals("") || pw.equals("") || name.equals("") || phone.equals("")) {
					JOptionPane.showMessageDialog(f, "공백없이 입력해주세요!");
				} else {

					JOptionPane.showMessageDialog(f,
							"ID : " + id + "\npw : " + pw + "\n이름 : " + name + "\n전화번호 : " + phone);
					JOptionPane.showMessageDialog(f, name + "님, 회원가입되었습니다.");
					text1.setText(null);
					text2.setText(null);
					text3.setText(null);
					text4.setText(null);
				}

			}
		});

		f.setVisible(true);
	}

}
