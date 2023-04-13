package 프로그래머스연습문제;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		int[] s = { 5, 2, 1, 9, 11, 15, 17 };
		intPrint(s);
		Arrays.sort(s); 
		intPrint(s);
		
		String[] s2 = {"aaa", "bbb", "ccc", "aaa"};
		stringPrint(s2);
		
		//1. 배열에 aaa가 궁금해요! 
		// --> List로 변형하면, 조금더 다양한 처리들을
		//     for문 사용하지않고 할 수 있음.
		//index를 변형시키는 add/remove를 제외한 다른 작업은 
		//asList()이용해서 List로 변환하여 사용함.
		//add/remove되지 않는 제약이 있음. 
		List<String> list = Arrays.asList(s2); 
		System.out.println(list);
		System.out.println(list.contains("aaa"));
		//1. bbb삭제
		//list.remove(1);
		
		//2. ccc가 들어있는 위치를 찾아보세요.
		System.out.println(list.indexOf("ccc"));
		//3. aaa가 들어있는 마지막 위치를 찾아보세요.
		System.out.println(list.lastIndexOf("aaa"));
		//4. 전체 내용 프린트 
		System.out.println(list);
		//5. 맨 앞에 ddd삽입
		//list.add("ddd");
		System.out.println(list);
		//6. 맨 뒤에 fff삽입
		//7. 인덱스2번의 내용을 ggg로 변경
		list.set(2, "ggg");
		//8. 전체 내용 프린트 
		System.out.println(list);

		//제약이 없는 ArrayLsit를 다시 만들어주면 된다.!
		List<String> list3 = new ArrayList<String>(Arrays.asList(s2));
		list3.add("hahaha");
		list3.remove("bbb");
		System.out.println(list3);
		
		//배열에 한계가 있어서 List로 변환하여
		//다양한 처리를 함.
		//코딩테스트에서는 반환을 거의 배열로 하게 되어 있음.
		//asList로 만든 list를 다시 배열로 만들때 사용하면 됨.
		String[] s3= (String[])list.toArray();
		stringPrint(s3);
	}
	
	public static void intPrint(int[] array) {
		System.out.println(Arrays.toString(array));
	}
	public static void stringPrint(String[] array) {
		System.out.println(Arrays.toString(array));
	}

}
