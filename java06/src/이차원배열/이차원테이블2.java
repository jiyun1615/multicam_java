package 이차원배열;

import java.awt.Font;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 이차원테이블2 {

	public static void main(String[] args) {
		int arrSize = 30;
		
		JFrame f = new JFrame();
		f.setSize(500, 500);
		String header[] = {"컴퓨터", "영어", "수학", "체육"};
		String contents[][] = new String[arrSize][4];
		
		Random r = new Random();
		for(int i=0; i<arrSize; i++) {
			for(int j=0; j<4; j++) {
				contents[i][j] = Integer.toString(r.nextInt(101));
			}
		}
		Font font = new Font("D2Coding", 1, 20);
		
		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		
		table.setFont(font);
		table.setRowHeight(30);
		f.add(scroll);
		f.setVisible(true);
		

	}

}
