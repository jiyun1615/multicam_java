package 반복문;

public class 반복문내에서스킵 {

	public static void main(String[] args) {
		//1번부터 10번까지 데이터 중에서 짝수만 프린트
		for(int i=1; i<=10; i++) {
			if(i%2 == 1) {	//홀수
				continue;
			}
			else {
				System.out.println(i);
				System.exit(0);		//완전 끗);
			}
		}
		System.out.println("for문 끝~");

	}

}
