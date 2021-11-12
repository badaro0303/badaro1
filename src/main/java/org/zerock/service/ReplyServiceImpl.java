package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyPageDTO;
import org.zerock.domain.ReplyVO;
import org.zerock.mapper.BoardMapper;
import org.zerock.mapper.ReplyMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
@Service
@Log4j
@AllArgsConstructor
public class ReplyServiceImpl implements ReplyService {
	private ReplyMapper mapper;
	private BoardMapper boardmapper;
	// �뙎湲� �벐湲�
	@Transactional
	@Override
	public int register(ReplyVO vo) {
		log.info("register...."+vo);
		boardmapper.updateReplyCnt(vo.getP_turn(), 1);
		return mapper.insert(vo);
	}
	// �뙎湲��긽�꽭�럹�씠吏�(select�맂 寃곌낵媛� �븳 嫄댁씠�땲源� ReplyVO ���엯)
	@Override
	public ReplyVO get(int rno) {
		log.info("get...."+rno);
		return mapper.read(rno);
	}
	//�뙎湲��궘�젣
	@Transactional
	@Override
	public int remove(int rno) {
		log.info("remove....."+rno);
		ReplyVO vo=mapper.read(rno);
		boardmapper.updateReplyCnt(vo.getP_turn(), -1);
		return mapper.delete(rno);
	}
	// �뙎湲��닔�젙
	@Override
	public int modify(ReplyVO vo) {
		log.info(vo);
		return mapper.update(vo);
	}
	// �뙎湲�紐⑸줉由ъ뒪�듃(select�맂 寃곌낵媛� �뿬�윭 嫄댁씠�땲源� ArrayList ���엯)
	@Override
	public ReplyPageDTO getList(Criteria cri, long p_turn) {
		log.info("get Reply List of a Board : "+ p_turn);
		return new ReplyPageDTO(mapper.getCountByP_turn( p_turn),
								mapper.getListWithPaging(cri,  p_turn));
	}
}
