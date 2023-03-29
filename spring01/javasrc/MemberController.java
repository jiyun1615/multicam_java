package com.multi.mvc01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 	//스프링에서 제어하는 역할로 등록
public class MemberController {
	// 컨트롤 하는 기능(CRUD)
	// 회원가입, 수정, 탈퇴, 정보검색
	
	// 클래스 내에서 기능처리 담당
	// 멤버변수 + 멤버 메서드(기능처리 담당)
	// 하나의 요청당 하나의 메서드
	// 하나의 버튼 호출당 하나의 함수 연결!
	
	@Autowired
	MemberDAO2 dao;
	
	//요청된 주소가 어떻게 될 때 
	//바로 아래에 있는 메서득 호출이 될지 써주어야 한다. 
	@RequestMapping("insert")
	public void insert(MemberVO bag) {
		System.out.println("insert 요청됨");
		System.out.println(bag);
		
		dao.insert(bag);
	}
	@RequestMapping("update")
	public void update(MemberVO bag) {
		System.out.println("update 요청됨");
		System.out.println(bag);
		dao.update(bag);
	}
	@RequestMapping("delete")
	public void delete(String id) {
		System.out.println("delete 요청됨");
		System.out.println(id);
		
		dao.delete(id);
	}
	@RequestMapping("one")
	public void one(String id) {
		System.out.println("one 요청됨");
		System.out.println(id);
		
		dao.one(id);
	}
	@RequestMapping("list.multi")
	public void list() {
		System.out.println("");
		System.out.println();
	}
	
	@RequestMapping("login")
	public String login(MemberVO bag) {
		System.out.println("login 요청됨");
		System.out.println(bag);
		//views 아래 login.jsp 호툴
		
		int result = dao.login(bag);
		if(result == 1) {
			return "ok";	//view의 ok.jsp로 이동
		}
		else {
			return "no";	//view의 no.jsp로 이동
		}
	}
}
