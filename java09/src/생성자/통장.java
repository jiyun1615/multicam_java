package 생성자;

public class 통장 {
	String name;
	String ssn;
	int money;
	
	//생성자
	public 통장(String name, String ssn, int money) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}

	@Override
	public String toString() {
		return "통장 [name=" + name + ", ssn=" + ssn + ", money=" + money + "]";
	}	
}
