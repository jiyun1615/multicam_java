package 배열복습;

import java.util.Random;

public class 토익채점 {

	public static void main(String[] args) {
		int[] ans = new int[9900];
		int[] myAns = new int[9900];
		
		Random r = new Random(42);
		for(int i=0; i<ans.length; i++) {
			ans[i] = r.nextInt(4)+1;
			myAns[i] = r.nextInt(4)+1;
		}
		
		System.out.println("번호 :\t답안\t내 답안");
		int cnt = 0;
		for(int i=0; i<ans.length; i++ ) {
			System.out.print(i + " :\t" + ans[i] + "\t" + myAns[i]);
			System.out.println();
			if(ans[i] == myAns[i]) {
				cnt++;
			}
		}
		System.out.println("토익 점수: " + cnt + "점");
//		System.out.println(ans.length);
//		System.out.println(myAns.length);
		

	}

}
