package 상속기본;

public class 볼펜 extends 학용품{
	String thick;
	
	public void write() {
		System.out.println("글쓰기");
	}

	@Override
	public String toString() {
		return "볼펜 [thick=" + thick + ", price=" + price + ", company=" + company + "]";
	}
	
	
}
