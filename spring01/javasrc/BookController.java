package com.multi.mvc01;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class BookController {
	@Autowired
	BookDAO dao;

	// 요청된 주소가 어떻게 될 때
	// 바로 아래에 있는 메서득 호출이 될지 써주어야 한다.
	@RequestMapping("insert3.multi")
	public void insert(BookDTO bag) {
		System.out.println("insert 요청됨");
		System.out.println(bag);

		dao.insert(bag);
	}
	
	@RequestMapping("delete3.multi")
	public void delete(int id) {
		System.out.println("delete 요청됨");
		System.out.println(id);

		dao.delete(id);
	}
	
	@RequestMapping("one3.multi")
	public void one(int id, Model model) {
		System.out.println("검색 요청됨");
		System.out.println(id);

		BookDTO bag = dao.one(id);
		//views 아래 one.jsp로 쓸 수 있도록 설정
		model.addAttribute("bag", bag);		
	}
	
	@RequestMapping("list3.multi")
	public void list(Model model) {
		System.out.println("불러오기 요청됨");

		ArrayList<BookDTO> lists = dao.list();
		//views 아래 one.jsp로 쓸 수 있도록 설정
		model.addAttribute("list", lists);		
	}
}
