package 형변환;

import java.util.HashMap;

public class 사전문제 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		//map.put(key, value);
		map.put("사과", "Apple");
		map.put("멜론", "Melon");
		map.put("바나나", "banana");
		System.out.println(map);
		System.out.println(map.get("사과"));
		map.remove("바나나");
		map.replace("멜론", "melon");
		System.out.println(map);
	}

}
