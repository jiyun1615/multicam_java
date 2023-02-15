package 클래스복습;

public class 도로Car {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();		//한 객체당 1멤버변수, 1객체 변수 : 2개씩 저장공간 생김
		
		car1.color = "black";
		car2.color = "blue";
		
		System.out.println(car1.color);
		System.out.println(car2.color);
		
		
		
	}

}
