package Hotel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TravelMainUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(980, 600);
//		FlowLayout flow = new FlowLayout();
//		f.setLayout(flow);
		f.getContentPane().setLayout(null);
		Font font = new Font("D2Coding", Font.BOLD, 20);
		Font fontTitle = new Font("D2Coding", Font.BOLD, 30);

		f.setTitle("메인화면");

		JLabel l1 = new JLabel("TravelInfo");

		JButton b1 = new JButton("호텔");
		JButton b2 = new JButton("항공");
		JButton b3 = new JButton("음식점");
		JButton b4 = new JButton("즐길거리");
		JButton b5 = new JButton("여행스토리");
		JButton b_login = new JButton("login");

		l1.setFont(fontTitle);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);
		b_login.setFont(font);

		int x = 40;
		l1.setBounds(20, 10, 300, 40);
		b1.setBounds(x, 60, 150, 40);
		b2.setBounds(x + 180, 60, 150, 40);
		b3.setBounds(x + 360, 60, 150, 40);
		b4.setBounds(x + 540, 60, 150, 40);
		b5.setBounds(x + 720, 60, 150, 40);
		b_login.setBounds(800, 10, 80, 30);

		Color titleC = new Color(102, 204, 153);
		Color b_loginC = new Color(102, 102, 102);
		Color bgColor = new Color(255, 255, 255);
		Color blue = new Color(102, 153, 204);

		f.getContentPane().setBackground(bgColor);

		l1.setForeground(titleC);

		b1.setBackground(blue);
		b1.setForeground(Color.white);
		b2.setBackground(blue);
		b2.setForeground(Color.white);
		b3.setBackground(blue);
		b3.setForeground(Color.white);
		b4.setBackground(blue);
		b4.setForeground(Color.white);
		b5.setBackground(blue);
		b5.setForeground(Color.white);
		b_login.setBackground(b_loginC);
		b_login.setForeground(Color.white);

		f.add(l1);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b_login);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				HotelUI H_UI = new HotelUI();
				H_UI.open();

			}
		});

		f.setVisible(true);
	}

}
