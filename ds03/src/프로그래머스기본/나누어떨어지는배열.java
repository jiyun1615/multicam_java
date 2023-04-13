package 프로그래머스기본;

import java.util.ArrayList;
import java.util.Arrays;

public class 나누어떨어지는배열 {

	public static void main(String[] args) {
		
		int[] arr = {1,3,5, 10};
		int advisor = 5;
		
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%advisor == 0) {
				list.add(arr[i]);
			}
		}
		if(!list.isEmpty()) {
			list.add(-1);
		}
		
		int[] ans = new int[list.size()];
		for(int i=0; i<list.size(); i++) {
			ans[i] = list.get(i);
		}

		Arrays.sort(ans);
		
		System.out.println(list);
		
	}

}
