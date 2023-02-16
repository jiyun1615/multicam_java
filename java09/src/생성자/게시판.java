package 생성자;

public class 게시판 {
	public static void main(String[] args) {
		Bbs b1 = new Bbs(1, "제목 랄라ㅏ", "가나다라마바사", "길동이");
		Bbs b2 = new Bbs(2, "새pc", "키보드 적응안돼애ㅐ", "재이");
		Bbs b3 = new Bbs(3, "배고파", "오늘 점심도 닭가슴살인데..", "모하");
		
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}
}
