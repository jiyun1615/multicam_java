package 상속기본;

public class FlyCar extends Car {
	boolean fly;
	
	public void fly() {
		System.out.println("빠르게 날다.");
	}

	@Override
	public String toString() {
		return "FlyCar [fly=" + fly + ", name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	
	
}
