package org.zerock.controller.p04controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.Setter;

@Controller
@RequestMapping("/cont08")
public class Controller08 {

	@Setter(onMethod_ = @Autowired)
	private DataSource dataSource;
	
	@RequestMapping("/met01")
	public void method01() {
		System.out.println(dataSource);
	}
}
