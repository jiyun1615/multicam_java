package 형변환;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 그래픽형변환 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300,500);
		f.setLayout(new FlowLayout());
		
		f.add(new JButton("Button"));	//JButton -> Component(자동형변환)
		f.add(new JLabel("Label1"));
		f.add(new JTextField(20));
		
		
		f.setVisible(true);
		
		
	}

}
