package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 영화예매 {

	public static void main(String[] args) {

		int f_width = 700;
		int f_height = 600;
		int seatCnt = 100;
//		int seatX = 10;
//		int seatY = 10;
//		int bWidth = 50;
//		int bHeight = 50;
		

		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.white);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.setSize(f_width, f_height);

		Font font = new Font("D2Coding", Font.BOLD, 20);
		Color blue = new Color(051, 051, 153);
		Color darkBlue = new Color(051, 102, 153);
		Color lightBlue = new Color(153, 204, 255);
		

		JLabel label1 = new JLabel("좌석 예매 시스템");
		label1.setFont(font);
		f.add(label1);
		JLabel label2 = new JLabel();
		label2.setFont(font);
		
		//결제하기 버튼
		JButton total = new JButton("결제하기");
		total.setBackground(lightBlue);
		total.setForeground(darkBlue);
		total.setFont(font);
		
		//좌석 선택 취소
		JButton cancel = new JButton("좌석 선택 취소");
		cancel.setBackground(lightBlue);
		cancel.setFont(font);
		
		// 좌석 버튼 배열
		JButton[] seats = new JButton[seatCnt];

		// 좌석 버튼 생성
		for (int i = 0; i < seats.length; i++) {
			seats[i] = new JButton((i + 1) + "");
		}

		// 예약 여부 저장 배열
		int[] rSeat = new int[seatCnt]; // 0은 예약 X, 1은 예약O

		for (int i = 0; i < seats.length; i++) {

			seats[i].setBackground(Color.lightGray);
			seats[i].setForeground(Color.black);
			seats[i].setFont(font);
			
//			seats[i].setBounds(seatX, seatY, bWidth, bHeight);

			// 좌석 버튼 클릭 이벤트
			seats[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String c = e.getActionCommand();
					int i = Integer.parseInt(c) - 1;
					if (rSeat[i] == 0) {
						rSeat[i] = 1;
						label2.setText(c + "번 좌석 예약되었습니다.");
						label2.setForeground(blue);
						seats[i].setBackground(Color.gray);
					} else {
						label2.setText("이미 예약된 좌석입니다. 다시 선택해주세요.");
						label2.setForeground(Color.red);
					}
				}
			});
			f.add(seats[i]);
		}
		
		
		int price = 10000;
		//결제하기 버튼 클릭 이벤트
		total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int totalCnt = 0;
				String result = "";
				for(int i=0; i<seats.length; i++) {
					if(rSeat[i] == 1) {
						totalCnt++;
						result = result + (i+1) + " ";
					}
				}
				
				int totalPrice = price* totalCnt;
				JOptionPane.showMessageDialog(f, "좌석 : " + result);
				JOptionPane.showConfirmDialog(f, totalPrice + "원 결제하시겠습니까?");
				
			}
		});

		f.add(total);
		f.add(cancel);		
		f.add(label2);
		

		f.setVisible(true);

	}

}
