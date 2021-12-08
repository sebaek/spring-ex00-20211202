package org.zerock.controller.p05controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.mapper.p05mapper.Mapper01;

import lombok.Setter;

@Controller
@RequestMapping("/cont10")
public class Controller10 {
	
	@Setter(onMethod_ = @Autowired)
	private Mapper01 mapper;

	@RequestMapping("/met01")
	public void method01() {
		System.out.println(mapper.getSupplierOne());
	}
}














