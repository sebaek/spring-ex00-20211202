package org.zerock.controller.p01controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.controller.p01controller.bean.Bean01;
import org.zerock.controller.p01controller.bean.Bean02;
import org.zerock.controller.p01controller.bean.Bean03;
import org.zerock.controller.p01controller.bean.Bean04;
import org.zerock.controller.p01controller.bean.Bean05;
import org.zerock.controller.p01controller.bean.Bean06;

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
	public void method05(Bean03 bean) {
		System.out.println(bean);
	}
	
	// /cont04/met06?id=99&score=99.99
	@RequestMapping("/met06")
	public void method06(Bean04 bean) {
		System.out.println(bean); // 각 프로퍼티가 0이 아니도록 요청
	}
	
	// /cont04/met07?tel=010&tel=011&tel=012
	@RequestMapping("/met07")
	public void method07(@RequestParam("tel") ArrayList<String> tel) {
		System.out.println(tel);
	}
	
	// /cont04/met08?name=john&tel=010&tel011
	@RequestMapping("/met08")
	public void method08(Bean05 bean) {
		System.out.println(bean);
	}
	
	
	@RequestMapping("/met09")
	public void method09(Bean06 bean) {
		System.out.println(bean); // 모든 프로퍼티에 값이 들어가도록 요청
	}
}


































