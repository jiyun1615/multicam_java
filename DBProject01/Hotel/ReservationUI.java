package Hotel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

public class ReservationUI {
	private static ReservationDAO dao = null;

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

	private static java.sql.Date date1 = null;
	private static java.sql.Date date2 = null;

	static HotelVO bag = null;

	public static void reservation(String hotelID) {

		// JFrame 기본 설정
		JFrame f = new JFrame();
		f.setSize(980, 600); // 사이즈
		f.getContentPane().setLayout(null); // 레이아웃
		f.setTitle("메인화면"); // 제목

		JLabel l1 = new JLabel("Hotel");
		JLabel con1 = new JLabel(); // 호텔 사진
		JLabel con1_1 = new JLabel(""); // 호텔 이름
		JLabel con1_2 = new JLabel(""); // 호텔 가격
		JLabel con1_3 = new JLabel(""); // 호텔 평점
		JLabel con1star = new JLabel(""); // 호텔 별점
		JLabel conAdd = new JLabel(""); // 호텔 주소
		JLabel conTel = new JLabel(""); // 호텔 전화번호

		JButton b1 = new JButton("호텔"); // 기본 화면
		JButton b2 = new JButton("항공");
		JButton b3 = new JButton("음식점");
		JButton b4 = new JButton("즐길거리");
		JButton b5 = new JButton("여행스토리");
		JButton b_login = new JButton("login"); // 우측상단 로그인 버튼

		JButton bReserve = new JButton("예약하기");

		//예약시작일
		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
		datePicker.setBackground(Color.white);
		f.add(datePicker);
		datePicker.setBounds(200, 400, 200, 30);

		// 가운데 >> 표시
		JLabel lrr = new JLabel(">>");
		lrr.setBounds(430, 395, 50, 40);

		//예약말일
		UtilDateModel model1 = new UtilDateModel();
		JDatePanelImpl datePanel1 = new JDatePanelImpl(model1);
		JDatePickerImpl datePicker1 = new JDatePickerImpl(datePanel1);
		datePicker1.setBackground(Color.white);
		f.add(datePicker1);
		datePicker1.setBounds(500, 400, 200, 30);

		// roomCnt dropdown
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.white);
		f.add(panel1);

		String[] choices1 = { "객실 : 1개", "객실 : 2개", "객실 : 3개", "객실 : 4개" };
		final JComboBox<String> cb1 = new JComboBox<>(choices1);

		cb1.setVisible(true);
		panel1.add(cb1);
		panel1.setBounds(200, 450, 100, 40);

		// 호텔정보가져오기
		bag = new HotelVO();
		HotelDAO hotelDao = new HotelDAO();
		bag = hotelDao.selectOne(hotelID);

		ImageIcon icon1 = new ImageIcon(bag.getPhoto());
		con1.setIcon(icon1);
		con1_1.setText(bag.getName());
		con1_2.setText(Integer.toString(bag.getPrice()) + "원");
		con1_3.setText("평점 : " + Float.toString(bag.getScore()));
		ImageIcon iconStar1 = new ImageIcon(starSol(bag.getScore()));
		con1star.setIcon(iconStar1);
		conAdd.setText(bag.getLocation());
		conTel.setText(bag.getTel());

		Font font = new Font("D2Coding", Font.BOLD, 20);
		Font fontTitle = new Font("D2Coding", Font.BOLD, 30);
		Font sfont = new Font("D2Coding", 1, 15);
		Font bigfont = new Font("돋움", 1, 30);

		// font 설정
		l1.setFont(fontTitle);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		b5.setFont(font);
		b_login.setFont(font);
		con1_1.setFont(font);
		con1_2.setFont(sfont);
		con1_3.setFont(sfont);
		conAdd.setFont(sfont);
		conTel.setFont(sfont);
		lrr.setFont(bigfont);

