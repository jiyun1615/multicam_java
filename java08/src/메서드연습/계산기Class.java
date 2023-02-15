package 메서드연습;

public class 계산기Class {
	public void 더하기(int x, int y) {
		System.out.println(x + " + "+ y + " = " + (x+y));
	}
	
	public void 곱하기(int x, int y, int z) {
		System.out.println(x + " x "+ y +" x "+ z + " = " + (x*y*z));
	}
	
	public int 빼기(int x, int y) {
		return (x-y);
	}
}
