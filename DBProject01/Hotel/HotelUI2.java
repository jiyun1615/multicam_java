package Hotel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HotelUI2 {
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
	public static int j = 0;

	public static void open() {

		HotelDAO dao1 = new HotelDAO();
		List<HotelVO> list1 = dao1.filtering(1, 1);

		// JFrame 기본 설정
		JFrame f = new JFrame();
		f.setSize(980, 600); // 사이즈
		f.getContentPane().setLayout(null); // 레이아웃
		f.setTitle("메인화면"); // 제목

		Font font = new Font("D2Coding", Font.BOLD, 20);
		Font fontTitle = new Font("D2Coding", Font.BOLD, 30);
		Font sfont = new Font("D2Coding", 1, 15);

		// 다른 색 정의
		Color b_loginC = new Color(102, 102, 102);
		Color bgColor = new Color(255, 255, 255);
		Color blue = new Color(102, 153, 204);
		Color lightgray = new Color(204, 204, 204);
		Color lightlightgray = new Color(240, 240, 240);
		Color lightblue = new Color(153, 153, 204);

		// 라벨, 버튼 선언, 초기화
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

		JButton[] page = new JButton[4];

		// 페이지 버튼 세팅
		int px = 375;
		int py = 500;
		for (int i = 0; i < 4; i++) {
//			page[i].setText(Integer.toString(i+1));		//페이지 넘버링
			page[i] = new JButton(Integer.toString(i + 1));
//			page[i].setText(Integer.toString(1));

			page[i].setFont(font);
			page[i].setBounds(px + i * 60, py, 50, 50);
			if (i == 0) {
				page[i].setBackground(blue);
				page[i].setForeground(Color.white);
			} else {
				page[i].setBackground(lightlightgray);
				page[i].setForeground(Color.black);
			}
			f.add(page[i]);
		}

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

				for (int i = 0; i < 4; i++) {
					if (i == 0) {
						page[i].setBackground(blue);
						page[i].setForeground(Color.white);
					} else {
						page[i].setBackground(lightlightgray);
						page[i].setForeground(Color.black);
					}
				}

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

				for (int i = 0; i < (float) list.size() / 2; i++) {
					page[i].setEnabled(true);
				}
				for (int i = 3; i >= (float) list.size() / 2; i--) {
					page[i].setEnabled(false);
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

		for (j = 0; j < 4; j++) {
			page[j].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(j);
					JButton b = (JButton) e.getSource();
					int k = Integer.parseInt(b.getText())-1;
					// 클릭한 버튼 색상만 변경
					for (int i = 0; i < 4; i++) {
						if (i == k) {
							page[i].setBackground(blue);
							page[i].setForeground(Color.white);
						} else {
							page[i].setBackground(lightlightgray);
							page[i].setForeground(Color.black);
						}
					}
					dao = new HotelDAO();
					list = dao.filtering(filt_, sort_);

					ImageIcon icon1 = new ImageIcon(list.get(k * 2).getPhoto());
					con1.setIcon(icon1);
					con1_1.setText(list.get(k * 2).getName());
					con1_2.setText(Integer.toString(list.get(k * 2).getPrice()) + "원");
					con1_3.setText("평점 : " + Float.toString(list.get(k * 2).getScore()));
					hotelID1 = list.get(k * 2).getHotelID();
					ImageIcon iconStar1 = new ImageIcon(starSol(list.get(k * 2).getScore()));
					con1star.setIcon(iconStar1);

					if (k == 3 && list.size() == 7) {
						con2.setIcon(null);
						con2_1.setText(null);
						con2_2.setText(null);
						con2_3.setText(null);
						con2star.setIcon(null);
						bCon2.setVisible(false);
					} else {
						ImageIcon icon2 = new ImageIcon(list.get(k * 2 + 1).getPhoto());
						con2.setIcon(icon2);
						con2_1.setText(list.get(k * 2 + 1).getName());
						con2_2.setText(Integer.toString(list.get(k * 2 + 1).getPrice()) + "원");
						con2_3.setText("평점 : " + Float.toString(list.get(k * 2 + 1).getScore()));
						hotelID2 = list.get(k * 2 + 1).getHotelID();
						ImageIcon iconStar2 = new ImageIcon(starSol(list.get(k * 2 + 1).getScore()));
						con2star.setIcon(iconStar2);
						bCon2.setVisible(true);
					}
				}
			});
		}
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
