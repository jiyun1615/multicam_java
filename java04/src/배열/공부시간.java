package 배열;

public class 공부시간 {

	public static void main(String[] args) {
		//1. 일주일간 공부한 시간 
		int[] week = {10,11,12,13,10,11,12};
		
		//2. 첫번째, 두번째 위치값 프린트
		System.out.println("week 첫번째 index : " + week[0]);
		System.out.println("week 두번째 index : " + week[1]);
		
		//3.
		System.out.println("week 배열의 길이 : " + week.length);

		//4
		week[2] = 10;
		week[4] = 12;
		
		//5
		System.out.println("week 세번째 index : " + week[2]);
		System.out.println("week 다섯번째 index : " + week[4]);
		
		//6
		int[] tour = new int[4];
		
		//7
		tour[0] = 20;
		tour[2] = 30;
		System.out.println("tour 첫번째 index : " + tour[0]);
		System.out.println("tour 두번째 index : " + tour[2]);
		
		//8
		System.out.println("tour배열의 길이 : " + tour.length);
		
	}

}
