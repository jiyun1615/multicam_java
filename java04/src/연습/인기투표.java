package 연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 인기투표 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 920);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JLabel title = new JLabel("KPOP 투표");
		JLabel l1 = new JLabel();
		JLabel l2 = new JLabel();
		JLabel l3 = new JLabel();
		JLabel l4 = new JLabel();
		JLabel l5 = new JLabel();
		JLabel l6 = new JLabel();

		ImageIcon img1 = new ImageIcon("피엘.jpg");
		ImageIcon img2 = new ImageIcon("bts.jpg");
		ImageIcon img3 = new ImageIcon("omg.jpg");

		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();

		l1.setText("Rosemary-PL");
		l3.setText("ON-BTS");
		l5.setText("OMG-NewJeans");

		b1.setIcon(img1);
		b2.setIcon(img2);
		b3.setIcon(img3);
		
		
		f.getContentPane().setBackground(Color.white);
		b1.setBorder(null);
		b2.setBorder(null);
		b3.setBorder(null);
		b1.setBackground(Color.white);
		b2.setBackground(Color.white);
		b3.setBackground(Color.white);
		l2.setForeground(Color.pink);
		l4.setForeground(Color.pink);
		l6.setForeground(Color.pink);

		Font font1 = new Font("D2Coding", 1, 20);
		Font font2 = new Font("D2Coding", 1, 30);

		title.setFont(font2);
		l1.setFont(font1);
		l2.setFont(font2);
		l3.setFont(font1);
		l4.setFont(font2);
		l5.setFont(font1);
		l6.setFont(font2);

		f.add(title);

		f.add(b1);
		f.add(l1);
		f.add(l2);

		f.add(b2);
		f.add(l3);
		f.add(l4);

		f.add(b3);
		f.add(l5);
		f.add(l6);

		b1.addActionListener(new ActionListener() {
			int i = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				i++;
				l2.setText(i + "표");
				if(i>10) {
					l2.setForeground(Color.red);
				}
			}
		});

		b2.addActionListener(new ActionListener() {
			int i = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				i++;
				l4.setText(i + "표");
				if(i>10) {
					l4.setForeground(Color.red);
				}
			}
		});

		b3.addActionListener(new ActionListener() {
			int i = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				i++;
				l6.setText(i + "표");
				if(i>10) {
					l6.setForeground(Color.red);
				}
			}
		});

		f.setVisible(true);

	}

}
