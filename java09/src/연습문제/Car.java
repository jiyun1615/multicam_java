package 연습문제;

public class Car {
	String color;
	String name;
	int year;

	public void run() {
		System.out.println(name + "이가 빠르게 달립니다.");
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", name=" + name + ", year=" + year + "]";
	}
	
	
}
