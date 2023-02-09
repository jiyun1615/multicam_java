package 제어문;

import java.util.Scanner;

public class 인기투표 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int IU=0, bts=0, nj = 0;
		
		System.out.println("인기 투표를 실시합니다!");
		System.out.println("--------------------------");
		
		while(true) {
			System.out.println("1.아이유 2.방탄 3.뉴진스 4.종료");
			System.out.print("당신의 선택은 : ");
			
			int choice = sc.nextInt();
			
			if(choice == 4) {		//종료면 그냥 끝이니까 이걸 제일 먼저!!
				break;
			}else if (choice == 2) {
				bts++;
			}else if(choice == 3){
				nj++;
			}
			else {
				IU++;
			}
		}
		
		
		System.out.println("--------------------------");
		System.out.println("투표결과!");
		System.out.println("아이유 : " + IU + "\n방탄 : " + bts + "\n뉴진스 : " + nj);
		

		sc.close();
	}

}
