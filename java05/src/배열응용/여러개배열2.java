package 배열응용;

public class 여러개배열2 {

	public static void main(String[] args) {
		String[] names = {"홍길동", "이순신", "김혜린", "김민지", "김혜인"};
		int[] term1 = {77,88,99,55,70};
		int[] term2 = {99,100,88,80,70};
		
		int cntUp = 0;
		int cntEqual = 0;
		
		//1. 2학기 성적인 오른 학생 수
		for(int i=0; i<term1.length; i++) {
			if(term1[i] < term2[i]) cntUp++;
		}
		System.out.println("1. 2학기 성적이 더 오른 학생 수 : " + cntUp);
		
		//2. 1,2학기 성적 동일 학생수
		for(int i=0; i<term1.length; i++) {
			if(term1[i] == term2[i]) cntEqual++;
		}
		System.out.println("2. 1,2학기 성적 동일 학생 수 : " + cntEqual);
		
		//3. 2학기 만점자 이름
		System.out.print("3. 2학기 만점자 이름 : ");
		for(int i=0; i<term1.length; i++) {
			if(term2[i] == 100) {
				System.out.print(names[i] + " ");
			}
		}
		System.out.println();
		
		//4. 1,2학기 중 더 높은 성적 평균
		int sum1 = 0;
		int sum2 = 0;
		for(int i=0; i<term1.length; i++) {
			sum1 += term1[i];
			sum2 += term2[i];
		}
		int sum = sum1 > sum2 ? sum1 : sum2;
		int avgUp = sum/term1.length;
		System.out.println("4. 1,2학기 중 더 높은 성적 평균 : " + avgUp);
		
		//5. (심화) 김혜린의 1,2학기 성적은?
		int p = 0;
		for(int i=0; i<term1.length; i++) {
			if(names[i].equals("김혜린")) {
				p = i;
				break;
			}
		}
		System.out.println("5.\t김혜린의 1학기 성적 : " + term1[p] + "\n\t김혜린의 2학기 성적 : " + term2[p]);
	}

}
