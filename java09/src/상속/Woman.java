package 상속;

public class Woman extends 사람 {
	boolean cook;
	
	public void drives() {
		System.out.println(name + "이 차를 운전중입니다");
	}

	@Override
	public String toString() {
		return "Woman [cook=" + cook + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
