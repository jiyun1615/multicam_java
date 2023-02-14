package 부품응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 일기장쓰기 {
	public void open() {
		System.out.println("화면 open");

		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.setSize(500, 600);
		f.setTitle("일기장 쓰기");
		
		Font font = new Font("D2Coding", 1, 20);
		Font btnFont = new Font("D2Coding", 1, 30);

		JLabel l1 = new JLabel("오늘의 날짜");
		JLabel l2 = new JLabel("일기 제목 : ");
		JLabel lCont = new JLabel("일기 내용 : ");

		JTextField t1 = new JTextField(20);
		JTextField t2 = new JTextField(20);
		JTextArea tCont = new JTextArea(15, 20);
		

		JButton bSave = new JButton("일기 저장");

		
		l1.setFont(font);
		l2.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		lCont.setFont(font);
		tCont.setFont(font);
		bSave.setFont(btnFont);
		
		Color bgColor = new Color(204, 102, 102);
		Color fontColor = new Color(255, 255, 255);
		Color btnColor = new Color(102,051,051);
		

		f.getContentPane().setBackground(bgColor);
		l1.setForeground(fontColor);
		l2.setForeground(fontColor);
		lCont.setForeground(fontColor);
		bSave.setBackground(btnColor);
		bSave.setForeground(fontColor);
		
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(lCont);
		f.add(tCont);
		f.add(bSave);
		
		
		bSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String date = t1.getText();
				String title = t2.getText();
				String contents = tCont.getText();
				
				try {
					FileWriter file = new FileWriter("C:\\filePractice\\" + date + ".txt");
					file.write("제목" + title + "\n");
					file.write(contents);
					file.close();
				} catch (Exception e) {
					System.out.println("파일 저장 에러");
				}
				
				
			}
		});
		

		f.setVisible(true);

	}
}
