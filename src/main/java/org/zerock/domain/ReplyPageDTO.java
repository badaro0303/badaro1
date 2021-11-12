package org.zerock.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
@Data
@AllArgsConstructor
@Getter
public class ReplyPageDTO {
	// tbl_reply�뀒�씠釉붿쓽 �빐�떦 寃뚯떆臾� �쟾泥� 嫄댁닔
	private int replyCnt;
	// tbl_reply�뀒�씠釉붿쓽 �빐�떦 寃뚯떆臾쇱쓽 紐⑸줉 由ъ뒪�듃
	private List<ReplyVO> list;
}
