package org.zerock.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.domain.CategoryVO;
import org.zerock.domain.Criteria;
import org.zerock.domain.PageDTO;
import org.zerock.service.BoardService;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import net.sf.json.JSONArray;

@Controller
@Log4j
@AllArgsConstructor
@RequestMapping("/badaro/board")

public class BoardController {
	
	private BoardService service;
	
	@GetMapping("boardList")
	public void boardList(Model model, Criteria cri)  {
		log.info("boardList");
		model.addAttribute("list", service.getList(cri));
		int total=service.getTotalCount(cri);
		model.addAttribute("pageMaker", new PageDTO(cri,total));
	}
	
	@GetMapping("register")
	public void register(Model model) throws Exception {
		
		log.info("register");
		 List<CategoryVO> category = null;
		 category = service.category();
		 model.addAttribute("category", JSONArray.fromObject(category));

	}
	
	@PostMapping("register")
	public String registerpost(BoardVO board,RedirectAttributes rttr) {
		log.info("insert �ϱ��� " + board);
		service.register(board);
		rttr.addAttribute("p_turn", board.getP_turn());
		return "redirect:/badaro/board/boardList";
	}
	
	@Transactional
	@GetMapping("read")
	public void read(long p_turn,Model model) {
		log.info("read="+ p_turn);
		model.addAttribute("p_count", service.updateCount(p_turn));
		model.addAttribute("read",service.get(p_turn));
	}
	 
	@GetMapping("modify")
	public void modifyGet(long p_turn,Model model){
		log.info("modify");
		model.addAttribute("modify",service.get(p_turn));
	}
	
	@PostMapping("modify")
	public String modifyPost(BoardVO board, RedirectAttributes rttr){
		log.info("modifyPost=" + board);
		service.modify(board);
		rttr.addAttribute("p_turn", board.getP_turn());
		return "redirect:/badaro/board/read";
	}
	
	@GetMapping("remove")
	public String remove(long p_turn){
		log.info("remove=" + p_turn);
		service.remove(p_turn);
		return "redirect:/badaro/board/boardList";
	}
	
}
