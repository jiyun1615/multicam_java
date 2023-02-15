package 메서드연습;

public class 내가게3 {

	public static void main(String[] args) {
		
		계산기3 cal = new 계산기3();
		
		int price = 7000;
		int count1 = 5;		//오전 손님 수 
		int count2 = 4;		//오후 손님 수
		
		//1. 전체 손님 수
		int result1 = cal.add(count1, count2);
		System.out.println("6 : " + result1);
		
		//2. 오전과 오후 손님 차
		int result2 = cal.minus(count1, count2);
		System.out.println("6 : " + result2);
		
		//3. 오전에 들어온 손님의 결제 금액
		int result3 = cal.mul(price, count1);
		System.out.println("6 : " + result3);
		
		//4. 오후에 들어온 손님의 결제 금액
		int result4 = cal.mul(price, count2);
		System.out.println("6 : " + result4);
		
		//5. 오전 오후 합 총 결제 금액
		int result5 = cal.add(result3 , result4);
		System.out.println("6 : " + result5);
		
		//6. 5번 결제 금액으로 1인당 결제 금액 구하기
		int result6 = cal.div(result5, result1);
		System.out.println("6 : " + result6);
		
		
		
		
		//math 연습
		System.out.println(Math.abs(count1-count2));
	}

}
