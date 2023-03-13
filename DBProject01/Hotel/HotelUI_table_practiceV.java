package Hotel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class HotelUI_table_practiceV {
	public static void open() {

		HotelDAO dao1 = new HotelDAO();
		List<HotelVO> list1 = dao1.filtering(1, 1);
		
		JFrame f = new JFrame();
		f.setSize(980, 600);
//		FlowLayout flow = new FlowLayout();
//		f.setLayout(flow);
		f.getContentPane().setLayout(null);
		Font font = new Font("D2Coding", Font.BOLD, 20);
		Font fontTitle = new Font("D2Coding", Font.BOLD, 30);
		Font sfont = new Font("D2Coding", 1, 15);
		
		
		f.setTitle("메인화면");

		JLabel l1 = new JLabel("Hotel");
		JLabel l_filt = new JLabel("필터 : ");
		JLabel l_sort = new JLabel("정렬 : ");
		JLabel con1 = new JLabel("con1"); // 호텔 정보담을 content1
		JLabel con2 = new JLabel("con2"); // 호텔 정보담을 content2

		JButton b1 = new JButton("호텔");
		JButton b2 = new JButton("항공");
		JButton b3 = new JButton("음식점");
		JButton b4 = new JButton("즐길거리");
		JButton b5 = new JButton("여행스토리");
		JButton b_login = new JButton("login"); // 우측상단 로그인 버튼

		JButton bshow = new JButton("검색"); // 검색버튼

		JButton page1 = new JButton("1");
		JButton page2 = new JButton("2");
		JButton page3 = new JButton("3");
		JButton page4 = new JButton("4");
		
//		JButton[] page = new JButton[4];
//		for (int i = 0; i < page.length; i++) {
//			page[i].setText(Integer.toString(i+1));
//		}
		
		String[] header = {"img", "name", "price","score"};
		Object[][] all = new Object[list1.size()][4];
		
		JPanel panel3 = new JPanel();
		f.add(panel3);
		
		//정렬 X -> 처음 불러와서 세팅
		if(list1.size() == 0) {
			System.out.println("검색결과 X");
		}else {
//			int size = list1.size();
//			if(size<3) {
//				page2.setEnabled(false);
//				page3.setEnabled(false);
//				page4.setEnabled(false);
//			}
			//테이블 보여주기 느낌 연습 
			for(int i=0; i<all.length; i++) {
				all[i][0] = list1.get(i).getPhoto();
				all[i][1] = list1.get(i).getName();
				all[i][2] = list1.get(i).getPrice();
				all[i][3] = list1.get(i).getScore();			
			}
			
			con1.setText(list1.get(0).getName());
			con2.setText(list1.get(1).getName());
		}
		
		JTable table = new JTable(all, header);
		JScrollPane scroll = new JScrollPane(table);
		panel3.add(scroll);
		panel3.setBounds(100, 150, 400, 200);
		
		

		// filtering dropdown
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.white);
		f.add(panel1);

		String[] choices1 = {"전체", "7.0이상", "8.0이상", "9.0이상" };
		final JComboBox<String> cb1 = new JComboBox<>(choices1);

		cb1.setVisible(true);
		panel1.add(cb1);
		panel1.setBounds(620, 110, 80, 100);

		// sorting dropdown
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.white);
		f.add(panel2);

		String[] choices2 = { "가격 낮은 순", "가격  높은 순" };
		final JComboBox<String> cb2 = new JComboBox<>(choices2);

		cb2.setVisible(true);
		panel2.add(cb2);
		panel2.setBounds(760, 110, 110, 100);

//		int filtChoice1 = cb1.getSelectedIndex(); 	//드랍다운에서 선택된 값 가져오기
//		int filtChoice2 = cb2.getSelectedIndex(); 	//드랍다운에서 선택된 값 가져오기
//		System.out.println(filtChoice2);

		l1.setFont(fontTitle);
		l_filt.setFont(sfont);
		l_sort.setFont(sfont);
		bshow.setFont(sfont);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);
		b_login.setFont(font);
		con1.setFont(font);
		con2.setFont(font);
		page1.setFont(font);
		page2.setFont(font);
		page3.setFont(font);
		page4.setFont(font);

		int x = 40;
		l1.setBounds(20, 10, 300, 40);
		b_login.setBounds(800, 10, 80, 30);
		b1.setBounds(x, 60, 150, 40);
		b2.setBounds(x + 180, 60, 150, 40);
		b3.setBounds(x + 360, 60, 150, 40);
		b4.setBounds(x + 540, 60, 150, 40);
		b5.setBounds(x + 720, 60, 150, 40);
		l_filt.setBounds(580, 110, 100, 30);
		l_sort.setBounds(710, 110, 100, 30);
		bshow.setBounds(880, 110, 70, 30);
