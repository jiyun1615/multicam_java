package 상속;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame {

	public static void main(String[] args) {
		CarGame f = new CarGame();

	}
	
	public CarGame() {
		setTitle("나의 자동자 경주게임");
		setSize(500,400);
		setLayout(null);
		
		마이스레드 car1 = new 마이스레드("car01.png", 100, 0);
		마이스레드 car2 = new 마이스레드("car02.png", 100, 100);
		마이스레드 car3 = new 마이스레드("car03.png", 100, 200);
		
		car1.start();
		car2.start();
		car3.start();
		
		
		setVisible(true);
	}
	
	
	
	public class 마이스레드 extends Thread {
		
		int x,y;
		public JLabel label;
		
		
		public 마이스레드 (String file, int x, int y) {
			this.x = x;
			this.y = y;
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 200, 200);
			add(label);
		}
		
		@Override
		public void run() {
			Random r = new Random();
			for(int i=0; i<200; i++) {
				int move = r.nextInt(50);
				x = x + move;
				label.setBounds(x,y,100,100);
				try {
					Thread.sleep(1000);	
				}catch(Exception E){
					
				}
			}
		}
	}


}
