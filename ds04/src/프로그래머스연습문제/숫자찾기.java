package 프로그래머스연습문제;

import java.util.ArrayList;

public class 숫자찾기 {

	public static void main(String[] args) {
		int num =2324435;
		int k = 7;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(num >= 1)	{
			int a = num%10;
			num /= 10;
			list.add(a);
		}
		int answer = 0;
		if(list.lastIndexOf(k) == -1) {
			answer = -1;
		}else {
			answer = list.size() - list.lastIndexOf(k);
		}
		System.out.println(answer);
	}

}
