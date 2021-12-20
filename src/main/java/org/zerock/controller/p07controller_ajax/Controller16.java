package org.zerock.controller.p07controller_ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.controller.p05controller.bean.Bean10;

@Controller
@RequestMapping("/cont16")
public class Controller16 {

	@RequestMapping("/met01")
	@ResponseBody
	public String method01() {
		
		return "hello this is data";
	}
	
	@RequestMapping("/met02")
	@ResponseBody
	public String method02() {
		Bean10 b = new Bean10();
		b.setContactName("donald");
		b.setCustomerName("trump");
		
		// "JavaScript Object Notation" : JSON 
		
		return "{ \"contactName\" : \"donald\", \"customerName\" : \"trump\" }";
	}
	
	@RequestMapping("/met03")
	@ResponseBody
	public Bean10 method03() {
		Bean10 b = new Bean10();
		b.setContactName("seoul");
		b.setCustomerName("jeju");
		
		return b;
	}
	
	
	// TODO : /met04 경로로 왔을 때 일하는 requeset handler method 작성
	// 리턴 타입 : org.zerock.controller.p05controller.bean.Bean12
	// id, lname, fname 속성을 표현한 json 텍스트로 리턴
	
}














