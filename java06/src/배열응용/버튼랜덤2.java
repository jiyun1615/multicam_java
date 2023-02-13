package 배열응용;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼랜덤2 {

	public static void main(String[] args) {
		
		int b_width = 100;
		int b_height = 50;
		int f_width = 1200;
		int f_height = 800;
		int b_cnt = 1000;
		
		
		//1. 프레임 만들기
		JFrame f = new JFrame();
		//2. 프레임 설정 - 레이아웃 부품 설정 X
		f.getContentPane().setBackground(Color.black);
		f.setSize(f_width, f_height);
		f.setLayout(null);
		
		//3. 버튼 넣을 배열
		JButton[] buttons = new JButton[b_cnt];
		
		//4. 버튼 만들고 배열에 넣기
		for(int i=0; i<buttons.length; i++) {
			buttons[i] = new JButton("b" + i);
		}

		Font font = new Font("D2Coding", 1, 15);
		Random r = new Random();
		Color purple = new Color(102, 051, 153);
		Color lightBlue = new Color(204, 255, 255);
		Color lightPurple = new Color(255, 204, 255);
		Color indigo = new Color(051, 051, 153);
		Color lightYellow = new Color(255, 255, 204);
		Color darkGreen = new Color(000, 102, 051);
		
		
		
		//(심화) 버튼 색을 몇가지 지정, 임의 설정 Color 배열 만들기
		Color[] bgcolors = {Color.pink, lightPurple, lightYellow, lightBlue};
		Color[] fgcolors = {indigo, darkGreen, purple};
		
		//5. 배열 위치 지정 및 f에 넣기
		for(int i=0; i<buttons.length; i++) {
			int x = r.nextInt(f_width - b_width );
			int y = r.nextInt(f_height - b_height - 50);
			buttons[i].setBounds(x, y, b_width, b_height);
			buttons[i].setBackground(bgcolors[r.nextInt(bgcolors.length)]);
			buttons[i].setForeground(fgcolors[r.nextInt(fgcolors.length)]);
			buttons[i].setBorder(null);
			buttons[i].setFont(font);
			
			f.add(buttons[i]);
		}
		
		f.setVisible(true);
	}

}
