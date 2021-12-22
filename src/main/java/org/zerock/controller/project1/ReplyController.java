package org.zerock.controller.project1;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.domain.project1.MemberVO;
import org.zerock.domain.project1.ReplyVO;
import org.zerock.service.project1.ReplyService;

import lombok.Setter;

@RestController
@RequestMapping("/reply")
public class ReplyController {
	
	@Setter(onMethod_ = @Autowired)
	private ReplyService service;

	@GetMapping("/board/{boardId}")
	public List<ReplyVO> list(@PathVariable Integer boardId, HttpSession session) {
		MemberVO loggedIn = (MemberVO) session.getAttribute("loggedInMember");
		
		List<ReplyVO> list = service.list(boardId);
		
		System.out.println("board/boardid : " + loggedIn);
		if (loggedIn != null) {
			for (ReplyVO reply : list) {
				String writerId = reply.getMemberId();
				reply.setOwn(loggedIn.getId().equals(writerId));
			}
		}
		
		return list;
	}
	
	@PostMapping("/write")
	public ReplyVO write(ReplyVO reply) {
		
		service.insert(reply);
		
		return null;
	}
	
	@PutMapping("/{id}")
	public ReplyVO modify(@PathVariable Integer id, @RequestParam("reply") String reply) {
		System.out.println(id);
		System.out.println(reply);

		return null;
	}
}














