package com.multi.www.web02;

public class Car {
	//멤버변수
	String color;
	int price;
	int speed;
	
	//멤버메서드
	//객체 생성 시 멤버변수 값을 한꺼번에 -> 생성자 메서드
	public Car(String color, int price, int speed) {
		this.color = color;
		this.price = price;
		this.speed = speed;
	}

	//toString()
	@Override
	public String toString() {
		return "Car [color=" + color + ", price=" + price + ", speed=" + speed + "]";
	}
	
}
