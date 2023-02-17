package 상속기본;

public class Car {
	String name;
	String color;
	int price;
	
	public void run() {
		System.out.println("빠르게 달리다.");
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	
	
}
