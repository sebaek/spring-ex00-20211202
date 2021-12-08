package org.zerock.mapper.p05mapper;

import java.util.List;

public interface Mapper02 {

	String getLastNameById(Integer id);

	String getCustomerNameById(Integer id);

	List<String> getProductNamesByCategory(String category);

}
