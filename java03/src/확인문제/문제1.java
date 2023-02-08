package 확인문제;

import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//문제 1
		System.out.print("ID : ");
		String id = sc.nextLine();
		System.out.print("PW : ");
		String pw = sc.nextLine();
		
		if(id.equals("root") && pw.equals("1234")) {
			System.out.println("로그인 성공!");
		}else {
			System.out.println("로그인 실패!");
		}
		
		//문제 2
		System.out.print("사과 가격 : ");
		int a_price = sc.nextInt();
		System.out.print("사과 구매 갯수 : ");
		int a_cnt = sc.nextInt();
		System.out.print("딸기 가격 : ");
		int s_price = sc.nextInt();
		System.out.print("딸기 구매 갯수 : ");
		int s_cnt = sc.nextInt();

		int a_result = a_price * a_cnt;
		int s_result = s_price * s_cnt;
		int total = a_result + s_result;
		System.out.println("사과 구매 가격은 " + a_result + "입니다.");
		System.out.println("딸기 구매 가격은 " + s_result + "입니다.");
		System.out.println("총 구매 가격은 " + total + "입니다.");
		
	}

}
