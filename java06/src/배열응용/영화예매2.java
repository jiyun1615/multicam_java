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

public class 영화예매2 {

	public static void main(String[] args) {

		int f_width = 700;
		int f_height = 600;
		int seatCnt = 100;
//		int seatX = 10;
//		int seatY = 10;
//		int bWidth = 50;
//		int bHeight = 50;

		JFrame f = new JFrame();

//		Color bgColor = new Color(204, 204, 255);

		Font font = new Font("D2Coding", Font.BOLD, 20);
		Color purple = new Color(102, 051, 153);
		Color seatBgColor = new Color(204,204,255);
		Color seatFgColor = new Color(102,102,153);
		Color buttonBgClicked = new Color(102,102,153);
		Color buttonBg = new Color(204,153,204);
		Color buttonFg = new Color(255,255,255);
		
		
		f.getContentPane().setBackground(Color.white);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.setSize(f_width, f_height);

		JLabel label1 = new JLabel("좌석 예매 시스템");
		label1.setFont(font);
		f.add(label1);
		JLabel label2 = new JLabel();
		label2.setFont(font);
		
		// 결제하기 버튼
		JButton total = new JButton("결제하기");
		total.setBackground(buttonBg);
		total.setForeground(buttonFg);
		total.setFont(font);

		// 좌석 선택 취소
		JButton cancel = new JButton("선택좌석 초기화");
		cancel.setBackground(buttonBg);
		cancel.setForeground(buttonFg);
		cancel.setFont(font);

		// 좌석 버튼 배열
		JButton[] seats = new JButton[seatCnt];

		// 좌석 버튼 생성
		for (int i = 0; i < seats.length; i++) {
			seats[i] = new JButton((i + 1) + "");
		}

		// 예약 여부 저장 배열
		int[] rSeat = new int[seatCnt]; // 0은 예약 X, 1은 예약O
		
		//좌석 버튼 설정
		for (int i = 0; i < seats.length; i++) {

			seats[i].setBackground(seatBgColor);
			seats[i].setForeground(seatFgColor);
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
						label2.setForeground(purple);
						seats[i].setBackground(buttonBgClicked);
						seats[i].setEnabled(false);
					}
				}
			});
			f.add(seats[i]);
		}


		// 결제하기 버튼 클릭 이벤트
		int price = 10000;
		total.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int totalCnt = 0;
				String result = "";
				for (int i = 0; i < seats.length; i++) {
					if (rSeat[i] == 1) {
						totalCnt++;
						result = result + (i + 1) + " ";
					}
				}
				
				if(totalCnt == 0) {
					JOptionPane.showMessageDialog(f, "선택된 좌석이 없습니다!");
				}else {
					int totalPrice = price * totalCnt;
					JOptionPane.showMessageDialog(f, "좌석 : " + result);
					JOptionPane.showConfirmDialog(f, totalPrice + "원 결제하시겠습니까?");	
				}
			}
		});
		
		// 선택 좌석 초기화
				cancel.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						for (int i = 0; i < seatCnt; i++) {
							if (rSeat[i] == 1) {
								rSeat[i] = 0;
								seats[i].setEnabled(true);
								seats[i].setBackground(seatBgColor);
							}
						}
						label2.setText(null);
					}
				});

		f.add(total);
		f.add(cancel);
		f.add(label2);

		f.setVisible(true);

	}

}
