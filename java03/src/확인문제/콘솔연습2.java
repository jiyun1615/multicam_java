package 확인문제;

import java.util.Scanner;

public class 콘솔연습2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나의 이름은 ?");
		String name = sc.nextLine();
		System.out.print("나의 키는 ?");
		double height = sc.nextDouble();
		System.out.print("나의 몸무게는?");
		double weight = sc.nextDouble();
		System.out.print("나는 저녁을 먹었나요?(true/false)");
		boolean din = sc.nextBoolean();
		sc.nextLine();
		System.out.print("나의 좌우명은?");
		String text = sc.nextLine();
		
		System.out.print("내 이름은 " + name + "입니다.");
		System.out.print("내 내년 키는 " + (height+10) + "입니다.");
		System.out.print("내 내년 몸무게는 " + (weight - 10) + "입니다.");
		if(din == true) {
			System.out.print("나는 저녁을 먹었습니다.");	
		}else {
			System.out.print("나는 저녁을 먹지 않았습니다..");
		}
		System.out.print("내 좌우명은 \'" + text + "\'입니다.");
		

	}

}
