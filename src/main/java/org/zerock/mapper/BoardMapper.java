package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.zerock.domain.BoardVO;
import org.zerock.domain.CategoryVO;
import org.zerock.domain.Criteria;

public interface BoardMapper {

	// @Select("select * from tbl_board where bno > 0")

	public List<BoardVO> getList();
	
	public List<BoardVO> getListWithPaging(Criteria cri);

	public void insert(BoardVO borad); 

	public void insertSelectKey(BoardVO borad); 

	public BoardVO read(Long p_turn); 

	public int delete(Long p_turn);

	public int update(BoardVO board);
	
	// bdr_post테이블의 전체 갯수
	public int getTotalCount(Criteria cri);
	// 죄회수 올리기
	public int updateCount(Long p_turn);
	
	public void updateReplyCnt(@Param("p_turn") long p_turn, @Param("amount") int amount);
	
	/* 카테고리 리스트 */
	public List<CategoryVO> category();
}
