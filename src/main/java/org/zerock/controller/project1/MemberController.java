package org.zerock.controller.project1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.project1.MemberVO;
import org.zerock.service.project1.MemberService;

import lombok.Setter;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Setter(onMethod_ = @Autowired)
	private MemberService service;

	@GetMapping("/signup")
	public void signup() {
		
	}
	
	@PostMapping("/signup")
	public String signup(@ModelAttribute("member") MemberVO member, RedirectAttributes rttr, Model model) {
		MemberVO m = service.read(member.getId());
				
		if (m == null) {
			boolean ok = service.register(member);
			
			if (ok) {
				rttr.addFlashAttribute("result", "회원가입이 완료되었습니다.");
				return "redirect:/board/list";
			} else {
				return "redirect:/member/signup";
			}
		} else {
			model.addAttribute("alertMessage", "중복된 아이디 입니다.");
			return null;
		}
		
	}
	
	@GetMapping("/login")
	public void login() {
		
	}
	
	@PostMapping("/login")
	public void login(String id, String password) {
		// service 사용해서 아이디로 멤버vo 얻고
		MemberVO vo = service.read(id);
		
		if (vo == null) {
			// 로그인 실패
		}
		
		
		// 얻어온 멤버vo의 패스워드와 입력한 패스워드가 같은 지 확인
		boolean correctPassword = password.equals(vo.getPassword());
		
		// 멤버vo가 널이거나 패스워드가 다르면 로그인 실패
		if (!correctPassword) {
			// 로그인 실패
		}
		
		// 멤버vo가 널이 아니고 패스워드가 일치하면 로그인 성공
		// 로그인 성공
	}
}









