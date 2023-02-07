package 조건문;

import java.util.Date;

public class IF문4 {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		System.out.println(hour);
		
		if(hour < 11) {
			System.out.println("굿모닝");
		} else if(hour <18) {
			System.out.println("굿 애프터눈");
		} else if(hour < 22) {
			System.out.println("굿 이브닝");
		} else {
			System.out.println("굿나잇");
		}

		//옛날 버전이라 --- 쳐져있음 
//		int year = date.getYear();
//		System.out.println(year);
		int month = date.getMonth() + 1;
		System.out.println(month);
		switch (month) {
		case 3: case 4: case 5:		//3이후 break 없음 -> 쭉감
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("겨울");
			break;
		}
		
	}

}
