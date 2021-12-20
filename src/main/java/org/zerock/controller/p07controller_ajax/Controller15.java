package org.zerock.controller.p07controller_ajax;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/cont15")
public class Controller15 {
	
	@RequestMapping("/met01")
	@ResponseBody
	public String method01() {
		System.out.println("cont15 met01 일함.");
		
		return "hello";
	}
	
	@RequestMapping("/met02")
	public ResponseEntity<String> method02() {
		System.out.println("cont15 met02 일함");
		
		ResponseEntity<String> result = new ResponseEntity<String>(HttpStatus.OK);
	
		return result;
	}
	
	@RequestMapping("/met03")
	public ResponseEntity<String> method03() {
		// 항상 403 FORBIDDEN 응답 되도록 작성
		
		return null;
	}

}













