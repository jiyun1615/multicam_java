package 문자열;

public class 스트링비교 {

	public static void main(String[] args) {
		String s = "정길동";
		String s2 = "정길동";
		
		System.out.println(s);
		System.out.println(s2);
		
		//값이 같니?
		System.out.println(s.equals(s2));
		
		//같은 값을 가르키는  두개 포인터 => 주소가 같음..?
		
		//주소값이 같니?
		System.out.println(s == s2);
		
		
		StringBuilder builder = new StringBuilder();
		builder.append("송길동");
		System.out.println(builder);
		
	}

}
