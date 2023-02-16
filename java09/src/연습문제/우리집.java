package 연습문제;

public class 우리집 {

	public static void main(String[] args) {
		System.out.println("아버지 처음 돈? " + 딸.dadPocket + "원");
		딸 d1 = new 딸("홍길순", "여");
		딸 d2 = new 딸("홍길진", "여");
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("딸이 몇명? " + 딸.cnt + "명");
		System.out.println("아버지 남은 돈? " + 딸.dadPocket + "원");
	}

}
