package 연습문제;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 실행 extends JFrame{

	static int cnt = 10;
	static int cntSell = 0;
	public static void main(String[] args) {
		실행 f = new 실행();

	}
	public 실행() {
		setTitle("타코야끼");
		setSize(400,400);
		setLayout(null);
		getContentPane().setBackground(Color.white);
		
		Thread1 t1 = new Thread1("타코야끼.png");
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		
		
		t1.start();
		t2.start();
		t3.start();
		
		setVisible(true);	
		
	}
	
	public class Thread1 extends Thread {
		public JLabel label;
		public JLabel text1;
		
		
		public Thread1 (String file) {
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(100, 10, 200, 200);
			text1 = new JLabel();
			text1.setBounds(100, 210, 100, 20);
			
			Font font = new Font("D2Coding", 1, 20);
			
			add(label);
			add(text1);
			
		}
		
		@Override
		public void run() {
			
			for(int i=0; i<100; i++) {
				cnt++;
				text1.setText("완성된 음식 : " + cnt);
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					
				}
			}
		}
	}
	
	public class Thread2 extends Thread {
		public JLabel label1;
		
		public Thread2 () {
			label1 = new JLabel("팔린 음식 : " + cntSell);
			label1.setBounds(200, 210, 100, 20);
			
			
			add(label1);
		}
		
		@Override
		public void run() {
			
			for(int i=0; i<100; i++) {
				cntSell++;
				label1.setText("팔린 음식 : " + cntSell);
				
				try {
					Thread.sleep(2500);
				} catch (Exception e) {
					
				}
			}
		}
	}

	public class Thread3 extends Thread {
		public JLabel label2;
		
		public Thread3 () {
			label2 = new JLabel("남은 음식 : " + (cnt - cntSell));
			label2.setBounds(150, 300, 100, 20);
			
			add(label2);
		}
		
		@Override
		public void run() {
			
			while(true) {
				label2.setText("남은 음식 : " + (cnt - cntSell));
				
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					
				}
			}
		}
	}
}
