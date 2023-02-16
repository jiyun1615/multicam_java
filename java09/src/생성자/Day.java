package 생성자;

public class Day {
	String doing;
	int time;
	String location;
	static int cnt;		//정적변수 -> 0으로 초기화 되지 않음 
	static int sum;		//객체 여러개 생성해도 공유됨
	
	public Day(String doing, int time, String location) {
		//객체 생성 시마다 처리하고 싶은 내용이 있으면 생성자에 넣어주기.
		this.doing = doing;
		this.time = time;
		this.location = location;
		cnt++;
		sum += time;
	}
	

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
}
