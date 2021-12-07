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
}




