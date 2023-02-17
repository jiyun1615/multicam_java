package 상속기본;

public class Car사용 {

	public static void main(String[] args) {
		Car car1 = new Car();
		FlyCar fly1 = new FlyCar();
		
		car1.name = "스포츠카";
		car1.color = "red";
		car1.price = 100000000;
		car1.run();
		
		fly1.fly = true;
		fly1.name = "플라잉카";
		fly1.color = "white";
		fly1.price = 300000000;
		fly1.fly();
		System.out.println(car1);
		System.out.println(fly1);
	}

}
