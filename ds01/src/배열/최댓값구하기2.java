package 배열;

import java.util.Arrays;
import java.util.Random;

public class 최댓값구하기2 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[10];
		int[] arr2 = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(1000);
			arr2[i] = r.nextInt(1000);
		}
		
		Arrays.sort(arr);
		
		System.out.println("최댓값은 " + arr[arr.length-1]);
		System.out.println("최솟값은 " + arr[0]);
		
		if(Arrays.equals(arr, arr2)) {
			System.out.println("같습니당");
		}else {
			System.out.println("다릅니당");
		}
		
		String re = Arrays.toString(arr);
		String re2 = Arrays.toString(arr2);
		System.out.println(re);
		
		System.out.println(re.length());
		System.out.println(re.concat(re2));
		System.out.println(re.charAt(0));
		System.out.println(re.concat(re2));
		
	}

}
