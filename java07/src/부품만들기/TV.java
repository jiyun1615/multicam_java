package 부품만들기;

public class TV {
	public int ch;
	public int vol;
	public boolean onOff;		//전역변수 (global) -> 자동 초기화
	
	public void turnCh() {
		int change = 1;	//지역변수 (local) -> 자동 초기화 X
		System.out.println(ch + "에서 " +  change + "로 바꾸다.");
	}
	
	public void youtube() {
		System.out.println(vol + "을 키워서 동영상을 보다.");
	}

	@Override
	public String toString() {
		return "TV [ch=" + ch + ", vol=" + vol + ", onOff=" + onOff + "]";
	}
	
	
}
