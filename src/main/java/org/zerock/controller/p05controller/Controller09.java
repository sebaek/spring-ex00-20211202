package org.zerock.controller.p05controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.mapper.p05mapper.TimeMapper;

import lombok.Setter;

@Controller
@RequestMapping("/cont09")
public class Controller09 {
	
	@Setter(onMethod_ = @Autowired)
	private TimeMapper mapper;

	@RequestMapping("/met01")
	public void method01() {
		String time = mapper.getTime();
		
		System.out.println(time);
	}
	
	@RequestMapping("/met02")
	public void method02() {
		String name = mapper.getCustomerName();
		
		System.out.println(name);
	}
	
	@RequestMapping("/met03")
	public void method03(Model model) {
		
		// 3. business logic
		String name = mapper.getCustomerName();
		
		// 4. add attribute
		model.addAttribute("name", name);
	}
	
	// 요청 경로 : /cont09/met04
	// 실행 쿼리 : SELECT LastName FROM Employees WHERE EmployeeID = 1
	// 뷰 : /cont09/met04.jsp 에 LastName 출력
	
	// 작성할 메소드 Controller09#method04
	//              TimeMapper#getLastName();
	
	@RequestMapping("/met04")
	public void method04(Model model) {
		model.addAttribute("lastName", mapper.getLastName());
	}
	
	@RequestMapping("/met05")
	public void method05(Integer id) {
		String name = mapper.getCustomerNameById(id);
		
		System.out.println(name);
	}

}













