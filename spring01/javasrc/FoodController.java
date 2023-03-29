package com.multi.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FoodController {
	
	//요청된 주소가 어떻게 될 때 
	//바로 아래에 있는 메서득 호출이 될지 써주어야 한다. 
	@RequestMapping("food")
	public String like(foodVO bag) {
		System.out.println("음식 기호 요청됨");
		System.out.println(bag.getLike());
		if(bag.getLike().equals("치킨")) {
			return "like";
		}else if(bag.getLike().equals("커피")){
			return "like2";
		}else if(bag.getLike().equals("아무거나")){
			return "taco";
		}else if(bag.getDislike().equals("마라탕")) {
			return "mara";
		}else {
			return "none";
		}
	}
}
