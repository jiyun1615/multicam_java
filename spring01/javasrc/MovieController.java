package com.multi.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	
	//요청된 주소가 어떻게 될 때 
	//바로 아래에 있는 메서득 호출이 될지 써주어야 한다. 
	@RequestMapping("movie")
	public String movie(String movie) {
		System.out.println("영화 요청됨");
		System.out.println(movie);
		if(movie.equals("코미디")) {
			return "comic";
		}else if(movie.equals("드라마")){
			return "drama";
		}else if(movie.equals("액션")){
			return "action";
		}else {
			return "none";
		}
	}
}
