package org.zerock.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyPageDTO;
import org.zerock.domain.ReplyVO;
import org.zerock.service.ReplyService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@RestController
@Log4j
@RequestMapping("/replies")
@AllArgsConstructor
public class ReplyController {
	
	ReplyService service;
	
	@PostMapping(value="new",consumes="application/json",produces= {MediaType.TEXT_PLAIN_VALUE})
// �젒洹쇱젣�뼱�옄      由ы꽩���엯                                     硫붿냼�뱶紐�                                 蹂��닔���엯    蹂��닔紐�(留ㅺ컻蹂��닔)
	public ResponseEntity<String> create(@RequestBody ReplyVO vo){
		log.info("ReplyVO : "+vo);
		int insertcount = service.register(vo);
		log.info("Reply INSERT COUNT : "+insertcount);
		//(議곌굔�떇)     ? 李�        : 嫄곗쭞
		return insertcount==1?new ResponseEntity<>("success",HttpStatus.OK)
				             :new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}// �뙎湲��벐湲� �걹
	
	@GetMapping(value="pages/{p_turn}/{page}",produces= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<ReplyPageDTO> getList(@PathVariable(" p_turn") long p_turn, @PathVariable("page") int page){
		Criteria cri = new Criteria(page,10);
		
		log.info(cri);
		//                          select�맂 寃곌낵                                    �넻�떊�씠 �젙�긽�쟻�쑝濡� 泥섎━
		return new ResponseEntity<>(service.getList(cri, p_turn),HttpStatus.OK);
	}// �뙎湲� 紐⑸줉 由ъ뒪�듃 �걹
	
	@GetMapping(value="/{rno}",produces= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<ReplyVO> get(@PathVariable("rno") int rno){
		return new ResponseEntity<>(service.get(rno),HttpStatus.OK);
		
	}// �뙎湲� �긽�꽭 �럹�씠吏� �걹
	@DeleteMapping(value="/{rno}",produces= {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> remove(@PathVariable("rno") int rno){
		//int removecount = service.remove(rno);
		
		return service.remove(rno)==1?new ResponseEntity<>("success",HttpStatus.OK)
				                     :new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}// �뙎湲� �궘�젣 �걹
	@PutMapping(value="/{rno}",consumes="application/json",produces= {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> modify(@PathVariable("rno") int rno,
										 @RequestBody ReplyVO vo){
		vo.setRno(rno);
		//int removecount = service.remove(rno);
		
		return service.modify(vo)==1?new ResponseEntity<>("success",HttpStatus.OK)
				                     :new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}// �뙎湲� �닔�젙 �걹
	
	
	
	
	
}













