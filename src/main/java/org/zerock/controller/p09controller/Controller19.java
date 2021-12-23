package org.zerock.controller.p09controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/cont19")
public class Controller19 {

	@RequestMapping("/met01")
	public String method01(String name, String age, MultipartFile file1) {
		
		System.out.println(name);
		System.out.println(age);
		
		if (file1 != null) {
			System.out.println(file1.getOriginalFilename());
		}
		
		return null;
	}
}
