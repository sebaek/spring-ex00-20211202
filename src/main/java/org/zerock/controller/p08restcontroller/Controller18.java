package org.zerock.controller.p08restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cont18")
public class Controller18 {

	@RequestMapping("/met01")
	public String method01() {
		return "hello";
	}
}
