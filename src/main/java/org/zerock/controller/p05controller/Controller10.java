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
	
	@RequestMapping("/met02")
	public void method02() {
		// SELECT LastName, FirstName FROM Employees WHERE EmployeeID = 3
		// Mapper01.java에 getEmployeeNameOne 메소드 작성
		//                                   위 메소드 리턴 타입 Bean09 사용
		// Mapper01.xml 에 새 <select> 요소 작성
		
		// 이 메소드에서 getEmployeeNameOne 메소드 실행 결과(Bean09) 출력
	}
}














