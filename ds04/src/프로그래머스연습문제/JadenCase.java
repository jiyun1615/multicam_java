package 프로그래머스연습문제;

public class JadenCase {

	public static void main(String[] args) {
		String s = "3people unFollowed me";
		s = s.toLowerCase();
		String str = "";
		if(s!= null) {
			String[] s1 = s.split(" ");
			int len = s1.length-1;
			for(int i=0; i<len; i++) {
				s1[i] = s1[i].substring(0,1).toUpperCase() + s1[i].substring(1);
				str += s1[i] + " ";
			}
			str += s1[len] = s1[len].substring(0,1).toUpperCase() + s1[len].substring(1);
			
		}
		System.out.println(str);
		
	}

}
