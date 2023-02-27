package Day0220;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//25305백준
public class day0223 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int k = sc.nextInt();
			int[] score = new int[N];
			for(int i=0; i<N; i++) {
				score[i] = sc.nextInt();
			}
			
			System.out.println(sorting(score, k));
	}
	
	public static int sorting(int[] scores, int k) {
		Integer[] sortedScores = Arrays.stream(scores).boxed().toArray(Integer[]::new);
		Arrays.sort(sortedScores, Collections.reverseOrder());
		int cutoffScore = sortedScores[k - 1];
		return cutoffScore;
	}
}
