package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.service.MemberService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@AllArgsConstructor
@RequestMapping("/badaro/admin")

public class AdminController {
	private MemberService service;
	
	@GetMapping("main")
	public void admin() {
		log.info("");
	}
	
	@GetMapping("memberlist")
	public void boardList(Model model) {
		log.info("memberlist");
		model.addAttribute("list",service.getList());
	}
}
