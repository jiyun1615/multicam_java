package 조건문;

import javax.swing.JOptionPane;

public class IF문3 {

	public static void main(String[] args) {
		String myNum_s = JOptionPane.showInputDialog("몇 점 인가요?");
		int myNum = Integer.parseInt(myNum_s);
		String score = "";
		
		if(myNum >= 80) {
			score = "최우수";
		}else if(myNum >= 70) {
			score = "우수";
		}else if(myNum >= 60) {
			score = "보통";
		}else {
			score = "미달";
		}
		
		System.out.println("당신의 성적은 " + score + "입니다.");
		
		String myTour_s = JOptionPane.showInputDialog("여행횟수가 몇 번 인가요?");
		int myTour = Integer.parseInt(myTour_s);
		
		String level = "";
		
		switch (myTour) {
		case 10:
			level = "VVIP";
			break;
		case 6:
			level = "VIP";
			break;
		default:
			level = "Normal";
			break;
		}
		
		System.out.println("당신은 " + level + "입니다.");

	}

}
