package 형변환;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class 연습문제 {

	public static void main(String[] args) {
		//1. 여행지 중복 X
		HashSet travel = new HashSet();
		travel.add("러시아");
		travel.add("밴쿠버");
		travel.add("바르셀로나");
		travel.add("오사카");
		travel.add("케임브리지");
		
		travel.add("밴쿠버");		//중복체크
		travel.add("케임브리지");
		System.out.println("가고싶은 여행지 : " + travel);
		
		System.out.println("===========================");
		
		//2. 각방 물건 배치 
		HashMap room = new HashMap();
		room.put("안방", "TV");
		room.put("거실", "소파");
		room.put("부엌", "냉장고");
		room.put("현관", "신발");
		
		System.out.println(room);				//2-1
		System.out.println("현관에는 " + room.get("현관") + "이 있다");		//2-2
		room.replace("거실", "책상");				//2-3
		System.out.println(room);
		
		System.out.println("===========================");
		
		//3. 할 일 우선순위
		LinkedList todo = new LinkedList();
		todo.add("강의듣기");
		todo.add("복습하기");
		todo.add("문제풀이하기");
		todo.add("게임하기");
		todo.add("타코야끼 사먹기");
		System.out.println(todo);		//3-1
		System.out.println(todo.getFirst());	//3-2
		System.out.println(todo.getLast());
		todo.set(1, "청소");				//3-3
		System.out.println(todo);
		
		
		
		
	}

}
