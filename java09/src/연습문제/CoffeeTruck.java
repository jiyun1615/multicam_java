package 연습문제;

public class CoffeeTruck extends Truck{
	String coffee;
	int price;

	public CoffeeTruck(String coffee, int price) {
		this.coffee = coffee;
		this.price = price;
	}
	
	public void sell() {
		System.out.println(name + "에서는 " + coffee + "를 " + price + "원에 판매합니다.");
	}

	@Override
	public String toString() {
		return "CoffeeTruck [coffee=" + coffee + ", price=" + price + ", color=" + color + ", name=" + name + ", year="
				+ year + "]";
	}
	
	
}
