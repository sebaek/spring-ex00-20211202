package org.zerock.controller.p03controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cont06")
public class Controller06 {

	@RequestMapping("/met01")
	public void method01(HttpServletRequest request) {
		request.setAttribute("myatt12", "hello world");
	}

	@RequestMapping("/met02")
	public void method02(Model model) {
		// 4. add attribute
		model.addAttribute("myattr1", "myvalue1");
		
		// 5
	}
	
	// 할일 : 요청 경로 : /cont06/met03 
	//        view name : /cont06/met03 
	//        view에서 사용하는 attribute 명 : "myattr2"
	//                          myattr2의 값 : "myvalue2"
	// 가 되도록 method03 작성
	// 또한 view도 작성해서 myattr2가 myvalue2를 출력하는 확인
	
	@RequestMapping("/met03")
	public void method03(Model model) {
		
		model.addAttribute("myattr2", "myvalue2");
		
	}
	
	
	
}




























