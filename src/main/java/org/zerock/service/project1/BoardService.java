package org.zerock.service.project1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.mapper.project1.BoardMapper;

import lombok.Setter;

@Service
public class BoardService {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	
}
