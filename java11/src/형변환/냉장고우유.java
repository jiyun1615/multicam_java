package 형변환;

import java.util.LinkedList;

public class 냉장고우유 {

	public static void main(String[] args) {
		//Queue, FIFO(First In First Out)
		LinkedList milk = new LinkedList();
		
		milk.add("어제 우유");
		milk.add("신선한 우유");
		milk.add("엄청 신선한 우유");
		
		System.out.println(milk);
		milk.remove();
		System.out.println(milk);
	}

}