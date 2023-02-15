package 생성자;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 내코드 {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.name = "치타";
		cat1.gender = "수컷";
		cat1.species = "뱅갈";
		cat1.age = 1;

		Cat cat2 = new Cat();
		cat2.name = "구름이";
		cat2.gender = "암컷";
		cat2.species = "페르시안";
		cat2.age = 2;

		Cat cat3 = new Cat();
		cat3.name = "두부";
		cat3.gender = "암컷";
		cat3.species = "샴";
		cat3.age = 5;

		JFrame f = new JFrame();
		f.setSize(600, 600);
		f.getContentPane().setBackground(Color.white);
		f.getContentPane().setLayout(null);
		f.setTitle("고양이 분양소");

		ImageIcon icon1 = new ImageIcon("뱅갈.png");
		ImageIcon icon2 = new ImageIcon("페르시안.png");
		ImageIcon icon3 = new ImageIcon("샴.png");

		JLabel title = new JLabel("고양이 분양소에 오신 걸 환영합니다.");
		JLabel img1 = new JLabel();
		JLabel img2 = new JLabel();
		JLabel img3 = new JLabel();

		img1.setIcon(icon1);
		img2.setIcon(icon2);
		img3.setIcon(icon3);

		JLabel name1 = new JLabel(cat1.name);
		JLabel name2 = new JLabel(cat2.name);
		JLabel name3 = new JLabel(cat3.name);

		JLabel gender1 = new JLabel(cat1.gender);
		JLabel gender2 = new JLabel(cat2.gender);
		JLabel gender3 = new JLabel(cat3.gender);

		JButton b1 = new JButton("상세보기");
		JButton b2 = new JButton("상세보기");
		JButton b3 = new JButton("상세보기");

		title.setBounds(10, 20, 600, 40);
		img1.setBounds(20, 100, 150, 150);
		img2.setBounds(20, 250, 150, 150);
		img3.setBounds(20, 400, 150, 150);
		name1.setBounds(180, 130, 100, 30);
		name2.setBounds(180, 280, 100, 30);
		name3.setBounds(180, 430, 100, 30);
		gender1.setBounds(280, 130, 100, 30);
		gender2.setBounds(280, 280, 100, 30);
		gender3.setBounds(280, 430, 100, 30);
		b1.setBounds(400, 130, 150, 30);
		b2.setBounds(400, 280, 150, 30);
		b3.setBounds(400, 430, 150, 30);

		Font font1 = new Font("D2Coding", 1, 30);
		Font font2 = new Font("D2Coding", 1, 20);
		Font font3 = new Font("D2Coding", 1, 15);
		title.setFont(font1);
		name1.setFont(font2);
		name2.setFont(font2);
		name3.setFont(font2);
		gender1.setFont(font3);
		gender2.setFont(font3);
		gender3.setFont(font3);
		b1.setFont(font2);
		b2.setFont(font2);
		b3.setFont(font2);

		f.getContentPane().add(title);
		f.getContentPane().add(img1);
		f.getContentPane().add(img2);
		f.getContentPane().add(img3);
		f.getContentPane().add(name1);
		f.getContentPane().add(name2);
		f.getContentPane().add(name3);
		f.getContentPane().add(gender1);
		f.getContentPane().add(gender2);
		f.getContentPane().add(gender3);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, cat1.introduce());

			}
		});
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, cat2.introduce());

			}
		});
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, cat3.introduce());

			}
		});

		f.setVisible(true);
	}

}
