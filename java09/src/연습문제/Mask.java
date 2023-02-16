package 연습문제;

public class Mask {
	String color;
	int price;
	int cnt;
	
	public Mask(String color, int price, int cnt) {
		super();
		this.color = color;
		this.price = price;
		this.cnt = cnt;
	}

	@Override
	public String toString() {
		return "Mask [color=" + color + ", price=" + price + ", cnt=" + cnt + "]";
	}
}
