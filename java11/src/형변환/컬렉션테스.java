package 형변환;

import java.util.ArrayList;

public class 컬렉션테스 {

	public static void main(String[] args) {
		//콜렉션(collection) : 많은 양의 데이터를 다루는 부품류
		//ArrayList -> 부품 중 하나로 배열 + 사이즈조절 + 타입 아무거나 
		
		 ArrayList list = new ArrayList();	//참조형
		 list.add("홍길동");
		 list.add(100);
		 list.add(11.2);
		 list.add(true);
		 
		 System.out.println(list);	//toString() 재정의 되어있어 주소가 아닌 값들이 출력됨.
		 System.out.println(list.get(0));
		 System.out.println(list.get(1));
		 System.out.println(list.get(2));
		 System.out.println(list.get(3));
		 
		 list.add(0, "김씨");	//위치에 삽입됨
		 System.out.println(list);
		 
		 list.remove(0);			//파괴 함수 : 원본 파괴 함수 -> 원본 변형, ram에 있는 데이터 변경
		 System.out.println(list);
		 
		 list.set(0, "김길동");
		 System.out.println(list);
		 
		 System.out.println(list.indexOf(100));
		 System.out.println(list.contains(11.2));
	}

}
