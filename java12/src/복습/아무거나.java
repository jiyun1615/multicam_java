package 복습;

import java.util.ArrayList;

import javax.swing.JButton;

public class 아무거나 {

	public static void main(String[] args) {
		//인덱스, 순서, 직접 접근 => ArrayList
		ArrayList list = new ArrayList();
		list.add("홍길동");	//String
		list.add(100);		//int
		list.add(11.2);		//double
		list.add(new JButton());		//JButton
		//autiBoxing됨. 랩퍼클래스(포장클래스)
		//ex> double을 Double 클래스로 오토박싱함. -> 이떄의 클래스를 포장클래스라고 함.
		
		String name = (String)list.get(0);	//직접접근! 랜덤 액세스 가능!
		//기본형 제외, 오토 언박싱XX String의 경우는 강제 형변환!
		int age = (Integer)list.get(1);
		//int <- Integer <- Object 오토 언박싱, 강제형변환
		
	}

}