		// 위치 및 크기 설정
		int x = 40;
		l1.setBounds(20, 10, 300, 40);
		b_login.setBounds(800, 10, 80, 30);
		b1.setBounds(x, 60, 150, 40);
		b2.setBounds(x + 180, 60, 150, 40);
		b3.setBounds(x + 360, 60, 150, 40);
		b4.setBounds(x + 540, 60, 150, 40);
		b5.setBounds(x + 720, 60, 150, 40);
		bReserve.setBounds(x + 720, 395, 100, 40);

		// content 값 위치 설정
		int cx = 100;
		con1.setBounds(cx, 200, 250, 150);
		con1_1.setBounds(cx + 260, 210, 350, 30);
		con1_2.setBounds(cx + 260, 250, 200, 30);
		con1_3.setBounds(cx + 360, 280, 200, 30);
		con1star.setBounds(cx + 260, 280, 100, 30);
		conAdd.setBounds(cx + 600, 210, 200, 30);
		conTel.setBounds(cx + 600, 250, 100, 30);

		// 다른 색 정의
		Color b_loginC = new Color(102, 102, 102);
		Color bgColor = new Color(255, 255, 255);
		Color blue = new Color(102, 153, 204);

		// 색 설정
		f.getContentPane().setBackground(bgColor);

		l1.setForeground(Color.gray);

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
		bReserve.setBackground(blue);
		bReserve.setForeground(Color.white);

		// f에 라벨,버튼 등 추가
		f.add(l1);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b_login);
		f.add(con1);
		f.add(con1_1);
		f.add(con1_2);
		f.add(con1_3);
		f.add(con1star);
		f.add(conAdd);
		f.add(conTel);
		f.add(bReserve);
		f.add(lrr);

		bReserve.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int date1_2 = datePicker.getModel().getDay();
				int date2_2 = datePicker1.getModel().getDay();
				if (date1_2 >= date2_2) {
					JOptionPane.showMessageDialog(f, "날짜를 다시 선택해주십시오.");
				} else {
					int stayDate = date2_2 - date1_2;
					Date date1_1 = new Date();
					date1_1 = (Date) datePicker.getModel().getValue();
					long timeInMilliSeconds1 = date1_1.getTime();
					date1 = new java.sql.Date(timeInMilliSeconds1);

					Date date2_1 = new java.util.Date();
					date2_1 = (Date) datePicker1.getModel().getValue();
					long timeInMilliSeconds2 = date2_1.getTime();
					date2 = new java.sql.Date(timeInMilliSeconds2);

					int roomCnt = cb1.getSelectedIndex() + 1;
					String userID = "apple";
					ReservationVO rBag = new ReservationVO();

					rBag.setHotelID(hotelID);
					rBag.setStartDate(date1);
					rBag.setEndDate(date2);
					rBag.setRoomcnt(roomCnt);
					rBag.setUserID(userID);
					int totalPrice = bag.getPrice() * roomCnt * stayDate;
					rBag.setPrice(totalPrice);

					int ans = JOptionPane.showConfirmDialog(f,
							"예약 호텔 : " + bag.getName() + "\n" + "예약일 : " + date1.getMonth() + "월 " + date1.getDate() + "일" + "~" 
									+ date2.getMonth() + "월 " +  + date2.getDate() + "일" 
									+ "\n" + "객실 : " + roomCnt + "개" + "\n금액 : " + totalPrice 
									+ "\n예약하시겠습니까?");
					
					//ans = 0 : 예
					//ans = 1 : 아니요
					if (ans == 0) {
						dao = new ReservationDAO();
						int check = dao.insert(rBag);
						if (check == 1) {
							JOptionPane.showMessageDialog(f, "예약 완료되었습니다.");
						} else {
							JOptionPane.showMessageDialog(f, "오류가 발생하였습니다. 페이지를 재방문해주세요.");
						}
					}
					else {
						
					}
				}
			}
		});

		f.setVisible(true);
	}

}
