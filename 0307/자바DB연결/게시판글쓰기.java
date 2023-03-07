package 자바DB연결;

import java.util.Scanner;

public class 게시판글쓰기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("no, title, content, writer 순으로 입력해주세요");
		int no_ = sc.nextInt();
		String title_ = sc.next();
		String content_ = sc.next();
		String writer_ = sc.next();
		
		BBSDAO dao = new BBSDAO();
		dao.insert(no_, title_, content_, writer_);

	}

}
