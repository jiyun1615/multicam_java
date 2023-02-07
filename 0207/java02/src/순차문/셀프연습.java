package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 셀프연습 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1200,400);
		FlowLayout fl = new FlowLayout();
		f.setLayout(fl);
		
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		JTextField text1 = new JTextField(20);
		JTextField text2 = new JTextField(20);
		
		ImageIcon icon1 = new ImageIcon("냥이1.png");
		ImageIcon icon2 = new ImageIcon("냥이2.png");
		
		b1.setIcon(icon1);
		b2.setIcon(icon2);
		
		
//		
//		b1.setText("b1");
//		b2.setText("b2");
		label1.setText("냥이1");
		label2.setText("냥이2");
		
		
		b1.setBackground(Color.lightGray);
		b1.setForeground(Color.black);
		b2.setBackground(Color.lightGray);
		b2.setForeground(Color.black);
		
		
		f.add(label1);
		f.add(text1);
		f.add(b1);
		
		f.add(label2);
		f.add(text2);
		f.add(b2);
		
		f.setVisible(true);
		

	}

}
