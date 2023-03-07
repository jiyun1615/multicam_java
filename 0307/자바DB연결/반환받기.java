package 자바DB연결;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;

public class 반환받기 {

	public static void main(String[] args) {
		반환값연습 re = new 반환값연습();
		re.add2();
		
		int result1 = re.add(100, 200);
		System.out.println(result1);
		
		double result2 = re.add(33.3, result1);
		System.out.println(result2);
		
		String result3 = re.add("이제 곧 점심이다", "점심은 커리~");
		System.out.println(result3);
		
		String result4 = re.add(100, "은 나의 백넘버");
		System.out.println(result4);
		
		int[] result5 = re.add();
		for(int x : result5) {
			System.out.println(x);
		}
		
		Date d = re.getDate();
		System.out.println(d.getMinutes());
		System.out.println(d.getSeconds());
		System.out.println(d.getDay());
		
		Random r = re.getRandom();
		System.out.println(r);
		
		int r1 = re.getRandom2();
		System.out.println(r1);
		
		int hour = re.getHour();
		System.out.println(hour);
		
		ArrayList result9 = re.getList();
		for(Object x : result9) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		HashSet result10 = re.getSet();
		for(Object x : result10) {
			System.out.print(x + " ");
		}
		
		
		System.out.println(System.getenv());
	}

}
