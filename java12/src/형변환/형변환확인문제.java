package 형변환;

import java.util.ArrayList;
import java.util.Scanner;

public class 형변환확인문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나에 대한 데이터를 모아보세요.");
		ArrayList me = new ArrayList();
		me.add("신지윤");
		me.add(1000);
		me.add(166.2);
		me.add(true);
		me.add('여');
		
		//1. 전체 목록 프린트
		System.out.print("1 : ");
		for(int i=0; i<me.size(); i++) {
			System.out.print(me.get(i)+" ");
		}
		
		//2. 돈 1000 꺼내서 2000을 더해 프린트
		System.out.println("2 : " + ((Integer)me.get(1)+2000));
		
		//3. 키 꺼내서 10더해 프린트
		System.out.println("3 : " + ((Double)me.get(2)+10));
		
		//4. 아침여부 꺼내서 프린트
		System.out.print("4 : ");
		if((Boolean)me.get(3) == true) {
			System.out.println("배부르다ㅏ");
		}else {
			System.out.println("배고파!");
		}
		
		//5. 성별 꺼내서 주민번호
		System.out.print("5 : ");
		if((char)me.get(4) == '여') {
			System.out.println("주민번호는 2, 4에요.");
		}else {
			System.out.println("주민번호는 1, 3에요.");
		}
		//6. 2~3에서 형변환 오토박싱, 오토언박싱 과정을 순서대로 작성
		System.out.println("2번 : Object -> Integer -> int ");
		System.out.println("\t강제형변환\t            오토언박싱");
		System.out.println("3번 : Object -> Double -> double ");
		System.out.println("\t강제형변환\t            오토언박싱");
	}

}
