package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.MemberVO;
import org.zerock.service.MemberService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;



@Controller
@Log4j
@AllArgsConstructor
@RequestMapping("/badaro/join")

public class JoinController {
	private MemberService service;
	
	@GetMapping("join")
	public void join() {
		log.info("");
	}
	
	@PostMapping("join")
	public String registerpost(MemberVO member, RedirectAttributes rttr) {
			log.info("insert  " + member);
			service.join(member);
			rttr.addAttribute("id", member.getId());
			return "redirect:/badaro/login/login";		
	}
}
	
