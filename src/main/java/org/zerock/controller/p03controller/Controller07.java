package org.zerock.controller.p03controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/cont07")
public class Controller07 {

	@RequestMapping("/met01")
	public String method01(RedirectAttributes rttr) {
		System.out.println("cont07 met01 일함!");
		
		rttr.addAttribute("name", "donald");
		rttr.addAttribute("address", "ny");
		
//		return "redirect:/cont07/met02?name=john";
		return "redirect:/cont07/met02";
	}

	@RequestMapping("/met02")
	public void method02() {
		System.out.println("cont07 met02 일함@@");
	}
	
	// 첫번째 요청 주소 : /cont07/met03
	// 위의 요청의 응답 : redirect:/cont07/met04
	// 응답시 쿼리 스트링 ?id=99&city=seoul&country=korea
	
	// 메소드 method03 작성
	
	@RequestMapping("/met03")
	public String method03(RedirectAttributes rttr) {
		rttr.addAttribute("id", 99);
		rttr.addAttribute("city", "seoul");
		rttr.addAttribute("country", "korea");
		
		return "redirect:/cont07/met04";
	}
	
	
}




