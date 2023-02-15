package 메서드연습;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 음식점 {
	static int cnt1;
	static int cnt2;
	static int cnt3;
	static int tPrice;	
	final static int price1 = 5000;
	final static int price2 = 6000;
	final static int price3 = 10000;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(800, 700);
		f.getContentPane().setBackground(Color.white);
		f.getContentPane().setLayout(null);

		JButton menu1 = new JButton("짜장");
		JButton menu2 = new JButton("짬뽕");
		JButton menu3 = new JButton("탕수육");
		JButton reset = new JButton("장바구니 비우기");

		JLabel cnt = new JLabel("구매내역 : ");
		JLabel price = new JLabel("지불할 총 금액 : ");
		JLabel cntCont = new JLabel("구매내역 없음 ");
		JLabel priceCont = new JLabel("0");
		JLabel img = new JLabel();
		JLabel priceL = new JLabel("짜장 : 5000원");
		
		ImageIcon icon = new ImageIcon("짜장.png");
		img.setIcon(icon);
		

		cntCont.setSize(100, 200);
		cntCont.setBackground(Color.black);
		
		menu1.setBounds(10, 20, 100, 40);
		menu2.setBounds(110, 20, 100, 40);
		menu3.setBounds(210, 20, 100, 40);
		cnt.setBounds(350, 20, 140, 40);
		cntCont.setBounds(470, 20, 300, 40);
		reset.setBounds(580, 60, 190, 40);
		img.setBounds(100, 100, 550, 450);
		priceL.setBounds(200, 520, 200, 50);		
		price.setBounds(180, 570, 250, 30);
		priceCont.setBounds(500, 570, 200, 30);

		Font fontBtn = new Font("D2Coding", 1, 20);
		Font fontCnt = new Font("D2Coding", 1, 20);
		Font fontPrice = new Font("D2Coding", 1, 30);
		
		menu1.setFont(fontBtn);
		menu2.setFont(fontBtn);
		menu3.setFont(fontBtn);		
		reset.setFont(fontBtn);				
		cnt.setFont(fontCnt);
		cntCont.setFont(fontCnt);
		priceL.setFont(fontCnt);
		price.setFont(fontPrice);
		priceCont.setFont(fontPrice);
		
		Color bColor1 = new Color(102,051,051);
		Color bColor2 = new Color(204,051,051);
		Color bColor3 = new Color(204,153,102);
		Color fColor = new Color(255,255,255);
		Color reColor = new Color(153,102,153);
		
		menu1.setBackground(bColor1);
		menu2.setBackground(bColor2);
		menu3.setBackground(bColor3);
		menu1.setForeground(fColor);
		menu2.setForeground(fColor);
		menu3.setForeground(fColor);
		reset.setBackground(reColor);
		reset.setForeground(fColor);
		
		f.getContentPane().add(menu1);
		f.getContentPane().add(menu2);
		f.getContentPane().add(menu3);
		f.getContentPane().add(cnt);
		f.getContentPane().add(cntCont);
		f.getContentPane().add(reset);		
		f.getContentPane().add(img);
		f.getContentPane().add(priceL);
		f.getContentPane().add(price);
		f.getContentPane().add(priceCont);

		menu1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icon = new ImageIcon("짜장.png");
				img.setIcon(icon);
				tPrice+=price1;
				cnt1++;
				priceL.setText("짜장 : " + price1);
				cntCont.setText("짜장 : " + cnt1 + ", 짬뽕 : " + cnt2 + ", 탕수육 : " + cnt3);
				priceCont.setText(String.valueOf(tPrice));

			}
		});
		menu2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icon = new ImageIcon("짬뽕.png");
				img.setIcon(icon);
				tPrice+=price2;
				cnt2++;
				priceL.setText("짬뽕 : " + price2);
				cntCont.setText("짜장 : " + cnt1 + ", 짬뽕 : " + cnt2 + ", 탕수육 : " + cnt3);
				priceCont.setText(String.valueOf(tPrice));
			}
		});
		menu3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icon = new ImageIcon("탕수육.png");
				img.setIcon(icon);
				tPrice+=price3;
				cnt3++;
				priceL.setText("탕수육 : " + price3);
				cntCont.setText("짜장 : " + cnt1 + ", 짬뽕 : " + cnt2 + ", 탕수육 : " + cnt3);
				priceCont.setText(String.valueOf(tPrice));
			}
		});
		
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cnt1 = 0;
				cnt2 = 0;
				cnt3 = 0;
				tPrice = 0;			
				cntCont.setText("구매내역 없음");
				priceCont.setText("0");
			}
		});

		f.setVisible(true);
	}
}
