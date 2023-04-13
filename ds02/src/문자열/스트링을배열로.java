package 문자열;

public class 스트링을배열로 {

	public static void main(String[] args) {
		String all ="국어, 영어, 수학, 컴퓨터";
		all = all.trim();
		String[] all3 = all.split(",");
		for(int i=0; i<all3.length; i++) {
			all3[i] = all3[i].trim();
		}
		System.out.println("과목 수 :" + all3.length);
		
//		
//		for(String a : all3) {
//			System.out.println(a);
//		}
		
		int cnt = 0;
		for(int i=0; i<all3.length; i++) {
			if(all3[i].equals("컴퓨터")) {
				System.out.println("컴퓨터의 위치는 " + i);
			}
			if(all3[i].length() < 3) {
				cnt++;
			}
		}
		System.out.println("글자수가 3 미만인 과목 수 : " + cnt);
		
	}

}
