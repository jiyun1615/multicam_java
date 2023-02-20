package 상속;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 스레드그래픽 extends JFrame {
	JLabel count, image, time;

	public static void main(String[] args) {
		스레드그래픽 f = new 스레드그래픽();
		// 객체 생성시 클래스 이름과 동일한 메서드 자동 호출

	}

	public 스레드그래픽() {
		setTitle("내 스레드 그래픽");
		setSize(470, 350);

		FlowLayout flow = new FlowLayout();
		Font font = new Font("D2Coding", 1, 20);
		getContentPane().setBackground(Color.white);

		setLayout(flow);
		ImageIcon icon1 = new ImageIcon("1.png");
		ImageIcon icon2 = new ImageIcon("2.png");

		count = new JLabel("카운트");
		image = new JLabel(icon1);
		time = new JLabel("시분초");
		count.setFont(font);
		time.setFont(font);
		
		add(count);
		add(image);
		add(time);

		//스레드 객체 3개 만들어서 start 시켜보자
		카운트스레드2 count2 = new 카운트스레드2();
		이미지스레드2 image2 = new 이미지스레드2();
		타이머스레드2 time2 = new 타이머스레드2();
		
		count2.start();
		image2.start();
		time2.start();
		
		setVisible(true);
	}
	
	//내부클래스(InnerClass) 	-> 전역변수 공유할 목적으로 사용!
	public class 카운트스레드2 extends Thread { //run()

		@Override
		public void run() {
			for (int i = 500; i > 0; i--) {
				count.setText("카운트>> " + i);
				try {
					Thread.sleep(2000); //2초재워라!
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김.");
				}
			}
		}
	}
	
	public class 타이머스레드2 extends Thread {

		@Override
		public void run() {
			for (int i = 1000; i > 0; i--) {
				Date date = new Date();
				time.setText("타이머>> " + date);
				try {
					Thread.sleep(1000); //1초재워라!
				} catch (Exception e) {
					System.out.println("cpu 연결 문제 생김.");
				}
			}
		}
	}
	
	
	public class 이미지스레드2 extends Thread {
		@Override
		public void run() {
			String[] images = {"1.png", "2.png", "3.png", "4.png", "5.png"};
			for (int i = 0; i < images.length; i++) {
				ImageIcon icon = new ImageIcon(images[i]);
				image.setIcon(icon);
				try {
					Thread.sleep(5000);  	//5초
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}

}
