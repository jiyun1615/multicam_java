package 형변환;

import java.util.ArrayList;

import javax.swing.JButton;

public class 참조형형변환 {

	public static void main(String[] args) {
		//클래스형변환 == 참조형형변환
		//상속! 관계일때만 형변환이 가능
		ArrayList list = new ArrayList();
		//다형성 -> Object에 여러 형들을 집어 넣을 수 있음.
		//자동형변환, Upcasting
		list.add("홍길동");
		list.add(100);
		list.add(11.2);
		list.add(new JButton("button"));
		
		String name = (String)list.get(0);
		//String이 가지는 메서드를 쓰러면 반드시 String으로 강제형변환해줘야함.
		System.out.println(name.charAt(0));
		System.out.println(name.length());
		
		int age = (Integer)list.get(1);
		System.out.println(age + 1);
		
		double score = (Double)list.get(2);
		System.out.println(score + 10);
		
		JButton b = (JButton)list.get(3);
		b.setText("Button");
		
	}

}
