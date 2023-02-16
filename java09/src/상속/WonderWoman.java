package 상속;

public class WonderWoman extends Woman{
	int psychic;
	
	public void punch() {
		System.out.println("적을 때려눕히다.");
	}
	
	public void sleep(){
		System.out.println("잠을 거의 안잔다. ");
	}

	@Override
	public String toString() {
		return "WonderWoman [psychic=" + psychic + ", cook=" + cook + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
