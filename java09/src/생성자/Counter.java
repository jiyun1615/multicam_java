package 생성자;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {
	static int count;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 400);
		f.getContentPane().setBackground(Color.white);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton minus = new JButton("1 감소");
		JButton plus = new JButton("1 증가");
		JButton reset = new JButton("0으로 초기화");

		Color btnC = new Color(153, 102, 204);
		Color fontC = new Color(102, 051, 153);
		Color resetC = new Color(204, 153, 204);
		minus.setForeground(Color.white);
		minus.setBackground(btnC);
		plus.setForeground(Color.white);
		plus.setBackground(btnC);
		reset.setForeground(Color.white);
		reset.setBackground(resetC);
		
		JLabel l1 = new JLabel(String.valueOf(count));
		l1.setForeground(fontC);
		
		Font font = new Font("D2Coding", 1, 20);
		Font font2 = new Font("D2Coding", 1, 200);

		minus.setFont(font);
		plus.setFont(font);
		reset.setFont(font);
		l1.setFont(font2);

		minus.setBounds(10, 10, 100, 30);
		plus.setBounds(10, 290, 100, 30);
		reset.setBounds(10, 200, 100, 30);
		l1.setBounds(100, 100, 250, 250);

		f.getContentPane().add(minus);
		f.getContentPane().add(reset);
		f.getContentPane().add(plus);
		f.getContentPane().add(l1);

		plus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				l1.setText(String.valueOf(count));
			}
		});

		minus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				l1.setText(String.valueOf(count));
			}
		});
		
		reset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				count=0;
				l1.setText(String.valueOf(count));
			}
		});
		

		f.setVisible(true);

	}
}
