package org.zerock.controller.p02controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cont05")
public class Controller05 {
	// request handler method return values
	
	@RequestMapping("/met01")
	public String method01(HttpServletRequest request) {
		// 2. request 분석/가공
		
		// 3. business 로직
		
		// 4. add attribute
		
		// 5. forward / redirect
		/* servlet / jsp 사용할 때 */
//		String path = "/WEB-INF/view/view01.jsp";
//		request.getRequestDispatcher(path).forward(request, response);
		
		return "view01";
	}
}









