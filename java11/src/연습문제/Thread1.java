package 연습문제;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Thread1 extends Thread {
	public JLabel label;
	public int cnt;
	
	public Thread1 (String file) {
		ImageIcon icon = new ImageIcon(file);
		label = new JLabel();
		label.setIcon(icon);
		label.setBounds(100, 10, 100, 100);
	}
	
	@Override
	public void run() {
		cnt++;
		System.out.println("완성된 음식 : " + cnt);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			
		}
	}
}
