package org.zerock.controller.project1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.project1.BoardVO;
import org.zerock.service.project1.BoardService;

import lombok.Setter;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Setter(onMethod_ = @Autowired)
	private BoardService service;

	@RequestMapping("/list")
	public void list(Model model) {
		// 3. business logic
		// 게시물(Board) 목록 조회
		List<BoardVO> list = service.getList();
	
		// 4. add attribute
		model.addAttribute("list", list);
		
		// 5. forward / redirect
		// jsp path : /WEB-INF/views/board/list.jsp
	}
}







