package 연습문제;

public class UseCar {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.name = "스포츠카";
		car1.color = "red";
		car1.year = 1;
		car1.run();
		System.out.println(car1);
		System.out.println("==================");
		
		Truck truck1 = new Truck();
		truck1.color = "white";
		truck1.space();
		truck1.run();
		System.out.println("==================");
		
		CoffeeTruck ct1 = new CoffeeTruck("아메리카노", 3000);
		ct1.name = "커피차";
		ct1.color = "black";
		ct1.year = 2;
		ct1.sell();
		System.out.println(ct1.toString());
		
	}

}
