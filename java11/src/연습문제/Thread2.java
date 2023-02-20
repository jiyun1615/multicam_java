package 연습문제;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Thread2 extends Thread {
	public JLabel label;
	public int cnt;
	
	public Thread2 (String file) {
		label = new JLabel();
		label.setBounds(100, 10, 100, 100);
	}
	
	@Override
	public void run() {
		cnt--;
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			
		}
	}
}
