package org.zerock.controller.p05controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.mapper.p05mapper.Mapper02;

import lombok.Setter;

@Controller
@RequestMapping("/cont11")
public class Controller11 {

	@Setter(onMethod_ = @Autowired)
	private Mapper02 mapper;
	
	@RequestMapping("/met01")
	public void method01(Integer id) {
		String name = mapper.getLastNameById(id);
		System.out.println(name);
	}
	
	@RequestMapping("/met02")
	public void method02(Integer id) {
		String customerName = mapper.getCustomerNameById(id);
		
		System.out.println(customerName);
	}
	
	// /cont11/met03?category=condiments
	@RequestMapping("/met03")
	public void method03(String category) {
		List<String> productNames = mapper.getProductNamesByCategory(category);
		
		for (String p : productNames) {
			System.out.println(p);
		}
	}
}



























