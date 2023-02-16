package 생성자;

public class 회사창업 {

	public static void main(String[] args) {
		직원 com1 = new 직원("홍길동", 25, "남");
		
		직원 com2 = new 직원("김길동", 24, "여");
		
		직원 com3 = new 직원("송길동", 26, "남");
		
		System.out.println("직원 수 : " + 직원.cnt);
		System.out.println(com1.toString());
		System.out.println(com2.toString());
		System.out.println(com3.toString());
//		System.out.println("직원 평균 나이 : " + 직원.ageSum / 직원.cnt);
		직원.getAvg();
	}

}
