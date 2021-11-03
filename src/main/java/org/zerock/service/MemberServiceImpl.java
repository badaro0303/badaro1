package org.zerock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.zerock.domain.MemberVO;
import org.zerock.mapper.MemberMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
@Log4j
@Service
@AllArgsConstructor
public class MemberServiceImpl implements MemberService {
	
	private MemberMapper mapper;

	@Override
	public void join(MemberVO member) {
		log.info("register......" + member);
		
		mapper.insert(member);	
		
	}
	
	
	public List<MemberVO> getList() {
		
		log.info("getList.....");
		return mapper.getList();
	}


	@Override
	public MemberVO memberLogin(MemberVO memberVO) throws Exception {
		return mapper.memberLogin(memberVO);

	
	}











}
