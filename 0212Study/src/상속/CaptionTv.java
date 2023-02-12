package 상속;

public class CaptionTv extends Tv{
	boolean caption;
	
	void displayCaption(String text) {
		if(caption) {					//caption 상태가 true 일 경우에 상태 출력 함수
			System.out.println(text);
		}
	}
}
