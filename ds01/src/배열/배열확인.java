package 배열;

public class 배열확인 {

	public static void main(String[] args) {
		int[] ages = {60,50,40,30,20};
		
		double[] weight = new double[5];
		weight[0] = 77.8;
		weight[1] = 45.5;
		weight[2] = 55.8;
		weight[3] = 44.8;
		weight[4] = 33.8;		
		
		for(int i=0; i<weight.length; i++) {
			System.out.println(ages[i] + " " + weight[i]);
		}
		
		for(double d : weight) {
			System.out.println(d);
		}
	}

}
