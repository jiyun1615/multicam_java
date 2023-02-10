package 배열응용;

import java.util.Scanner;

public class 입력배열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] lastTravel = new String[3];
		String[] thisTravel = new String[3];
		
		//작년에 가고 싶었던 곳 3
		System.out.print("작년에 가고 싶었던 곳 3군데를 입력해 주세요 : ");
		for(int i=0; i<lastTravel.length; i++) {
			lastTravel[i] = sc.next();			
		}
		
		//올해 가고싶은 곳 3
		System.out.print("올해 가고 싶은 곳 3군데를 입력해 주세요 : ");
		for(int i=0; i<thisTravel.length; i++) {
			thisTravel[i] = sc.next();			
		}
		
		//동일한 곳은??(같은 위치 장소만 비교) count!
		
		int cnt = 0;
		System.out.print("동일한 장소 : ");
		for(int i=0; i<lastTravel.length; i++) {
			if(lastTravel[i].equals(thisTravel[i])) {
				System.out.print(lastTravel[i] + " ");
				cnt++;
			}
		}
		System.out.println();
		System.out.println("동일 장소 갯수 : " + cnt);
		
		sc.close();
	}

}
