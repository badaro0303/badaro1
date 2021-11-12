package org.zerock.service;

import java.util.List;

import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyPageDTO;
import org.zerock.domain.ReplyVO;

public interface ReplyService {
	// �뙎湲��벐湲�(insert) - Create
	public int register(ReplyVO vo);
	// �뙎湲��긽�꽭�럹�씠吏�(select) - Read
	// select�맂 寃곌낵媛� �븳 嫄댁씠�땲源� ReplyVO ���엯
	public ReplyVO get(int rno);
	// �뙎湲��궘�젣(delete) - Delete
	public int remove(int rno);
	// �뙎湲��닔�젙(update) - Update
	public int modify(ReplyVO vo);
	// �뙎湲�紐⑸줉由ъ뒪�듃(select�맂 寃곌낵媛� �뿬�윭 嫄댁씠�땲源� ArrayList ���엯)
	public ReplyPageDTO getList(Criteria cri, long p_turn);
}
