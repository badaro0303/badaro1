package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.MemberVO;
import org.zerock.mapper.MemberMapper;

@Service
public interface MemberService{
	

	// 회원가입
	public void join(MemberVO member);
	// 로그인
	public MemberVO memberLogin(MemberVO memberVO) throws Exception;

	// 회원 목록 리스트
	public List<MemberVO> getList();
	
		
	
	



}
