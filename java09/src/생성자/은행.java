package 생성자;

public class 은행 {

	public static void main(String[] args) {
		통장 travelBank = new 통장("홍길동", "990909", 10000);
		통장 houseBank = new 통장("홍길동", "990909", 30000);
		
		System.out.println(travelBank.name);
		System.out.println(travelBank.money);
		
		//통장에 toString() 정의 되어 있음 
		//  따라서 그냥 출력해도 주소값이 아닌 string 값이 나옴
		System.out.println(travelBank);
		System.out.println(houseBank);

	}

}
