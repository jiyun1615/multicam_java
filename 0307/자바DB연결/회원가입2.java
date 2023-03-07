package 자바DB연결;

import java.util.Scanner;

public class 회원가입2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("insert-1, delete-2, update-3 작업하실 번호를 입력해주세요 : ");
		int choice = sc.nextInt();
		
		//memberdao 불러서 값 넘기면서 호출
		MemberDAO dao = new MemberDAO();
		if(choice == 1) {
			System.out.println("id pw name tel 순으로 입력하세요!");
			
			//입력할 값 배열에 받기
			String[] arr = new String[4];
			for(int i=0; i<4; i++) {
				arr[i] = sc.next();
			}
			dao.insert2(arr[0],arr[1],arr[2],arr[3]);	
		}
		else if(choice == 2) {
			System.out.println("삭제하실 멤버의 id를 입력하세요.");
			String id_ = sc.next();
			dao.delete(id_);
		}
		else if(choice == 3) {
			System.out.println("new 번호 / 변경할 멤버 id");
			String tel_ = sc.next();
			String id_ = sc.next();
			dao.update(tel_, id_);
		}
	}

}
