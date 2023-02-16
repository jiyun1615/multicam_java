package 생성자;

public class 전화기사용하기 {

	public static void main(String[] args) {
		//전화기 2개를 만들어보자
		
		전화기 p1 = new 전화기();
		전화기 p2 = new 전화기();
		
		p1.price = 1000;
		p1.shape = "폴더";
		p1.doInternet();
		
		p2.price = 2000;
		p2.shape = "네모";
		p2.kakao();
		
		System.out.println("p1의 가격 : " + p1.price);
		System.out.println("p1의 모양 : " + p1.shape);
		System.out.println("p2의 가격 : " + p2.price);
		System.out.println("p2의 모양 : " + p2.shape);
		
		

	}

}
