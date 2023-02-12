package 상속;

public class Tv {
	boolean power;
	int channel;
	
	void power() {power = !power;}		//전원 끄고 켜기
	void channelUp() { ++channel;}
	void channelDown() { --channel;}
}
