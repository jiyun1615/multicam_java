package 배열복습;

public class 이차원배열프린트2 {

	public static void main(String[] args) {
		String[][] s = {
				{"그랜드캐니언","오사카","바르셀로나"},
				{"케임브리지","바스","밴쿠버"},
				{"파리","스위스","코타키나발루"}
		};
		
		for(int i=0; i<s.length; i++) {
			for(int j=0; j<s[i].length; j++) {
				System.out.print(s[i][j] + " ");
			}
			System.out.println();
		}

	}

}
