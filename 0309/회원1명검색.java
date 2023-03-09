package 자바DB연결;

import java.util.Scanner;

public class 회원1명검색 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// memberdao 불러서 값 넘기면서 호출
		System.out.println("검색하실 멤버의 id를 입력하세요.");
		MemberDAO2 dao = new MemberDAO2();
		String id_ = sc.next();
		MemberVO bag = dao.one(id_);
		String total = bag.getId() + ", " + bag.getPw() + ", " + bag.getName() + ", " + bag.getTel();
		System.out.println(total);
		
		sc.close();
	}

}
