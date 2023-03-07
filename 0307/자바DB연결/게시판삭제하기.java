package 자바DB연결;

import java.util.Scanner;

public class 게시판삭제하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 게시판 no를 입력해주세요");
		int no_ = sc.nextInt();
		
		BBSDAO dao = new BBSDAO();
		dao.delete(no_);

	}

}
