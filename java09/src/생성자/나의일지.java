package 생성자;

public class 나의일지 {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 8, "스윗홈");
		System.out.println(Day.cnt);
		System.out.println("합한 시간 : " + Day.sum);		
		Day day2 = new Day("시험", 1, "내방");
		System.out.println(Day.cnt);
		System.out.println("합한 시간 : " + Day.sum);
		Day day3 = new Day("산책", 2, "서울 어딘가");
		System.out.println(Day.cnt);
		System.out.println("합한 시간 : " + Day.sum);
		
		//static 변수는 -이탤릭체 -Day클래스로부터 받음. (day1.cnt XXX)
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);

	}

}
