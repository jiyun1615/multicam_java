package 배열복습;

public class 이차원배열프린트 {

	public static void main(String[] args) {
		int[][] n1 = {
				{1, 2, 3},
				{4, 5, 6, 7}
		};
		
		//n1.length
		System.out.println(n1.length);
		
		//n1 배열 전부 출력
		for(int i=0; i<n1.length; i++) {
			for(int j=0; j<n1[i].length; j++) {
				System.out.print(n1[i][j] + " ");
			}
			System.out.println();
		}
		
		int[][] n2 = new int[2][3];
		

	}

}
