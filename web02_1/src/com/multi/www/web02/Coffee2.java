package com.multi.www.web02;

public class Coffee2 {
	String name;
	int price;
	
	public static Coffee2 coffee;
	
	public static Coffee2 getInstance() {
		if(coffee == null) {
			coffee = new Coffee2("카페라떼", 5000);
		}
		return coffee;
	}
	
	private Coffee2(String name, int price) {
		this.name = name;
		this.price = price;
	}
}
