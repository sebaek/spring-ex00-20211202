package org.zerock.controller.p01controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.controller.p01controller.bean.Bean01;
import org.zerock.controller.p01controller.bean.Bean02;
import org.zerock.controller.p01controller.bean.Bean03;
import org.zerock.controller.p01controller.bean.Bean04;

@Controller
@RequestMapping("/cont04")
public class Controller04 {

	@RequestMapping("/met01")
	public void method01(String name, String city) {
		System.out.println(name);
		System.out.println(city);
	}
	
	@RequestMapping("/met02")
	public void method02(HttpServletRequest request) {
		
		// 2. request 분석/가공
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		
		Bean01 bean = new Bean01();
		bean.setName(name);
		bean.setCity(city);
		
		System.out.println(bean); // 잘 들어왔는지 확인
		
		// 3. business logic
		
		// 4. add attributes
		
		// 5. forward / redirect
	}
	
	@RequestMapping("/met03")
	public void method03(Bean01 bean) {
		
		System.out.println(bean); // 잘 들어왔는지 확인
	}
	
	// /cont04/met04?country=usa&phone=0109999&address=seoul&email=usa@seoul.com
	@RequestMapping("/met04")
	public void method04(Bean02 bean) {
		
		System.out.println(bean); // 각 프로퍼티가 null이 아니도록 요청 해보세요.
	}
	
	// /cont04/met05?name=john&age=33
	@RequestMapping("/met05")
	public void method04(Bean03 bean) {
		System.out.println(bean);
	}
	
	@RequestMapping("/met06")
	public void method05(Bean04 bean) {
		System.out.println(bean); // 각 프로터피가 0이 아니도록 요청
	}
}


































