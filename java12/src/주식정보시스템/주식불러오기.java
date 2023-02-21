package 주식정보시스템;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 주식불러오기 {
	static String code;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setLayout(null);
		f.setTitle("My Stock");
		f.getContentPane().setBackground(Color.white);
		f.setSize(300, 600);
		
		JButton b1 = new JButton("삼성전자");
		JButton b2 = new JButton("카카오");
		JButton b3 = new JButton("네이버");
		
		JLabel l1 = new JLabel("Code");
		JTextField text1 = new JTextField(10);
		JButton b4 = new JButton("크롤링 시작");
		
		JLabel show1 = new JLabel();
		JLabel show2 = new JLabel();
		JLabel show3 = new JLabel();
		JLabel show4 = new JLabel();
		JLabel show5 = new JLabel();
		JLabel show6 = new JLabel();
		
		Font font = new Font("D2Coding", 1, 20);
		Font fontShow = new Font("D2Coding", 1, 15);
		
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		l1.setFont(font);
		text1.setFont(fontShow);
		show1.setFont(fontShow);
		show2.setFont(fontShow);
		show3.setFont(fontShow);
		show4.setFont(fontShow);
		show5.setFont(fontShow);
		show6.setFont(fontShow);
		
		b1.setBounds(70, 40, 150, 40);
		b2.setBounds(70, 100, 150, 40);
		b3.setBounds(70, 160, 150, 40);
		l1.setBounds(120, 220, 200, 40);
		text1.setBounds(70, 260, 150, 40);
		b4.setBounds(70, 310, 150, 40);
		show1.setBounds(70, 360, 300, 30);
		show2.setBounds(70, 390, 300, 30);
		show3.setBounds(70, 420, 300, 30);
		show4.setBounds(70, 450, 300, 30);
		show5.setBounds(70, 480, 300, 30);
		show6.setBounds(70, 510, 300, 30);
		
		Color bgColor = new Color(153, 153, 204);
		Color fgColor = new Color(255, 255, 255);
		Color bgColor1 = new Color(204, 153, 153);
		Color fgColor1 = new Color(255, 255, 255);
		b1.setBackground(bgColor);
		b1.setForeground(fgColor);
		b2.setBackground(bgColor);
		b2.setForeground(fgColor);
		b3.setBackground(bgColor);
		b3.setForeground(fgColor);
		b4.setBackground(bgColor1);
		b4.setForeground(fgColor1);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(l1);
		f.add(text1);
		f.add(b4);
		f.add(show1);
		f.add(show2);
		f.add(show3);
		f.add(show4);
		f.add(show5);
		f.add(show6);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {// TODO Auto-generated method stub
				code = "005930";
				Croller2 c = new Croller2(code);
				show1.setText(c.CrollName());
				show2.setText(c.CrollCode());
				show3.setText(c.CrollPrice());
				show4.setText(c.CrollSell());
				show5.setText(c.CrollHigh());
				show6.setText(c.CrollLow());
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {// TODO Auto-generated method stub
				code = "035720";
				Croller2 c = new Croller2(code);
				show1.setText(c.CrollName());
				show2.setText(c.CrollCode());
				show3.setText(c.CrollPrice());
				show4.setText(c.CrollSell());
				show5.setText(c.CrollHigh());
				show6.setText(c.CrollLow());
			}
		});
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {// TODO Auto-generated method stub
				code = "035420";
				Croller2 c = new Croller2(code);
				show1.setText(c.CrollName());
				show2.setText(c.CrollCode());
				show3.setText(c.CrollPrice());
				show4.setText(c.CrollSell());
				show5.setText(c.CrollHigh());
				show6.setText(c.CrollLow());
			}
		});
		
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {// TODO Auto-generated method stub
				code = text1.getText();
				Croller2 c = new Croller2(code);
				show1.setText(c.CrollName());
				show2.setText(c.CrollCode());
				show3.setText(c.CrollPrice());
				show4.setText(c.CrollSell());
				show5.setText(c.CrollHigh());
				show6.setText(c.CrollLow());
			}
		});
		
		f.setVisible(true);
		
	}

}
