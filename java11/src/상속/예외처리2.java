package 상속;

import java.io.FileWriter;
import java.io.IOException;

public class 예외처리2 {

	public static void main(String[] args) {
		
		System.out.println("1.프린트 가능");
		try {
			FileWriter file = new FileWriter("test.txt");
			file.write("Hello");
			file.write("Byebye");
			file.close();
		}catch(IOException e){
			System.out.println("에러 발생");
		}
		
		System.out.println("3.프린트되나요?");
		
	}

}
