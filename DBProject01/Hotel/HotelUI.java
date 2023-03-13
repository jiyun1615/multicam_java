package Hotel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class HotelUI {
	private static HotelDAO dao = null;
	private static float filt_ = 0;
	private static int sort_ = 0;
	private static List<HotelVO> list = null;

	private static String[] stars = { "star9.png", "star8.png", "star7.png", "star6.png" };

	public static String starSol(float n) {
		String result = "";
		if (n >= 9)
			result = stars[0];
		else if (n >= 8)
			result = stars[1];
		else if (n >= 7)
			result = stars[2];
		else if (n >= 6)
			result = stars[3];
		return result;
	}

	public static String hotelID1 = "";
	public static String hotelID2 = "";

	public static void open() {

		HotelDAO dao1 = new HotelDAO();
		List<HotelVO> list1 = dao1.filtering(1, 1);

		// JFrame 기본 설정
		JFrame f = new JFrame();
		f.setSize(980, 600); // 사이즈
		f.getContentPane().setLayout(null); // 레이아웃
		f.setTitle("메인화면"); // 제목

		JLabel l1 = new JLabel("Hotel");
		JLabel l_filt = new JLabel("필터 : ");
		JLabel l_sort = new JLabel("정렬 : ");
		JLabel con1 = new JLabel(); // 호텔 사진
		JLabel con1_1 = new JLabel(""); // 호텔 이름
		JLabel con1_2 = new JLabel(""); // 호텔 가격
		JLabel con1_3 = new JLabel(""); // 호텔 평점
		JLabel con1star = new JLabel(""); // 호텔별점

		JLabel con2 = new JLabel(); // 호텔 사진
		JLabel con2_1 = new JLabel(""); // 호텔 이름
		JLabel con2_2 = new JLabel(""); // 호텔 가격
		JLabel con2_3 = new JLabel(""); // 호텔 평점
		JLabel con2star = new JLabel(""); // 호텔 별점

		JButton b1 = new JButton("호텔"); // 기본 화면
		JButton b2 = new JButton("항공");
		JButton b3 = new JButton("음식점");
		JButton b4 = new JButton("즐길거리");
		JButton b5 = new JButton("여행스토리");
		JButton b_login = new JButton("login"); // 우측상단 로그인 버튼

		JButton bshow = new JButton("검색"); // 검색버튼

		JButton bCon1 = new JButton("상세보기");
		JButton bCon2 = new JButton("상세보기");

		// 페이지 버튼
		JButton page1 = new JButton("1");
		JButton page2 = new JButton("2");
		JButton page3 = new JButton("3");
		JButton page4 = new JButton("4");

		// 정렬 X -> 처음 불러와서 세팅
		if (list1.size() == 0) {
			System.out.println("검색결과 X");
		} else {
			ImageIcon icon1 = new ImageIcon(list1.get(0).getPhoto());
			con1.setIcon(icon1);
			con1_1.setText(list1.get(0).getName());
			con1_2.setText(Integer.toString(list1.get(0).getPrice()) + "원");
			con1_3.setText("평점 : " + Float.toString(list1.get(0).getScore()));
			hotelID1 = list1.get(0).getHotelID();
			ImageIcon iconStar1 = new ImageIcon(starSol(list1.get(0).getScore()));
			con1star.setIcon(iconStar1);

			ImageIcon icon2 = new ImageIcon(list1.get(1).getPhoto());
			con2.setIcon(icon2);
			con2_1.setText(list1.get(1).getName());
			con2_2.setText(Integer.toString(list1.get(1).getPrice()) + "원");
			con2_3.setText("평점 : " + Float.toString(list1.get(1).getScore()));
			hotelID2 = list1.get(1).getHotelID();
			ImageIcon iconStar2 = new ImageIcon(starSol(list1.get(1).getScore()));
			con2star.setIcon(iconStar2);
		}

		// filtering dropdown
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.white);
		f.add(panel1);

		String[] choices1 = { "전체", "7.0이상", "8.0이상", "9.0이상" };
		final JComboBox<String> cb1 = new JComboBox<>(choices1);

		cb1.setVisible(true);
		panel1.add(cb1);
		panel1.setBounds(620, 110, 80, 40);

		// sorting dropdown
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.white);
		f.add(panel2);

		String[] choices2 = { "가격 낮은 순", "가격  높은 순" };
		final JComboBox<String> cb2 = new JComboBox<>(choices2);

		cb2.setVisible(true);
		panel2.add(cb2);
		panel2.setBounds(760, 110, 110, 40);

		Font font = new Font("D2Coding", Font.BOLD, 20);
		Font fontTitle = new Font("D2Coding", Font.BOLD, 30);
		Font sfont = new Font("D2Coding", 1, 15);

		// font 설정
		l1.setFont(fontTitle);
		l_filt.setFont(sfont);
		l_sort.setFont(sfont);
		bshow.setFont(sfont);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);
		bCon1.setFont(sfont);
		bCon2.setFont(sfont);
		b_login.setFont(font);
		con1_1.setFont(font);
		con1_2.setFont(sfont);
		con1_3.setFont(sfont);
		con2_1.setFont(font);
		con2_2.setFont(sfont);
		con2_3.setFont(sfont);
		page1.setFont(font);
		page2.setFont(font);
		page3.setFont(font);
		page4.setFont(font);

		// 위치 및 크기 설정
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
		bCon1.setBounds(80, 380, 100, 30);
		bCon2.setBounds(500, 380, 100, 30);

		// content 값 위치 설정
		int cx = 60;
		con1.setBounds(cx, 200, 200, 150);
		con1_1.setBounds(cx + 210, 200, 300, 30);
		con1_2.setBounds(cx + 210, 240, 200, 30);
		con1_3.setBounds(cx + 310, 270, 200, 30);
		con1star.setBounds(cx + 210, 270, 100, 30);
		con2.setBounds(cx + 420, 200, 200, 150);
		con2_1.setBounds(cx + 630, 200, 300, 30);
		con2_2.setBounds(cx + 630, 240, 200, 30);
		con2_3.setBounds(cx + 730, 270, 200, 30);
		con2star.setBounds(cx + 630, 270, 100, 30);

		// page 1,2,3,4 버튼 위치 설정
		int px = 375;
		page1.setBounds(px, 500, 50, 50);
		page2.setBounds(px + 60, 500, 50, 50);
		page3.setBounds(px + 120, 500, 50, 50);
		page4.setBounds(px + 180, 500, 50, 50);

		// 다른 색 정의
		Color b_loginC = new Color(102, 102, 102);
		Color bgColor = new Color(255, 255, 255);
		Color blue = new Color(102, 153, 204);
		Color lightgray = new Color(204, 204, 204);
		Color lightlightgray = new Color(240, 240, 240);
		Color lightblue = new Color(153, 153, 204);

		// 색 설정
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
		bCon1.setBackground(lightblue);
		bCon1.setForeground(Color.white);
		bCon2.setBackground(lightblue);
		bCon2.setForeground(Color.white);
		
		
		page1.setBackground(blue);
		page1.setForeground(Color.white);
		page2.setBackground(lightlightgray);
		page2.setForeground(Color.black);
		page3.setBackground(lightlightgray);
		page3.setForeground(Color.black);
		page4.setBackground(lightlightgray);
		page4.setForeground(Color.black);

		// f에 라벨,버튼 등 추가
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
		f.add(con1_1);
		f.add(con1_2);
		f.add(con1_3);
		f.add(con2_1);
		f.add(con2_2);
		f.add(con2_3);
		f.add(con1star);
		f.add(con2star);
		f.add(bCon1);
		f.add(bCon2);

		bshow.addActionListener(new ActionListener() {

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

				int choice1 = cb1.getSelectedIndex();
				int choice2 = cb2.getSelectedIndex();
				System.out.println(choice1 + " " + choice2);
				dao = new HotelDAO();
				filt_ = 0;
				sort_ = 0;

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

				list = dao.filtering(filt_, sort_);
				if (list.size() < 3) {
					page1.setEnabled(true);
					page2.setEnabled(false);
					page3.setEnabled(false);
					page4.setEnabled(false);
				} else if (list.size() < 5) {
					page1.setEnabled(true);
					page2.setEnabled(true);
					page3.setEnabled(false);
					page4.setEnabled(false);
				} else if (list.size() < 7) {
					page1.setEnabled(true);
					page2.setEnabled(true);
					page3.setEnabled(true);
					page4.setEnabled(false);
				} else {
					page1.setEnabled(true);
					page2.setEnabled(true);
					page3.setEnabled(true);
					page4.setEnabled(true);
				}

				ImageIcon icon1 = new ImageIcon(list.get(0).getPhoto());
				con1.setIcon(icon1);
				con1_1.setText(list.get(0).getName());
				con1_2.setText(Integer.toString(list.get(0).getPrice()) + "원");
				con1_3.setText("평점 : " + Float.toString(list.get(0).getScore()));
				hotelID1 = list.get(0).getHotelID();
				ImageIcon iconStar1 = new ImageIcon(starSol(list.get(0).getScore()));
				con1star.setIcon(iconStar1);

				ImageIcon icon2 = new ImageIcon(list.get(1).getPhoto());
				con2.setIcon(icon2);
				con2_1.setText(list.get(1).getName());
				con2_2.setText(Integer.toString(list.get(1).getPrice()) + "원");
				con2_3.setText("평점 : " + Float.toString(list.get(1).getScore()));
				hotelID2 = list.get(1).getHotelID();
				ImageIcon iconStar2 = new ImageIcon(starSol(list.get(1).getScore()));
				con2star.setIcon(iconStar2);
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

				dao = new HotelDAO();
				list = dao.filtering(filt_, sort_);

				ImageIcon icon1 = new ImageIcon(list.get(0).getPhoto());
				con1.setIcon(icon1);
				con1_1.setText(list.get(0).getName());
				con1_2.setText(Integer.toString(list.get(0).getPrice()) + "원");
				con1_3.setText("평점 : " + Float.toString(list.get(0).getScore()));
				hotelID1 = list.get(0).getHotelID();
				ImageIcon iconStar1 = new ImageIcon(starSol(list.get(0).getScore()));
				con1star.setIcon(iconStar1);

				ImageIcon icon2 = new ImageIcon(list.get(1).getPhoto());
				con2.setIcon(icon2);
				con2_1.setText(list.get(1).getName());
				con2_2.setText(Integer.toString(list.get(1).getPrice()) + "원");
				con2_3.setText("평점 : " + Float.toString(list.get(1).getScore()));
				hotelID2 = list.get(1).getHotelID();
				ImageIcon iconStar2 = new ImageIcon(starSol(list.get(1).getScore()));
				con2star.setIcon(iconStar2);
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

				dao = new HotelDAO();
				list = dao.filtering(filt_, sort_);

				ImageIcon icon1 = new ImageIcon(list.get(2).getPhoto());
				con1.setIcon(icon1);
				con1_1.setText(list.get(2).getName());
				con1_2.setText(Integer.toString(list.get(2).getPrice()) + "원");
				con1_3.setText("평점 : " + Float.toString(list.get(2).getScore()));
				hotelID1 = list.get(2).getHotelID();
				ImageIcon iconStar1 = new ImageIcon(starSol(list.get(2).getScore()));
				con1star.setIcon(iconStar1);

				ImageIcon icon2 = new ImageIcon(list.get(3).getPhoto());
				con2.setIcon(icon2);
				con2_1.setText(list.get(3).getName());
				con2_2.setText(Integer.toString(list.get(3).getPrice()) + "원");
				con2_3.setText("평점 : " + Float.toString(list.get(3).getScore()));
				hotelID2 = list.get(3).getHotelID();
				ImageIcon iconStar2 = new ImageIcon(starSol(list.get(3).getScore()));
				con2star.setIcon(iconStar2);

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

				dao = new HotelDAO();
				list = dao.filtering(filt_, sort_);

				ImageIcon icon1 = new ImageIcon(list.get(4).getPhoto());
				con1.setIcon(icon1);
				con1_1.setText(list.get(4).getName());
				con1_2.setText(Integer.toString(list.get(4).getPrice()) + "원");
				con1_3.setText("평점 : " + Float.toString(list.get(4).getScore()));
				hotelID1 = list.get(4).getHotelID();
				ImageIcon iconStar1 = new ImageIcon(starSol(list.get(4).getScore()));
				con1star.setIcon(iconStar1);

				ImageIcon icon2 = new ImageIcon(list.get(5).getPhoto());
				con2.setIcon(icon2);
				con2_1.setText(list.get(5).getName());
				con2_2.setText(Integer.toString(list.get(5).getPrice()) + "원");
				con2_3.setText("평점 : " + Float.toString(list.get(5).getScore()));
				hotelID2 = list.get(5).getHotelID();
				ImageIcon iconStar2 = new ImageIcon(starSol(list.get(5).getScore()));
				con2star.setIcon(iconStar2);
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

				dao = new HotelDAO();
				list = dao.filtering(filt_, sort_);

				ImageIcon icon1 = new ImageIcon(list.get(6).getPhoto());
				con1.setIcon(icon1);
				con1_1.setText(list.get(6).getName());
				con1_2.setText(Integer.toString(list.get(6).getPrice()) + "원");
				con1_3.setText("평점 : " + Float.toString(list.get(6).getScore()));
				hotelID1 = list.get(6).getHotelID();
				ImageIcon iconStar1 = new ImageIcon(starSol(list.get(6).getScore()));
				con1star.setIcon(iconStar1);

				if (list.size() == 8) {
					ImageIcon icon2 = new ImageIcon(list.get(7).getPhoto());
					con2.setIcon(icon2);
					con2_1.setText(list.get(7).getName());
					con2_2.setText(Integer.toString(list.get(7).getPrice()) + "원");
					con2_3.setText("평점 : " + Float.toString(list.get(7).getScore()));
					hotelID2 = list.get(7).getHotelID();
					ImageIcon iconStar2 = new ImageIcon(starSol(list.get(7).getScore()));
					con2star.setIcon(iconStar2);
				} else {
					con2.setIcon(null);
					con2_1.setText(null);
					con2_2.setText(null);
					con2_3.setText(null);
					con2star.setIcon(null);
				}
			}
		});

		bCon1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ReservationUI r_ui = new ReservationUI();
				r_ui.reservation(hotelID1);
			}
		});

		bCon2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ReservationUI r_ui = new ReservationUI();
				r_ui.reservation(hotelID2);
			}
		});

		f.setVisible(true);
	}

}
