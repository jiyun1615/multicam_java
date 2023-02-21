package 형변환;

public class 기본형형변환 {

	public static void main(String[] args) {
		byte b1 = 100;	//1byte = -128~127
		int i1 = 200; 	//4byte = -21억, 21억
		
		i1 = b1;		//작은 값이 큰 값에 들어가니까 자동형변환
		//byte범위 넘어가는 경우에는 강제형변환하지 않아야함!
		
		System.out.println(i1); 
		
//		b1 = i1;		//큰 값이 작은 값으로 그냥 들어갈 수 없음.
		b1 = (byte)i1;	//강제형변환만 가능
		
		double d1 = i1;
		i1 = (int)d1;		//강제형변환
	}

}
