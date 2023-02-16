package 생성자;

public class TV {
	public int ch;
	public int vol;
	public boolean onOff;		//전역변수 (global) -> 자동 초기화
	
	//다른 생성자 메서드가 없으면 부품만들 때(객체생성) 자동으로 생성됨.
	//기본 생성자(default constructor)
//	public TV() {			//앞에 void를 쓰지 X -> 기본으로 void 형이기 때문.
//		//자동으로 만들어지는 메서드
//		System.out.println("TV 객체가 하나 생성됨.");
//	}
	//객체 생성시마다 꼭 실행시키고 싶은 내용이 있으면 기본 생성자를 다시 만들기.
	
	
	//마우스 우클릭-source-generateConstructor
	public TV() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	public TV(int ch, int vol, boolean onOff) {
//		this.ch = ch;
//		this.vol = vol;
//		this.onOff = onOff;
//	}
	
	//generate로 만듦
	public TV(int ch, int vol, boolean onOff) {
		super();
		this.ch = ch;
		this.vol = vol;
		this.onOff = onOff;
	}
	
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
