package 확인문제;

import java.util.Scanner;

public class 콘솔연습1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("취미를 입력하세요: ");
		String hobby = sc.nextLine();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("hobby : " + hobby);
		

	}

}