//		con1.setBounds(100, 150, 300, 200);
		con2.setBounds(500, 150, 300, 200);

		int px = 375;
		page1.setBounds(px, 500, 50, 50);
		page2.setBounds(px + 60, 500, 50, 50);
		page3.setBounds(px + 120, 500, 50, 50);
		page4.setBounds(px + 180, 500, 50, 50);

		Color titleC = new Color(102, 204, 153);
		Color b_loginC = new Color(102, 102, 102);
		Color bgColor = new Color(255, 255, 255);
		Color blue = new Color(102, 153, 204);
		Color lightgray = new Color(204, 204, 204);
		Color lightlightgray = new Color(240, 240, 240);

		f.getContentPane().setBackground(bgColor);

		l1.setForeground(Color.gray);
		l_filt.setForeground(b_loginC);
		l_sort.setForeground(b_loginC);

		b1.setBackground(blue);
		b1.setForeground(Color.white);
		b2.setBackground(blue);
		b2.setForeground(Color.white);
		b3.setBackground(blue);
		b3.setForeground(Color.white);
		b4.setBackground(blue);
		b4.setForeground(Color.white);
		b5.setBackground(blue);
		b5.setForeground(Color.white);
		b_login.setBackground(b_loginC);
		b_login.setForeground(Color.white);
		bshow.setBackground(lightgray);
		bshow.setForeground(Color.black);

		page1.setBackground(blue);
		page1.setForeground(Color.white);
		page2.setBackground(lightlightgray);
		page2.setForeground(Color.black);
		page3.setBackground(lightlightgray);
		page3.setForeground(Color.black);
		page4.setBackground(lightlightgray);
		page4.setForeground(Color.black);

		f.add(l1);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b_login);
		f.add(l_filt);
		f.add(l_sort);
		f.add(bshow);
		f.add(con1);
		f.add(con2);
		f.add(page1);
		f.add(page2);
		f.add(page3);
		f.add(page4);

		bshow.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int choice1 = cb1.getSelectedIndex();
				int choice2 = cb2.getSelectedIndex();
				System.out.println(choice1 + " " + choice2);
				HotelDAO dao = new HotelDAO();
				float filt_ = 0;
				int sort_ = 0;
				switch (choice1) {
				case 0:
					filt_ = 0;
					break;
				case 1:
					filt_ = 7;
					break;
				case 2:
					filt_ = 8;
					break;
				default:
					filt_ = 9;
					break;
				}

				if (choice2 == 0) {
					sort_ = 1;
				} else {
					sort_ = 2;
				}

				List<HotelVO> list = null;
				list = dao.filtering(filt_, sort_);
				con1.setText(list.get(0).getName());
				con2.setText(list.get(1).getName());
				for (HotelVO x : list) {
					System.out.println(x.getHotelID());
				}

			}
		});

		page1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				page1.setBackground(blue);
				page1.setForeground(Color.white);
				page2.setBackground(lightlightgray);
				page2.setForeground(Color.black);
				page3.setBackground(lightlightgray);
				page3.setForeground(Color.black);
				page4.setBackground(lightlightgray);
				page4.setForeground(Color.black);
			}
		});
		page2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				page1.setBackground(lightlightgray);
				page1.setForeground(Color.black);
				page2.setBackground(blue);
				page2.setForeground(Color.white);
				page3.setBackground(lightlightgray);
				page3.setForeground(Color.black);
				page4.setBackground(lightlightgray);
				page4.setForeground(Color.black);
			}
		});
		page3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				page1.setBackground(lightlightgray);
				page1.setForeground(Color.black);
				page2.setBackground(lightlightgray);
				page2.setForeground(Color.black);
				page3.setBackground(blue);
				page3.setForeground(Color.white);
				page4.setBackground(lightlightgray);
				page4.setForeground(Color.black);
			}
		});
		page4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				page1.setBackground(lightlightgray);
				page1.setForeground(Color.black);
				page2.setBackground(lightlightgray);
				page2.setForeground(Color.black);
				page3.setBackground(lightlightgray);
				page3.setForeground(Color.black);
				page4.setBackground(blue);
				page4.setForeground(Color.white);
			}
		});

		
		
		f.setVisible(true);
	}

}
