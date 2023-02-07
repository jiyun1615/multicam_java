package 연습문제;

import javax.swing.JOptionPane;

public class 문제2 {

	public static void main(String[] args) {
		
		//1
		String pw = JOptionPane.showInputDialog("암호를 대시오");
		
		if (pw.equals("pass")) {
			System.out.println("들어오세요");
		}else {
			System.out.println("나가세요");
		}
		
		//2
		String choice = JOptionPane.showInputDialog("오늘 먹고 싶은 저녁 메뉴는? (자장면, 라면, 회)");
		
		if(choice.equals("자장면")) {
			System.out.println("중국집으로 가요");
		} else if(choice.equals("라면")) {
			System.out.println("분식집으로 가요");
		} else if(choice.equals("회")) {
			System.out.println("횟집으로 가요");
		} else {
			System.out.println("그냥 안먹어요");
		}
		
		
		
		//3
		String a = JOptionPane.showInputDialog("1번 정수를 입력하세요 ");
		String b = JOptionPane.showInputDialog("2번 정수를 입력하세요 ");
		
		int a_ = Integer.parseInt(a);
		int b_ = Integer.parseInt(b);
		
		if(a_ > b_) {
			System.out.println("1번 정수가 더 크네요");
		}else if (a_ < b_) {
			System.out.println("2번 정수가 더 크네요");
		}else {
			System.out.println("두 정수는 같은 수네요");
		}
		
		
		
		//4
		String no = "A100EX";
		char front = no.charAt(0);
		
		switch (front) {
		case 'A':
			System.out.println("기획부");
			break;
		case 'B':
			System.out.println("총무부");
			break;
		case 'C':
			System.out.println("개발부");
			break;
		default:
			System.out.println("해당부서 없음");
			break;
		}
		
		
	}

}
