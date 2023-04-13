package 프로그래머스기본;

public class 폰번호가리기 {

	public static void main(String[] args) {
		String s = "01011112222";
		String end = s.substring(s.length()-4, s.length());
		
		
		String front = "";
		
		for(int i=0; i<(s.length()-4); i++) {
			front += "*";
		}
		
		String answer = front + end;
	}

}
