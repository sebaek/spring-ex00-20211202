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
		String name = mapper.getCustomerName();
		
		model.addAttribute("name", name);
	}
}













