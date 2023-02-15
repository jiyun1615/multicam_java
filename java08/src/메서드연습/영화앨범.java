package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 영화앨범 {
	static int i = 2;
	static int maxCnt = 5;
	public static void main(String[] args) {
		//순위대로 배열
		String[] title = { "아바타-물의길", "타이타닉", "어메이징 모리스", "상견니", "애프터썬" };
		String[] img = { "avatar.png", "타이타닉.png", "모리스.png", "상견니.png", "애프터선.png" };
		double[] score = { 9.6, 9.9, 9.4, 8.2, 9.2 };

		JFrame f = new JFrame();
		f.setSize(400, 400);
		f.getContentPane().setBackground(Color.white);

		//lt:제목, lc:사진, lb:평점
		JLabel lt = new JLabel(title[i]);
		ImageIcon icon = new ImageIcon(img[i]);
		JLabel lc = new JLabel(icon);
		JLabel lb = new JLabel(" 평점 : " + score[i]);

		JButton bl = new JButton("<<");
		JButton br = new JButton(">>");

		Font font = new Font("D2Coding", 1, 30);
		Font fontB = new Font("D2Coding", 1, 40);

		Color bColor = new Color(102, 153, 204);
		Color scoreColor = new Color(051, 102, 153);		

		//디자인 세팅
		lt.setHorizontalAlignment(0);		//글자 가운데 세팅
		lb.setHorizontalAlignment(0);

		lt.setFont(font);
		lb.setFont(font);
		lb.setForeground(scoreColor);
		bl.setFont(fontB);
		br.setFont(fontB);
		bl.setBackground(bColor);
		br.setBackground(bColor);
		bl.setForeground(Color.white);
		br.setForeground(Color.white);

		//frame에 라벨 및 버튼 위치 설정
		f.getContentPane().add(lt, BorderLayout.NORTH);
		f.getContentPane().add(lc, BorderLayout.CENTER);
		f.getContentPane().add(lb, BorderLayout.SOUTH);
		f.getContentPane().add(bl, BorderLayout.WEST);
		f.getContentPane().add(br, BorderLayout.EAST);

		//왼쪽 버튼 클릭 이벤트
		bl.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (i > 0) {
					i--;
					lt.setText(title[i]);
					lb.setText(" 평점 : " + score[i]);
					ImageIcon icon = new ImageIcon(img[i]);
					lc.setIcon(icon);
				} else {
					i=4;
					lt.setText(title[i]);
					lb.setText(" 평점 : " + score[i]);
					ImageIcon icon = new ImageIcon(img[i]);
					lc.setIcon(icon);
				}
			}
		});

		//오른쪽 버튼 클릭 이벤트
		br.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (i < maxCnt-1) {
					i++;
					lt.setText(title[i]);
					lb.setText(" 평점 : " + score[i]);
					ImageIcon icon = new ImageIcon(img[i]);
					lc.setIcon(icon);
				} else {
					i=0;
					lt.setText(title[i]);
					lb.setText(" 평점 : " + score[i]);
					ImageIcon icon = new ImageIcon(img[i]);
					lc.setIcon(icon);
				}
			}
		});
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
