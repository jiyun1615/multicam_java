package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
//		int[] x = new int[10];
//		
//		for(int i=0; i<10; i++) {
//			x[i] = i+1;
//		}
//		for(int i=0; i<10; i++) {
//			System.out.print(x[i] + " ");
//		}
		System.out.println();
		//성별
		char[] gender = {'M', 'F', 'F', 'F'};
		//이름
		String[] name = {"아빠", "엄마", "나", "동생"};
		//시력
		double[] eye = {0.1, 0.4, 1.0, 0.1};
		//식사유무
		boolean[] lunch = {true,true,true,true};
		
		for(int i=0; i<4; i++) {
			System.out.print(gender[i] + " ");	
			System.out.print(name[i] + " ");	
			System.out.print(eye[i] + " ");	
			System.out.print(lunch[i] + " ");	
			System.out.println();
		}
		
	}

}
