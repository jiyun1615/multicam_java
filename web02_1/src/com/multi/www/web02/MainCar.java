package com.multi.www.web02;

public class MainCar {

	public static void main(String[] args) {
		Car car = new Car("red", 10, 200);//12
		Car car1 = new Car("blue", 20, 100);//12
		Car car2 = new Car("black", 100, 300);//12 매번 12byte의 공간을 필요로 함
		System.out.println(car.toString());
		
		
		
		for(int i=0; i<1000; i++) {
			car = new Car("빨강" + i, 10, 200);
			System.out.println(car);
		}
		System.out.println("메모리 크기 >>" + 1000*12);
		
	}

}
