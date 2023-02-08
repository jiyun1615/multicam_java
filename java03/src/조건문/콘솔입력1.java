package 조건문;

import java.util.Scanner;

public class 콘솔입력1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("(1.주중  2.주말)요일 입력 : ");
		int data =sc.nextInt();
		if(data == 1) {
			System.out.println("열심히 달리자");
		}else {
			System.out.println("푹 쉬어ㅓ");
		}
		
		System.out.print("주말에 뭐할까? ");
		String data2 = sc.nextLine();
		System.out.println("나는 주말에 " + data2 + "를 할거야.");

	}

}
