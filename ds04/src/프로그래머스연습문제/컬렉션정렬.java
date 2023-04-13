package 프로그래머스연습문제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 컬렉션정렬 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(800);
		list.add(700);
		list.add(200);
		list.add(700);
		list.add(500);
		list.add(200);
		list.add(300);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		int[] array = new int[list.size()];
		for(int i=0; i<array.length; i++) {
			array[i] = list.get(i);
		}
		System.out.println(Arrays.toString(array));
		
		array[0] = 1000;
		
		//수정된 배열을 arraylist를 새로 만들어 넣은 후 프린트
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		for(int i=0; i<array.length; i++) {
			list1.add(array[i]);
		}
		
		System.out.println(list1);
	}

}
