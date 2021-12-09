package org.zerock.controller.p05controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.controller.p05controller.bean.Bean17;
import org.zerock.controller.p05controller.bean.Bean18;
import org.zerock.mapper.p05mapper.Mapper03;

import lombok.Setter;

@Controller
@RequestMapping("/cont12")
public class Controller12 {
	
	@Setter(onMethod_ = @Autowired)
	private Mapper03 mapper;
	
	@RequestMapping("/met01")
	public void method01() {
		String customerName = "ironman";
		String contactName = "tony";
		
		int cnt = mapper.insertCustomer(customerName, contactName);
		System.out.println(cnt);
	}
	
	@RequestMapping("/met02")
	public void method02() {
		String supplierName = "captain";
		String contactName = "steve";
		
		int cnt = mapper.insertSupplier(supplierName, contactName);
		System.out.println(cnt);
		
	}
	
	@RequestMapping("/met03")
	public void method03() {
		// 2. request 분석/가공
		Bean17 bean = new Bean17();
		bean.setContactName("peter");
		bean.setCustomerName("spiderman");
		bean.setAddress("queens");
		bean.setCity("ny");
		bean.setPostalCode("2222");
		bean.setCountry("usa");
		
		// 3. business logic
		mapper.insertCustomer2(bean);
		
	}
	
	@RequestMapping("/met04")
	public void method04() {
		// 2. bean작성 (Bean18)
		Bean18 bean = new Bean18();
		bean.setAddress("seoul");
		bean.setCity("busan");
		bean.setCountry("korea");
		bean.setPostalCode("1111");
		bean.setPhone("00000");
		bean.setContactName("donald");
		bean.setSupplierName("trump");
		
		
		// 3. mapper 실행
		mapper.insertSupplier2(bean);
		
	}
	
	
}











