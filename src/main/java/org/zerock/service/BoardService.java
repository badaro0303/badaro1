package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.CategoryVO;
import org.zerock.domain.Criteria;

public interface BoardService { // ����Ͻ� ����
	// �Խ��� �۾���
	public void register(BoardVO board);
	
	// �Խ��� ��������
	public BoardVO get(long p_turn);
	
	// �Խ��� �ۼ���
	public boolean modify(BoardVO board);
	
	// �Խ��� �ۻ���
	public boolean remove(long p_turn);
	
	// �Խ��� ��ϸ���Ʈ 페이징 처리 안된거
	//public List<BoardVO> getList();
	
	public List<BoardVO> getList(Criteria cri);
	
	public int getTotalCount(Criteria cri);
	
	public int updateCount(long p_turn);
	
	/* 카테고리 리스트 */
	public List<CategoryVO> category();
}
