package 상속;

public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;					//채널 10으로 설정
		ctv.channelUp();					//채널+1
		System.out.println(ctv.channel);	//채널상태 출력
		ctv.displayCaption("Hello.");	//caption 상태 true면 내용물 출력
		ctv.caption = true;						//caption 상태 true로 변경
		ctv.displayCaption("Hello. World!");	//caption 상태 true면 내용물 출력

	}

}
