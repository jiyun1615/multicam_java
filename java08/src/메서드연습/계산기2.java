package 메서드연습;

public class 계산기2 {
	
	//다형성 - 오버로딩
	//같은 이름 메서드, 매개변수가 다름
	
	public int add(int x, int y) {
		return x+y;
	}
	
	public double add(double x, int y) {
		return x+y;
	}
	
	public double add(double x, double y) {
		return x+y;
	}
	
	public String add(String x, int y) {
		return x+y;
	}
}
