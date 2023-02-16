package 연습문제;

public class 딸 {
	String name;
	String gender;
	static int dadPocket = 4000;
	static int cnt;
	
	
	
	public 딸(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
		cnt ++;
		dadPocket -= 1000;
	}
	public void watchTv() {
		System.out.println();
	}
	
	@Override
	public String toString() {
		return "딸 [name=" + name + ", gender=" + gender + "]";
	}
}
