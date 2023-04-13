package 프로그래머스기본;

public class 최대최소문자열 {

	public static void main(String[] args) {
		String s = "1 2 3 4";
		String[] srr = s.split(" ");
		
		int min = Integer.parseInt(srr[0]);
		int max = Integer.parseInt(srr[0]);
		for(int i=0; i<srr.length; i++) {
			int a = Integer.parseInt(srr[i]);
			if(a < min) {
				min = a; 
			}
			else if(a > max) {
				max = a;
			}
		}
		String ans =  min + " " + max;
		System.out.println(ans);
		
	}

}
