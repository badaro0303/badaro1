package org.zerock.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.domain.CategoryVO;
import org.zerock.domain.Criteria;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service // 占쏙옙占쏙옙絿占쏙옙占쏙옙占쏙옙占쏙옙占� 占쏙옙占�
@AllArgsConstructor
public class BoardServiceImpl implements BoardService{ // 鍮꾩쫰�땲�뒪�쁺�뿭
	
	private BoardMapper mapper;

@Override
public void register(BoardVO board) {
	log.info("register......" + board);
	
	mapper.insertSelectKey(board);	
	
}

@Override
public BoardVO get(long p_turn) {
	log.info("get....." + p_turn);
	
	return mapper.read(p_turn);
}

@Override
public boolean modify(BoardVO board) {
	
	log.info("modify....." + board);
	
	return mapper.update(board)==1;
}

@Override
public boolean remove(long p_turn) {
	log.info("remove....." + p_turn);
	
	return mapper.delete(p_turn)==1;
}

@Override
public List<BoardVO> getList(Criteria cri) {
	log.info("getList.....");
	
	return mapper.getListWithPaging(cri);
}

@Override
public int getTotalCount(Criteria cri) {
	return mapper.getTotalCount(cri);
}

@Override
public int updateCount(long p_turn) {

	return mapper.updateCount(p_turn);
}

/* 카테고리 리스트 */
@Override
public List<CategoryVO> category() {
	
	log.info("(service)cateList........");
	
	return mapper.category();
}


	
}
