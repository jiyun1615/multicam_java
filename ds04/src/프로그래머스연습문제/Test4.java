package 프로그래머스연습문제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {

		String[] 냉장고음식 = { "감자", "고구마", "우유", "감자", "양파" };
		List<String> list = new ArrayList<>(Arrays.asList(냉장고음식));

		// 1. 감자가 들어있는 마지막 위치를 구해보세요. 전체 출력
		int location = list.lastIndexOf("감자");
		System.out.println("#1 감자가 들어있는 마지막 위치 : " + location);

		// 2. 양파를 포함하고 있으면 "양파는 안사도 된다"
		// 포함X면 "양파사서 냉장고에 넣어야 한다."
		// 전체 출력
		System.out.print("#2 ");
		if (list.contains("양파")) {
			System.out.println("양파는 안사도 된다");
		} else {
			System.out.println("양파사서 냉장고에 넣어야 한다.");
		}
		System.out.println(list);

		// 3. 우유를 춘식이 우유로 수정
		System.out.print("#3 ");
		int milkLoc = list.indexOf("우유");
		list.set(milkLoc, "춘식이 우유");
		System.out.println(list);

		// 4. 양파를 찾아서 위치를 찾은 후 해당 위치에 "양파즙"이라고 수정
		System.out.print("#4 ");
		int onionLoc = list.indexOf("양파");
		list.set(onionLoc, "양파즙");
		System.out.println(list);

		// 5. 다시 배열로 변환하여 전체 내용을 출력
		String arr[] = list.toArray(new String[list.size()]);
		System.out.print("#5 ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
