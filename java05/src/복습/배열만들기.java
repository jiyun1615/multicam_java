package 복습;

public class 배열만들기 {

	public static void main(String[] args) {
		
		//hobby 배열
		String[] hobby = {"run", "book", "swim", "walk"};
		
//		System.out.println(hobby);	//참조형이니까 주소가 출력됨
		System.out.println("0 : " + hobby[0]);
		System.out.println("길이 : " + hobby.length);
		System.out.println("마지막값 : " + hobby[hobby.length-1]);
		
		for(int i=0; i<hobby.length; i++) {
			System.out.println(i + " : " + hobby[i]);
		}
		
		//for-each문 *****
		for(String x : hobby) {
			System.out.println(x);
		}
		
		
		System.out.println("---------------------------");
		
		
		//jobs 배열
		String[] jobs = new String[5];
		
//		System.out.println(jobs);
		jobs[0] = "백엔드 프로그래머";
		jobs[1] = "카페주인";
		System.out.println("0 : " + jobs[0]);
		System.out.println("1 : " + jobs[1]);
		System.out.println("4 : " + jobs[4]);	//5는 outofbounds error
		System.out.println();
		for(int i=0; i<jobs.length; i++) {
			System.out.println(i + " : " + jobs[i]);
		}
		
	}

}
