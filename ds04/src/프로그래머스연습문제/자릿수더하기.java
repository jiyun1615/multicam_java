package 프로그래머스연습문제;

import java.util.ArrayList;

public class 자릿수더하기 {

	public static void main(String[] args) {
		int n = 1234;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(n >= 1) {
			int i = n%10;
			list.add(i);
			n = n/10;
		}
		
		int sum =0;
		for(int i : list) {
			sum+=i;
		}
		System.out.println(sum);
		
	}

}
