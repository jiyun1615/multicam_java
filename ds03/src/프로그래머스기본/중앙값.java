package 프로그래머스기본;

import java.util.Arrays;

public class 중앙값 {

	public static void main(String[] args) {
		int[] arr = {0, 3, 11,10,2,4};
		
		Arrays.sort(arr);
		
		int answer = arr[arr.length/2] + arr[arr.length/2-1];
		
		System.out.println(answer);
		
	}

}
