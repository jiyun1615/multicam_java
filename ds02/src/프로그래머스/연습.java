package 프로그래머스;

import java.util.Arrays;

public class 연습 {

	public static void main(String[] args) {
		
		String s = "ppppyyyy";
		int cntP = 0;
		int cntY = 0;
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);	
			if(c == 'p' || c == 'P') {
				cntP++;
			}else if(c == 'y' || c == 'Y') {
				cntY++;
			}
		}
		boolean answer = true;
		if(cntP == cntY) {
			answer = true;
		}
	}

}
