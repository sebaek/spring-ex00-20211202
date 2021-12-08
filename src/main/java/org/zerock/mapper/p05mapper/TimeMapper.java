package org.zerock.mapper.p05mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.zerock.controller.p05controller.bean.Bean09;
import org.zerock.controller.p05controller.bean.Bean10;
import org.zerock.controller.p05controller.bean.Bean11;
import org.zerock.controller.p05controller.bean.Bean12;

public interface TimeMapper {

	@Select("SELECT NOW()")
	public String getTime();
	
	@Select("SELECT CustomerName FROM Customers WHERE CustomerID = 1")
	public String getCustomerName();
	
	@Select("SELECT LastName FROM Employees WHERE EmployeeID = 1")
	public String getLastName();
	
	@Select("SELECT CustomerName FROM Customers WHERE CustomerID = #{id}")
	public String getCustomerNameById(Integer id);

	@Select("SELECT LastName FROM Employees WHERE EmployeeID = #{id}")
	public String getLastNameById(Integer id);

	@Select("SELECT CustomerName FROM Customers")
	public List<String> getCustomerNames();
	
	// 직원 테이블의 LastName 들을 조회하는 쿼리를 실행하는 메소드(getLastNames) 작성
	@Select("SELECT LastName FROM Employees")
	public List<String> getLastNames();
	
	@Select("SELECT EmployeeID, LastName, FirstName FROM Employees WHERE EmployeeID = 1")
	public Bean09 getEmployeeName();
	
	@Select("SELECT customerName, contactName FROM Customers WHERE CustomerID = 1")
	public Bean10 getName();
	
	@Select("SELECT customerID AS id, customerName FROM Customers WHERE CustomerID = 1")
	public Bean11 getCustomerInfo();
	
	@Select("SELECT EmployeeID, LastName, FirstName FROM Employees WHERE EmployeeID = 2")
	public Bean12 getEmployeeInfo();
}









