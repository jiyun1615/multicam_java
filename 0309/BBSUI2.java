package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import 자바DB연결.BBSDAO3;
import 자바DB연결.BbsVO;

public class BBSUI2 {

	public static void open() {
		
		JFrame f = new JFrame();
		f.setSize(500, 600);
//		FlowLayout flow = new FlowLayout();
//		f.setLayout(flow);
		f.getContentPane().setBackground(Color.pink);
		f.getContentPane().setLayout(null);
		Font font = new Font("D2Coding", Font.BOLD, 20);
		Font fontTitle = new Font("D2Coding", Font.BOLD, 30);

		f.setTitle("나의 게시판");

		JTextField text1 = new JTextField(20);
		JTextField text2 = new JTextField(20);
		JTextField text3 = new JTextField(20);
		JTextField text4 = new JTextField(20);

		JLabel l1 = new JLabel("나의 게시판");
		JLabel l2 = new JLabel("게시판ID");
		JLabel l3 = new JLabel("제목");
		JLabel l4 = new JLabel("내용");
		JLabel l5 = new JLabel("작성자");

		JButton b1 = new JButton("게시물 작성");
		JButton b2 = new JButton("게시물 삭제");
		JButton b3 = new JButton("게시물 검색");

		l1.setFont(fontTitle);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);

		l1.setBounds(180, 10, 200, 100);
		l1.setBackground(Color.white);
		l2.setBounds(100, 100, 100, 30);
		text1.setBounds(200, 100, 200, 30);
		l3.setBounds(100, 150, 100, 30);
		text2.setBounds(200, 150, 200, 30);
		l4.setBounds(100, 200, 100, 30);
		text3.setBounds(200, 200, 200, 100);
		l5.setBounds(100, 320, 100, 30);
		text4.setBounds(200, 320, 200, 30);
		b1.setBounds(150, 380, 200, 40);
		b2.setBounds(150, 430, 200, 40);
		b3.setBounds(150, 480, 200, 40);

		b1.setBackground(Color.white);
		b2.setBackground(Color.white);
		b3.setBackground(Color.white);

		f.add(l1);
		f.add(l2);
		f.add(text1);
		f.add(l3);
		f.add(text2);
		f.add(l4);
		f.add(text3);
		f.add(l5);
		f.add(text4);
		f.add(b1);
		f.add(b2);
		f.add(b3);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BBSDAO3 dao = new BBSDAO3();

				int no = Integer.valueOf(text1.getText());
				String title = text2.getText();
				String content = text3.getText();
				String writer = text4.getText();
				BbsVO bag = new BbsVO();
				bag.setNo(no);
				bag.setTitle(title);;
				bag.setContent(content);;
				bag.setWriter(writer);;
				
				try {
					int insertR = dao.insert(bag);
					if(insertR != 0) {
						JOptionPane.showMessageDialog(f, "insert 성공!");
					}else {
						JOptionPane.showMessageDialog(f, "재입력해주세요!");
					}
				} catch (Exception e1) {
				}
				
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BBSDAO3 dao = new BBSDAO3();

				int no = Integer.valueOf(text1.getText());
				int result = dao.delete(no);
				if(result == 1) {
					JOptionPane.showMessageDialog(f, "삭제성공!");
					text1.setText(null);
					text2.setText(null);
					text3.setText(null);
					text4.setText(null);
				}else {
					JOptionPane.showMessageDialog(f, "삭제실패 다시시도하세요!");
				}
			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				BBSDAO3 dao = new BBSDAO3();

				int no = Integer.valueOf(text1.getText());
				BbsVO bag = dao.one(no);
				if(bag != null) {
					text2.setText(bag.getTitle());
					text3.setText(bag.getContent());
					text4.setText(bag.getWriter());
				}else {
					JOptionPane.showMessageDialog(f, "게시판 ID가 존재하지 않습니다.");
				}
				
				
				
			}
		});

		f.setVisible(true);
	}

}
