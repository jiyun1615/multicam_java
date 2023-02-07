package 연습문제;

import java.util.Date;

public class 문제1 {

	public static void main(String[] args) {
		Date date = new Date();
		
		
		//2000년 이상일 경우 밀레니엄
		int year = date.getYear();
		if(year > 100) {
			System.out.println("밀레니엄 세대시군요.");
		}else {
			System.out.println("밀레니엄 세대가 아니시군요");
		}
		
		//토일은 쉬고, 아니면 공부
		int day = date.getDay();
		switch (day) {
		case 6: case 7:
			System.out.println("쉬~~~~자");
			break;
		default:
			System.out.println("열심히 공부하자");
			break;
		}

		//월별 날짜 수 표기
		int month = date.getMonth() + 1;
		switch (month) {
		case 2: 
			for(int i=0; i<28; i++) {
				System.out.print((i+1) + " ");
			}			
			break;
		case 4: case 6: case 9: case 11: 
			for(int i=0; i<30; i++) {
				System.out.print((i+1) + " ");
			}			
			break;
		default:
			for(int i=0; i<31; i++) {
				System.out.print((i+1) + " ");
			}
			break;
		}
	}

}
