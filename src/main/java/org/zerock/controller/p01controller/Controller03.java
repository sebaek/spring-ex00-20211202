package org.zerock.controller.p01controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cont03")
public class Controller03 {
	
	@RequestMapping("/met01")
	public void method01(HttpServletRequest request) {
		System.out.println("메소드 01 일함");
		
		// 2. request 분석/ 가공
		String name = request.getParameter("name");
		String ageStr = request.getParameter("age");
		int age = Integer.parseInt(ageStr);
		
		// 3.
		System.out.println(name);
		System.out.println(age);
	}
	
	@RequestMapping("/met02")
	public void method02(String name, Integer age) {
		System.out.println("메소드 02 일함");
		System.out.println(name);
		System.out.println(age);
	}
}











