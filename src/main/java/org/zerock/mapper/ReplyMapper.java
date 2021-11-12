package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

public interface ReplyMapper {
	// �뙎湲��벐湲�(insert) - Create
	public int insert(ReplyVO vo);
	// �뙎湲��긽�꽭�럹�씠吏�(select) - Read
	// select�맂 寃곌낵媛� �븳 嫄댁씠�땲源� ReplyVO ���엯
	public ReplyVO read(int rno);
	// �뙎湲��궘�젣(delete) - Delete
	public int delete(int rno);
	// �뙎湲��닔�젙(update) - Update
	public int update(ReplyVO vo);
	// �뙎湲�紐⑸줉由ъ뒪�듃(select�맂 寃곌낵媛� �뿬�윭 嫄댁씠�땲源� ArrayList ���엯)
	public List<ReplyVO> getListWithPaging(@Param("cri") Criteria cri,
										   @Param("p_turn") long p_turn);
	public int getCountByP_turn(long p_turn);
}
