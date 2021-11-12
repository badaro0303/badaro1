package org.zerock.domain;

import java.util.Date;

import lombok.Data;

@Data
public class ReplyVO {
	// �뙎湲�踰덊샇
	private int rno;
	// 寃뚯떆�뙋踰덊샇
	private long p_turn;
	// �뙎湲��궡�슜
	private String reply;
	// �뙎湲��옉�꽦�옄
	private String replyer;
	// �뙎湲��옉�꽦�씪
	private Date replydate;
	// �뙎湲��닔�젙�씪
	private Date updatedate;
}
