package 복습;

public class Mask {
	//멤버변수
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
		return "마스크 [color=" + color + ", price=" + price + ", cnt=" + cnt + "]";
	}
}
