package 프로그래머스연습문제;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열의유사도 {

	public static void main(String[] args) {
		String[] arr1 = {"a", "b", "c"};
		String[] arr2 = {"com", "b", "c", "p"};
		int cnt = 0;
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr2));
		for(String a : arr1) {
			if(list.contains(a)) cnt++;
		}
		System.out.println(cnt);
	}

}
