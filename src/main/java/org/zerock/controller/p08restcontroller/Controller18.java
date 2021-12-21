package org.zerock.controller.p08restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cont18")
public class Controller18 {

	@RequestMapping("/met01") 
	public String method01() {
		return "hello";
	}
	
	@RequestMapping(value = "/met02", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
	public String method02() {
		return "hello";
	}
	
	@RequestMapping(value = "/met03", method = {RequestMethod.GET, RequestMethod.POST}) 
	public String method03() {
		return "hello";
	}
	
	@RequestMapping(value = "/met04", method = RequestMethod.GET)
	public String method04() {
		return "hello";
	}
}













