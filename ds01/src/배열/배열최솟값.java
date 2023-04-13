package 배열;

public class 배열최솟값 {

	public static void main(String[] args) {
		int[] s = {90, 80, 20, 60, 70};
		
		int min = s[0];
		for(int x : s) {
			if(x<min) {
				min = x;
			}
		}
		System.out.println("배열 s의 최솟값은 " + min);
	}

}
