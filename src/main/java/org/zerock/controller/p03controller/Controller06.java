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
}














