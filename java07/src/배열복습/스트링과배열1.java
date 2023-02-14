package 배열복습;

public class 스트링과배열1 {

	public static void main(String[] args) {
		String s = "나는 프로그래머야 ";
		String s2 = "진짜!";
		System.out.println(s + s2);
		System.out.println(s.concat(s2));	//String 결합
		System.out.println(s.charAt(0));
		System.out.println(s.endsWith("야"));		//"야"로 끝나는지 확인
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 8));
		System.out.println(s.contains(s2));  		//s2를 포함하고 있는지 확인
		System.out.println(s.lastIndexOf("프"));		//"프"의 위치
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.length());
		System.out.println(s.replace("나", "너"));
	}

}
