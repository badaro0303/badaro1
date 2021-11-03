package org.zerock.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.SessionScope;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.MemberVO;
import org.zerock.service.MemberService;
import org.zerock.service.MemberServiceImpl;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/badaro/login")

public class LoginController {
	
    @Autowired
    private MemberServiceImpl memberServiceImpl;
	@Autowired
	private MemberService memberervice;
	
	@GetMapping("login")
	public void login() {
		log.info("");
	}
	
	@PostMapping("login")
	public String memberLogin(MemberVO memberVO, HttpServletRequest req, RedirectAttributes rttr) throws Exception {
		
        HttpSession session = req.getSession();
        
        MemberVO member = memberervice.memberLogin(memberVO);
        if(member == null) {
            session.setAttribute("member", null);
            rttr.addFlashAttribute("msg", false);
        } else {
            session.setAttribute("member", member);
        }
        
        return "redirect:/badaro/main/index";
	}
	
	
	@GetMapping("logout")
	public String logout() throws Exception {
		return "/badaro/login/logout";
	}

	
	
	
}
