package org.zerock.mapper.p05mapper;

import org.apache.ibatis.annotations.Param;

public interface Mapper03 {

	public int insertCustomer(@Param("customerName") String customerName,
			@Param("contactName") String contactName);
}
