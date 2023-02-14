package 부품만들기;

public class 전화기 {
	//성질 : 멤버변수
	
	//동작 : 멤버 메서드 -> 동적인 기능을 수행
	//	인터넷하다, 카톡하다.
	
	public int price;
	public String shape;		//멤버변수는 자동 초기화! 0, null
	
	public void doInternet() {
		System.out.println("와이파이 연결");
		System.out.println("데이터 연결");
	}
	
	public void kakao() {
		System.out.println("자바 단체톡을 하다.");
		System.out.println("게시물을 올리다.");
	}
	
}
