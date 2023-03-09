package Hotel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HotelUI {
	public static void open() {
		
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

		JButton b1 = new JButton("호텔");
		JButton b2 = new JButton("항공");
		JButton b3 = new JButton("음식점");
		JButton b4 = new JButton("즐길거리");
		JButton b5 = new JButton("여행스토리");
		JButton b_login = new JButton("login");

		JButton bshow = new JButton("검색");

		// filtering dropdown
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.white);
		f.add(panel1);

		String[] choices1 = { "7.0이상", "8.0이상", "9.0이상" };
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

		Color titleC = new Color(102, 204, 153);
		Color b_loginC = new Color(102, 102, 102);
		Color bgColor = new Color(255, 255, 255);
		Color blue = new Color(102, 153, 204);
		Color lightgray = new Color(204, 204, 204);

		f.getContentPane().setBackground(bgColor);

		l1.setForeground(titleC);
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
					filt_ = 7;
					break;
				case 1:
					filt_ = 8;
					break;
				default:
					filt_ = 9;
					break;
				}
				
				if(choice2 == 0) {
					sort_ = 1;
				}else {
					sort_ = 2;
				}
				
				List<HotelVO> list = null; 
				list = dao.filtering(filt_, sort_);
				for(HotelVO x : list) {
					System.out.println(x.getHotelID());
				}

			}
		});

		f.setVisible(true);
	}

}
