package com.multi.mvc01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 스프링에서 제어하는 역할로 등록
public class BbsController {
	// 컨트롤 하는 기능(CRUD)
	// 회원가입, 수정, 탈퇴, 정보검색

	// 클래스 내에서 기능처리 담당
	// 멤버변수 + 멤버 메서드(기능처리 담당)
	// 하나의 요청당 하나의 메서드
	// 하나의 버튼 호출당 하나의 함수 연결!

	//싱글톤 갖다 쓰기
	@Autowired
	BBSDAO3 dao;

	// 요청된 주소가 어떻게 될 때
	// 바로 아래에 있는 메서득 호출이 될지 써주어야 한다.
	@RequestMapping("insert2")
	public void insert(BbsVO bag) {
		System.out.println("insert 요청됨");
		System.out.println(bag);

		dao.insert(bag);
	}

	@RequestMapping("update2")
	public void update(BbsVO bag) {
		System.out.println("update 요청됨");
		System.out.println(bag);

		dao.update(bag);
	}

	@RequestMapping("delete2")
	public void delete(int no) {
		System.out.println("delete 요청됨");
		System.out.println(no);

		dao.delete(no);
	}

	@RequestMapping("one2")
	public void one(int no, Model model) {
		System.out.println("one 요청됨");
		System.out.println(no);
		
		BbsVO bag = dao.one(no);
		//views 아래 one.jsp로 쓸 수 있도록 설정
		model.addAttribute("bag", bag);	
	}

	@RequestMapping("list2.multi")
	public void list() {
		System.out.println("");
		System.out.println();
	}

}
