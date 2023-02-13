package 배열심화;

public class 깊은복사응용 {

	public static void main(String[] args) {
		String[] subjects = {"국어", "영어", "수학", "컴퓨터", "회화"};
		int[] sem1 = {44, 66, 22, 99, 100};
		int[] sem2 = sem1.clone();
		sem2[0] = 22;
		sem2[1] = 88;
		
		//0. 전체 1학기, 2학기 성적 출력
		for(int x : sem1) {
			System.out.print(x + " ");
		}
		System.out.println();
		for(int x : sem2) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		//1. 1학기, 2학기 성적 중 동일한 성적과목수
		int cnt = 0;
		for(int i=0; i<sem1.length; i++) {
			if(sem1[i] == sem2[i]) cnt++;
		}
		System.out.println("1,2학기 동일한 성적 과목수 : " + cnt);
		
		//2. 1,2학기 성적 중 오른 과목 수 
		int cnt1 = 0;
		for(int i=0; i<sem1.length; i++) {
			if(sem1[i] < sem2[i]) cnt1++;
		}
		System.out.println("2학기에 성적이 오른 과목수 : " + cnt1);
		
		//3. 1, 2학기 성적 중 오른 과목 명
		System.out.print("2학기에 오른 과목 : ");
		for(int i=0; i<sem1.length; i++) {
			if(sem1[i] < sem2[i]) {
				System.out.print(subjects[i]);
			}
		}
		
		
		
	}

}
