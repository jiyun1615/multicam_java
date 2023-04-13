package 배열;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 정리문제 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("#1 " + min);
		
		//2
		Random r = new Random();
		int[] arr2 = new int[20];
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = r.nextInt(900);
		}
		int max = arr2[0];
		for(int i=0; i<arr2.length; i++) {
			if(max < arr2[i]) {
				max = arr2[i];
			}
		}
		System.out.println("#2 " + max);
		
		
		
		//3
		String s1 = "참좋다";
		String s2 = "진짜좋다";
		System.out.println("#3	");
		if(s1.equals(s2) == true) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		if(s1.length() > s2.length()) {
			System.out.println("s1이 크다");
		}else {
			System.out.println("s2가 크다");
		}
		
		
		//4
		String s3 = "나는 진짜 java programmer가 되었어";
		String s33 = s3.substring(6, 21);
		System.out.println("#4 " + s33.toUpperCase());
		
		
		//5
		String s4 = "2056521";
		char c1 = s4.charAt(0);
		System.out.print("#5 ");
		if(c1 == '2') {
			System.out.println("여자");
		}else {
			System.out.println("남자");
		}
		
		//6
		String s5 = "[10,20,30,40,50]";
		s5 = s5.replace("[", "");
		s5 = s5.replace("]", "");
		s5.trim();
		String[] a = s5.split(",");
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += Integer.parseInt(a[i]);
		}
		System.out.println("#6 " + sum);
		
		//7
		int[] arr7 = new int[a.length];
		for(int i=0; i<a.length; i++) {
			arr7[i] = Integer.parseInt(a[i]);
		}
		
		Arrays.sort(arr7);
		System.out.print("#7 ");
		for(int i=0; i<arr7.length; i++) {
			System.out.print(arr7[i] + " ");
		}
	}

}
