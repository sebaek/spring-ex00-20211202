package org.zerock.mapper.p05mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {

	@Select("SELECT NOW()")
	public String getTime();
}
