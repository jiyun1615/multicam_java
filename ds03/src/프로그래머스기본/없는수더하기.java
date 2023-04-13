package 프로그래머스기본;

public class 없는수더하기 {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,6,7,8,0};
		int[] num = new int[10];
		
		for(int i=0; i<numbers.length; i++) {
			num[numbers[i]] = 1;
		}
		int sum = 0;
		for(int i=0; i<10; i++) {
			if(num[i] == 0) {
				sum+=i;
			}
		}
		
		System.out.println(sum);
		
	}

}
