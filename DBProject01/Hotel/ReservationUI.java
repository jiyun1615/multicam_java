package Hotel;

import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

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

	public static void main(String args[]) {

		HotelDAO dao1 = new HotelDAO();
		List<HotelVO> list1 = dao1.filtering(1, 1);

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
		JLabel con1star = new JLabel(""); // 호텔별점
		JLabel conAdd = new JLabel("");
		JLabel conTel= new JLabel("");

		JButton b1 = new JButton("호텔"); // 기본 화면
		JButton b2 = new JButton("항공");
		JButton b3 = new JButton("음식점");
		JButton b4 = new JButton("즐길거리");
		JButton b5 = new JButton("여행스토리");
		JButton b_login = new JButton("login"); // 우측상단 로그인 버튼

		
		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
		datePicker.setBackground(Color.white);
		f.add(datePicker);
		datePicker.setBounds(200, 400, 200, 30);
		Date date1 = (Date)datePicker.getModel().getValue();
		
		UtilDateModel model1 = new UtilDateModel();
		JDatePanelImpl datePanel1 = new JDatePanelImpl(model1);
		JDatePickerImpl datePicker1 = new JDatePickerImpl(datePanel1);
		datePicker1.setBackground(Color.white);
		f.add(datePicker1);
		datePicker1.setBounds(500, 400, 200, 30);
		Date date2 = (Date)datePicker1.getModel().getValue();
		
		
		
		
		
		
		
//		try {
//			if(date1.compareTo(date2) <= 0) {
//				JOptionPane.showMessageDialog(f, "숙박일은 0보다 작을 수 없습니다.");
//				datePicker.getModel().setValue(null);
//				datePicker1.getModel().setValue(null);			
//			}
//		}catch (Exception e) {
//			// TODO: handle exception
//		}
		
		
		
		// 정렬 X -> 처음 불러와서 세팅
		if (list1.size() == 0) {
			System.out.println("검색결과 X");
		} else {
			ImageIcon icon1 = new ImageIcon(list1.get(0).getPhoto());
			con1.setIcon(icon1);
			con1_1.setText(list1.get(0).getName());
			con1_2.setText(Integer.toString(list1.get(0).getPrice()) + "원");
			con1_3.setText("평점 : " + Float.toString(list1.get(0).getScore()));
			ImageIcon iconStar1 = new ImageIcon(starSol(list1.get(0).getScore()));
			con1star.setIcon(iconStar1);
			conAdd.setText(list1.get(0).getLocation());
			conTel.setText(list1.get(0).getTel());
		}

		Font font = new Font("D2Coding", Font.BOLD, 20);
		Font fontTitle = new Font("D2Coding", Font.BOLD, 30);
		Font sfont = new Font("D2Coding", 1, 15);

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
		

		// 위치 및 크기 설정
		int x = 40;
		l1.setBounds(20, 10, 300, 40);
		b_login.setBounds(800, 10, 80, 30);
		b1.setBounds(x, 60, 150, 40);
		b2.setBounds(x + 180, 60, 150, 40);
		b3.setBounds(x + 360, 60, 150, 40);
		b4.setBounds(x + 540, 60, 150, 40);
		b5.setBounds(x + 720, 60, 150, 40);

		// content 값 위치 설정
		int cx = 100;
		con1.setBounds(cx, 200, 250, 150);
		con1_1.setBounds(cx + 250, 210, 300, 30);
		con1_2.setBounds(cx + 250, 250, 200, 30);
		con1_3.setBounds(cx + 350, 280, 200, 30);
		con1star.setBounds(cx + 250, 280, 100, 30);
		conAdd.setBounds(cx + 500, 210, 200, 30);
		conTel.setBounds(cx + 500, 250, 100, 30);

		// 다른 색 정의
		Color titleC = new Color(102, 204, 153);
		Color b_loginC = new Color(102, 102, 102);
		Color bgColor = new Color(255, 255, 255);
		Color blue = new Color(102, 153, 204);
		Color lightgray = new Color(204, 204, 204);
		Color lightlightgray = new Color(240, 240, 240);

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

		f.setVisible(true);
	}

}
