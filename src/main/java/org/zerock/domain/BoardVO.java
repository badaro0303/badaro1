package org.zerock.domain;

import java.util.Date; // date ������ �������� ���� ���

import lombok.Data;

@Data
public class BoardVO {

	private long p_turn;	// 게시글 번호
	private String p_beach;	// 카테고리
	private String p_title;	// 게시글 제목
	private int p_rating;	// 게시글 별점
	private String p_content;	// 게시글 내용
	private String p_user;	// 게시글 작성자
	private Date p_date;	// 게시글 작성 일자
	private int p_count;	// 게시글 조회수
}
