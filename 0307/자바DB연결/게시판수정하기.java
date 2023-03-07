package 자바DB연결;

import java.util.Scanner;

public class 게시판수정하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 내용 : ");
		String content_ = sc.next();
		System.out.println("수정할 게시판 번호 : ");
		int no_ = sc.nextInt();
		
		BBSDAO dao = new BBSDAO();
		dao.update(content_, no_);

	}

}
