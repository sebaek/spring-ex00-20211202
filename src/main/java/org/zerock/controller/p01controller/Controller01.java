package org.zerock.controller.p01controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cont01")
public class Controller01 {

	@RequestMapping("/met01")
	public void method01() {
		System.out.println("메소드01 일함");
	}
	
	// "/cont01/met02" 요청이 왔을 때 일하는 메소드(method02)를 작성하세요. return : void
	
}
