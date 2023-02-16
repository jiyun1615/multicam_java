package 상속;

public class SuperMan extends Man{
	boolean fly;
	
	public void space(){
		sleep();
		System.out.println("이름은 " + name);		
		System.out.println("우주를 날다.");
	}
	
	public void eat() {
		System.out.println("많이 먹다ㅏ");
	}

	
	@Override
	public String toString() {
		return "SuperMan [fly=" + fly + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
}
