package 배열;

public class 배열개념 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40};
		System.out.println(arr);		//
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr.length);
		arr[0] = 100;
		System.out.println(arr[0]);
		
		int[] arr1 = new int[4];
		arr1[0] = 10;
		System.out.println(arr1[0]);
	}

}
