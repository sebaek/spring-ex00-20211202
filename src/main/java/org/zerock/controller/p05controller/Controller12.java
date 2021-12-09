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
	
	
	@RequestMapping("/met05")
	public void method05() {
		// 2
		Bean17 bean = new Bean17();
		bean.setAddress("gangnam");
		bean.setCity("seoul");
		bean.setContactName("marvel");
		bean.setCustomerName("danvers");
		bean.setCountry("france");
		bean.setPostalCode("99999");
		
		// 3.
		// insert 하기 전 id
		System.out.println(bean.getId()); // null or 0
		
		mapper.insertCustomer3(bean);
		
		System.out.println(bean.getId()); // key
	}
	
	@RequestMapping("/met06") 
	public void method06() {
		// 2
		Bean18 bean = new Bean18();
		bean.setAddress("yeoksam");
		bean.setCity("incheon");
		bean.setContactName("deadpool");
		bean.setSupplierName("wade");
		bean.setCountry("uk");
		bean.setPostalCode("3333");
		bean.setPhone("111");
		
		// 3
		System.out.println(bean.getSupplierID()); // null or 0
		mapper.insertSupplier3(bean);
		System.out.println(bean.getSupplierID()); // key
	}
	
	
	@RequestMapping("/met07")
	public void method07() {
		// 2
		Bean17 bean = new Bean17();
		bean.setId(117);
		bean.setContactName("widow");
		bean.setCustomerName("nat");
		bean.setAddress("jongro");
		bean.setCity("dokdo");
		bean.setCountry("korea");
		bean.setPostalCode("77777");
		
		// 3
		int cnt = mapper.updateCustomer(bean);
		System.out.println(cnt);
	}
	
	@RequestMapping("/met08")
	public void method08() {
		Bean18 bean = new Bean18();
		bean.setSupplierID(45);
		bean.setAddress("gangnam");
		bean.setCity("busan");
		bean.setContactName("wolverine");
		bean.setCountry("canada");
		bean.setPhone("0000000");
		bean.setPostalCode("99999");
		bean.setSupplierName("logan");
		
		int cnt = mapper.updateSupplier(bean);
		
		
	}
	
	@RequestMapping("/met09")
	public void method09(Integer id) {
		int cnt = mapper.deleteCustomer(id);
	}
	
	// TODO : delete Supplier by id
	@RequestMapping("/met10")
	public void method10(Integer id) {
		int cnt = mapper.deleteSupplier(id);
	}
}














