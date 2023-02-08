package 순차문;

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

public class 계산기_2 {

	public static void main(String[] args) {
		// JFrame, ImageIcon, JLabel
		// JTextField
		// Font, FlowLayout
		// JButton

		JFrame f = new JFrame();
		f.setSize(300, 500);

		FlowLayout fl = new FlowLayout();
		f.setLayout(fl);

		ImageIcon img = new ImageIcon("011.jpg");
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		JLabel label3 = new JLabel();

		JTextField text1 = new JTextField(10);
		JTextField text2 = new JTextField(10);

		Font font = new Font("d2coding", 1, 30);

		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		JButton b4 = new JButton();

		label1.setIcon(img);
		label2.setText("숫자1");
		label3.setText("숫자2");
		b1.setText("+");
		b2.setText("-");
		b3.setText("x");
		b4.setText("/");

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		label2.setFont(font);
		label3.setFont(font);
		text1.setFont(font);
		text2.setFont(font);

		b1.setForeground(Color.gray);
		b2.setForeground(Color.gray);
		b1.setBackground(Color.white);
		b2.setBackground(Color.white);
		b3.setForeground(Color.gray);
		b4.setForeground(Color.gray);
		b3.setBackground(Color.white);
		b4.setBackground(Color.white);

		f.add(label1);

		f.add(label2);
		f.add(text1);

		f.add(label3);
		f.add(text2);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		
//		String x1_ = text1.getText();
//		String x2_ = text1.getText();
//		
//		int x1 = Integer.parseInt(x1_);
//		int x2 = Integer.parseInt(x2_);
//		int result = 0;
		
		//더하기
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String x1_ = text1.getText();
				String x2_ = text2.getText();
				
				int x1 = Integer.parseInt(x1_);
				int x2 = Integer.parseInt(x2_);
				int result = x1 + x2;
				JOptionPane.showMessageDialog(f, result);
			}
		});
		//빼기
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String x1_ = text1.getText();
				String x2_ = text2.getText();
				
				int x1 = Integer.parseInt(x1_);
				int x2 = Integer.parseInt(x2_);
				int result = x1 - x2;
				JOptionPane.showMessageDialog(f, result);
			}
		});
		//곱
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String x1_ = text1.getText();
				String x2_ = text2.getText();
				
				int x1 = Integer.parseInt(x1_);
				int x2 = Integer.parseInt(x2_);
				int result = x1 * x2;
				JOptionPane.showMessageDialog(f, result);
			}
		});
		//나누기
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String x1_ = text1.getText();
				String x2_ = text2.getText();
				
				int x1 = Integer.parseInt(x1_);
				int x2 = Integer.parseInt(x2_);
				double result = (double)x1 / x2;
				JOptionPane.showMessageDialog(f, String.format("%.2f", result));
			}
		});

		f.setVisible(true);
	}

}
