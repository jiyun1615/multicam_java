package 프로그래머스기본;

public class 문자열정수로 {

	public static void main(String[] args) {
		String s = "-1234";
		s = s.replace("+", "");
		int a = Integer.parseInt(s);

		System.out.println(a);
	}

}
