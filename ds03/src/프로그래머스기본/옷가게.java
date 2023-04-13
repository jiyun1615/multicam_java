package 프로그래머스기본;

import java.util.Scanner;

public class 옷가게 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int price = sc.nextInt();
		if(price >= 500000){
        	System.out.println(20);
            price -= price * 0.2;
        }else if(price >= 300000){
            price -= price * 0.1;
            System.out.println(10);
        }else if(price >= 100000){
            price -= price * 0.05;
            System.out.println(5);
        }
		
		System.out.println(price);
	}

}
